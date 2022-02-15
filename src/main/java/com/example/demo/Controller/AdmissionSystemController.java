package com.example.demo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AdminDao;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Login;
import com.example.demo.entity.User;
import com.example.demo.service.AdmissionSystemService;

@RestController
public class AdmissionSystemController {
	@Autowired
	AdmissionSystemService service;
	@PostMapping("/registerAdmin")
public  Optional<Admin> registerAdmin(@RequestBody Admin admin) {
		return service.registerAdmin(admin);
}
	@PostMapping("/registerUser")
public  Optional<User> registerUser(@RequestBody User user) {
		return service.registerUser(user);
}	
}
