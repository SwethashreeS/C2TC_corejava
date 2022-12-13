import React, {useState} from 'react'
import axios from 'axios'
import Popup from 'reactjs-popup'
import './Project.css'
const Table = ({post , handleDelete}) => {
    
    const[id,setid]=useState("");
    const[name,setName]=useState("");
    const[orderid,setOrderId]=useState("");
    const[phone,setPhone]=useState("");
    const[email,setEmail]=useState("");
    const handlePost = () =>{
     
      const data={
        id:id,
        name:name,
        orderid:orderid,
        phone:phone,
        email:email
      }
      axios.post(`http://localhost:8083/Customer`,data)
      .catch((err)=>console.log("Error",err))
    }
  
  return (
    <>
    <div id='form'>
        <div className="form">
        <h1 className="header">Add new data here</h1>
            <label htmlFor="name">Enter a id</label><br/>
            <input type="text" value={id} onChange={(e)=>setid(e.target.value)}/><br/>
            <label htmlFor="name">Enter name</label><br/>
            <input type="text" value={name} onChange={(e)=>setName(e.target.value)}/><br/>
             <label htmlFor="name">Enter orderid</label><br/>
            <input type="text" value={orderid} onChange={(e)=>setOrderId(e.target.value)}/><br/>
            <label htmlFor="name">Enter phone</label><br/>
            <input type="text" value={phone} onChange={(e)=>setPhone(e.target.value)}/><br/>
            <label htmlFor="name">Enter email</label><br/>
            <input type="text" value={email} onChange={(e)=>setEmail(e.target.value)}/><br/>
            <button className="btn btn-primary my-3" onClick={handlePost}>Add Data</button>
        </div>
    </div>
    <div>
        <h1 className='h1'>Data</h1>
        <table>
            <tbody>
              <div className="tablecontent">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>orderid</th>
                    <th>phone</th>
                    <th>email</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                
                {post && post.map((Post)=>(
                    <tr>
                        <td>{Post.id}</td>
                        <td>{Post.name}</td>
                        <td>{Post.orderid}</td>
                        <td>{Post.phone}</td>
                        <td>{Post.email}</td>
                          <td><Popup trigger={<button className="btn btn-primary">Edit</button>} position="right center">
                            <h4>Update Data Here</h4>
                                <label htmlFor="name">Enter a id</label><br/>
                                <input type="text" placeholder={Post.id}/><br/>
                                <label htmlFor="name">Enter a name</label><br/>
                                <input type="text" placeholder={Post.name}/><br/>
                                <label htmlFor="name">Enter orderid</label><br/>
                                <input type="text" placeholder={Post.orderid}/><br/>
                                <label htmlFor="name">Enter phone</label><br/>
                                <input type="text" placeholder={Post.phone}/><br/>
                                <label htmlFor="name">Enter email</label><br/>
                                <input type="text" placeholder={Post.email}/><br/>
                                <button class="btn btn-primary">Update</button>
                        </Popup> 
                        
                        </td>
                        <td><button className="btn btn-primary" onClick={() => handleDelete(Post.id)}>Delete</button></td>
                    </tr>
                ))}
                </div>
            </tbody>
        </table>
       
    </div>
    </>
  )
}
export default Table