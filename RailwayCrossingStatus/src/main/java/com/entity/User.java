package com.entity;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	    @Id
	    @GeneratedValue
	    private int uid;
	 private String name;
		private String email;
	    private String password; 
	    
	    @OneToMany(mappedBy = "user")
	    private List<Favorites> favorites;
	    
	    public List<Favorites> getFavorites() {
			return favorites;
		}
		public void setFavorites(List<Favorites> favorites) {
			this.favorites = favorites;
		}
		
	    public int getId() {
	 			return uid;
	 		}

	 		public void setId(int id) {
	 			this.uid = id;
	 		}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
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

	    public User() {
	    }

	    public User(String email, String password) {
	        this.email = email;
	        this.password = password;
	    }

		public User(String name, String email2, String password2) {
			// TODO Auto-generated constructor stub
		}

	    
	}

