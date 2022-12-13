import './App.css'
import './Pages/Project.css'
import React from 'react'
import {useState,useEffect} from 'react'
import {BrowserRouter as Router,Routes,Route} from 'react-router-dom'
import axios from 'axios'

import Home from './Pages/Home';
import Navbar from './Pages/Navbar';
import Table from './Pages/Table';
import About from './Pages/About';
import Contact from './Pages/Contact'


const App=()=>{
  const baseURL ="http://localhost:8083/Customer"
const[post,setPost]=useState(null);
useEffect(()=>{
  axios.get(baseURL).then((response)=>{
    setPost(response.data);
  });
},[]);



const handleDelete=(id)=>{
  axios.delete('http://localhost:8083/Customer/$(id)')
  window.location.reload()
}



return(
  <>
  
   <Router>
     <Navbar/>
     <div className="Home">
     <Routes>
       <Route exact path='/' element={<Home/>} />
       <Route exact path='/About' element={<About/>} />
       <Route exact path='/Table' element={<Table post={post} handleDelete={handleDelete}/>}  />

       <Route exact path='/Contact'  element={<Contact/>} />
       
     </Routes>
     </div>
     
   </Router>
  </>
)
}

export default App
