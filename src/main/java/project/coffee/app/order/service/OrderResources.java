package project.coffee.app.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.coffee.app.model.order.Order;

@RestController
@RequestMapping("/order")
public class OrderResources {

	private final OrderService orderService;

	@Autowired
	public OrderResources(OrderService orderService) {
		this.orderService = orderService;
	}

	@PutMapping("/addOrder")
	public ResponseEntity<Order> addOrder(@RequestBody Order order) {
		Order newOrder = orderService.addOrder(order);
		return new ResponseEntity<Order>(newOrder, HttpStatus.CREATED);
	}
	
	@DeleteMapping
	public ResponseEntity<Order> deleteOrder(@RequestBody Order order){
		Order newOrder = orderService.deleteOrder(order);
		return new ResponseEntity<Order>(newOrder, HttpStatus.OK);
	}

}
