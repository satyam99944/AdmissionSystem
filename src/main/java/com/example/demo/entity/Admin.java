package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
private String Email;
private String password;
private String confirmPassword;
private String mobileNumber;
private String userRole;
public Admin(String email, String password, String confirmPassword, String mobileNumber, String userRole) {
	super();
	Email = email;
	this.password = password;
	this.confirmPassword = confirmPassword;
	this.mobileNumber = mobileNumber;
	this.userRole = userRole;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConformPassword() {
	return confirmPassword;
}
public void setConformPassword(String conformPassword) {
	this.confirmPassword = conformPassword;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getUserRole() {
	return userRole;
}
public void setUserRole(String userRole) {
	this.userRole = userRole;
}
@Override
public String toString() {
	return "Admin [Email=" + Email + ", password=" + password + ", conformPassword=" + confirmPassword
			+ ", mobileNumber=" + mobileNumber + ", userRole=" + userRole + "]";
}

}
