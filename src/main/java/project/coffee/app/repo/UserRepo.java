package project.coffee.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import project.coffee.app.model.user.User;

public interface UserRepo extends JpaRepository<User, Long> {

	User findUserBycpf(String cpf);


}
