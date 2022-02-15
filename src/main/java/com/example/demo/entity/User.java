package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
private String email;
private String password;
private String  confirmPassword;
private String userName;
private String mobileNumber;
private String userRole;

public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(String email, String password, String conformPassword, String userName, String mobileNumber,
		String userRole) {
	super();
	this.email = email;
	this.password = password;
	this.confirmPassword = conformPassword;
	this.userName = userName;
	this.mobileNumber = mobileNumber;
	this.userRole = userRole;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
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
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
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
	return "User [email=" + email + ", password=" + password + ", conformPassword=" + confirmPassword + ", userName="
			+ userName + ", mobileNumber=" + mobileNumber + ", userRole=" + userRole + "]";
}


}
