package project.coffee.app.user.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.coffee.app.model.user.User;
import project.coffee.app.repo.UserRepo;

@Service
@Transactional
public class UserService {

	private final UserRepo userRepo;

	@Autowired
	public UserService(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	public User findUserByCPF(String cpf) {
		return userRepo.findUserBycpf(cpf);
	}

}
