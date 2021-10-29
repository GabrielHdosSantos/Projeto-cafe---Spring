package project.coffee.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import project.coffee.app.model.admin.Admin;

public interface AdminRepo extends JpaRepository<Admin, Long> {
	
}
