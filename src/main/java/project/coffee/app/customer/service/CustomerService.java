package project.coffee.app.customer.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.coffee.app.model.customer.Customer;
import project.coffee.app.repo.CostumerRepo;

@Service
@Transactional
public class CustomerService {
	private final CostumerRepo userRepo;

	@Autowired
	public CustomerService(CostumerRepo userRepo) {
		this.userRepo = userRepo;
	}

	public Customer addCustomer(Customer customer) {
		return userRepo.save(customer);

	}

	public Customer updateCustomer(Customer customer) {
		return userRepo.save(customer);
	}
	
	public List<Customer> findAllCustomers() {
		return userRepo.findAll();
	}
	
	public Customer findCustomerById(Long id) {
		return userRepo.findCustomerById(id);
	
	}

}
