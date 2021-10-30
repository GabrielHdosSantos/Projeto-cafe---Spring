package project.coffee.app.order.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.coffee.app.model.order.Order;
import project.coffee.app.user.service.OrderRepo;

@Service
@Transactional
public class OrderService {
	
	private final OrderRepo orderRepo;
	
	@Autowired
	public OrderService(OrderRepo orderRepo) {
		this.orderRepo = orderRepo;
	}
	
	
	public Order addOrder(Order order) {
		return orderRepo.save(order);
	}
	
	public Order deleteOrder(Order order) {
		 orderRepo.delete(order);
		return order;
	}

}
