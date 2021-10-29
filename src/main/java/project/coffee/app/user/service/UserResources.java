package project.coffee.app.user.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.coffee.app.model.customer.Customer;
import project.coffee.app.model.user.User;

@RestController
@RequestMapping("/login")
public class UserResources {

	private final UserService userService;
	private HttpSession sessao;

	@Autowired
	public UserResources(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/logar/{cpf}")
	public ResponseEntity<User> login(@PathVariable("cpf") String cpf) {
		User user = userService.findUserByCPF(cpf);

		if (user instanceof Customer)
			System.out.println("top");
	else {
			System.out.println("nao e customer");	
			}
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
