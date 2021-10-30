package project.coffee.app.user.service;

import org.springframework.data.jpa.repository.JpaRepository;

import project.coffee.app.model.order.Order;

public interface OrderRepo extends JpaRepository<Order, Long>{

}
