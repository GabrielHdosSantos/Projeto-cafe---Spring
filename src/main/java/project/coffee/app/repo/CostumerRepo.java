package project.coffee.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import project.coffee.app.model.customer.Customer;

public interface CostumerRepo extends JpaRepository<Customer, Long>{

	Customer findCustomerById(long id);

}
