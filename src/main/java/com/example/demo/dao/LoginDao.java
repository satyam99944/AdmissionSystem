package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Login;

public interface LoginDao extends JpaRepository<Login,String>{

}
