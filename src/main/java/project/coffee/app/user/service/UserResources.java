package project.coffee.app.user.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.coffee.app.model.admin.Admin;
import project.coffee.app.model.customer.Customer;
import project.coffee.app.model.user.User;

@RestController
@RequestMapping("/login")
public class UserResources {

	private final UserService userService;

	@Autowired
	public UserResources(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/logar/{cpf}")
	public ResponseEntity<User> login(@PathVariable("cpf") String cpf) {
		User user = userService.findUserByCPF(cpf);

		if (user instanceof Customer) {
			System.out.println("top");
			return new ResponseEntity<User>(user, HttpStatus.OK);

		} else if (user instanceof Admin) {
			System.out.println("admin");
			return new ResponseEntity<User>(user, HttpStatus.OK);
		}
		return null;
	}
}
