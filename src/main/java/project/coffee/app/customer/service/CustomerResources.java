package project.coffee.app.customer.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.coffee.app.model.customer.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerResources {

	private final CustomerService customerService;

	public CustomerResources(CustomerService customerService) {
		this.customerService = customerService;
	}

	@PutMapping("/addCustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		Customer newCustomer = customerService.addCustomer(customer);
		return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
	}

	@PutMapping("/updateCustomer")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer) {
		Customer newCustomer = customerService.updateCustomer(customer);
		return new ResponseEntity<>(newCustomer, HttpStatus.OK);
	}

	@GetMapping("/all")
	public ResponseEntity<List<Customer>> findAllCustomers() {
		List<Customer> newCustomer = customerService.findAllCustomers();
		return new ResponseEntity<>(newCustomer, HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Long id){
		Customer customer = customerService.findCustomerById(id);
		return new ResponseEntity<>(customer, HttpStatus.OK);
	}
	

}
