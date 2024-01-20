package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ano;
	private String adminname;
	private String Password;
	
	@OneToMany(mappedBy = "admin")
	private List<Favorites> favorites;
	
	public List<Favorites> getFavorites() {
		return favorites;
	}
	public void setFavorites(List<Favorites> favorites) {
		this.favorites = favorites;
	}
	public admin() {
		super();
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	public admin(String adminname, String password) {
		super();
		this.adminname = adminname;
		Password = password;
	}
	
	
}
