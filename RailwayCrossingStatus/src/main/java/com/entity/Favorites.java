package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

	@Entity
	public class Favorites {

	    @Id
	    @GeneratedValue
	    private int id;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;

	    @ManyToOne
	    @JoinColumn(name = "admin_id")
	    private admin admin;

	    @ManyToOne
	    @JoinColumn(name = "crossing_id")
	    private RailwayCrossing crossing;

	

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public admin getAdmin() {
			return admin;
		}

		public void setAdmin(admin admin) {
			this.admin = admin;
		}

		public RailwayCrossing getCrossing() {
			return crossing;
		}

		public void setCrossing(RailwayCrossing crossing) {
			this.crossing = crossing;
		}

	  

	
	}


