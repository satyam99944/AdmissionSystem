package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Login;
import com.example.demo.entity.User;

public interface AdmissionSystemService {
public Optional<User> registerUser(User user);
public  Optional<Admin> registerAdmin(Admin admin);
public void LoginDetails(Login login);

}
