package project.coffee.app.admin.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.coffee.app.model.admin.Admin;
import project.coffee.app.repo.AdminRepo;

@Service
@Transactional
public class AdminService {
	
	private final AdminRepo adminRepo;
	
	@Autowired
	public AdminService(AdminRepo adminRepo) {
		this.adminRepo = adminRepo;
	}
	
	public Admin AddAdmin(Admin admin) {
		return adminRepo.save(admin);
	}
	
	public Admin updateAdmin(Admin admin) {
		return adminRepo.save(admin);
	}
	
	

}
