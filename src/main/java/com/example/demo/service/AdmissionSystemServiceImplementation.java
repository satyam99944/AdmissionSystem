package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AdminDao;
import com.example.demo.dao.LoginDao;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Admin;
import com.example.demo.entity.Login;
import com.example.demo.entity.User;

@Service
public class AdmissionSystemServiceImplementation implements AdmissionSystemService{
	@Autowired
	AdminDao adminDao;
	@Autowired
	UserDao userDao;
	@Autowired
	LoginDao loginDao;
	public Optional<User> registerUser(User user) {
		userDao.save(user);
		Login login=new Login(user.getEmail(),user.getPassword());
		loginDao.save(login);
		return userDao.findById(user.getEmail());
	}
	public Optional<Admin>registerAdmin(Admin admin) {
		adminDao.save(admin);
		Login login=new Login(admin.getEmail(),admin.getPassword());
		loginDao.save(login);
		return adminDao.findById(admin.getEmail());
		
	}
	public void LoginDetails(Login login) {
		
	}
}
