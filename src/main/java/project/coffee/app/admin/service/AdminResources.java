package project.coffee.app.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.coffee.app.model.admin.Admin;

@RestController
@RequestMapping("/admin")
public class AdminResources {

	private final AdminService adminService;

	@Autowired
	public AdminResources(AdminService adminService) {
		this.adminService = adminService;
	}

	@PutMapping("/addAdmin")
	public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
		Admin newAdmin = adminService.AddAdmin(admin);
		return new ResponseEntity<Admin>(newAdmin, HttpStatus.CREATED);
	}

	@PutMapping("/updateAdmin")
	public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) {
		Admin newAdmin = adminService.updateAdmin(admin);
		return new ResponseEntity<Admin>(newAdmin, HttpStatus.OK);
	}
}
