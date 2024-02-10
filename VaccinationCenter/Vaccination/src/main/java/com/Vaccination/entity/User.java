package com.Vaccination.entity;

import java.util.Set;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String email; 
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String username;
    private String password; 
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "user_roles", 
        joinColumns = @JoinColumn(name = "user_id"), 
        inverseJoinColumns = @JoinColumn(name = "role_id"))
  
 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		
		return null;
	}
	
    
    

}