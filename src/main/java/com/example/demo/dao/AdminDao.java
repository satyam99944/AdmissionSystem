package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Admin;


public interface AdminDao extends JpaRepository<Admin,String>{

}
