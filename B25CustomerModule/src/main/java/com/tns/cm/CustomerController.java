package com.tns.cm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	//Retrieval
	@GetMapping("/Customer")
	public List<Customer> list() {
		return service.listAll();
	}
	//Retrieve By Id
	@GetMapping("/Customer/{id}")
	public ResponseEntity<Customer> get(@PathVariable Integer id){
		try {
			Customer customer=service.get(id);
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		} catch (Exception e) {
			
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Create
	@PostMapping("/Customer")
	public void add(@RequestBody Customer customer) {
		service.save(customer);
	}
	
	//Update
	@PutMapping("/Customer/{id}")
	public ResponseEntity<?> update(@RequestBody Customer customer,@PathVariable Integer id){
		try {
			
			@SuppressWarnings("unused")
			Customer exitCustomer=service.get(id);
			service.save(customer);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	
	//Delete
	@DeleteMapping("/Customer/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	
	
	
}


