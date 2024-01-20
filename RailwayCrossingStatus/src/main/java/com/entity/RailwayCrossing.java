package com.entity;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RailwayCrossing {
	    
	    @Id
	    @GeneratedValue
	    private int id;
		private String name;
	    private String address;
	    private String landmark;
	    private String trainSchedules;
	    private String personInCharge;
	    private String status;
	   
	    @OneToMany(mappedBy = "crossing")
	    private List<Favorites> favorites;

		
		public List<Favorites> getFavorites() {
			return favorites;
		}
		public void setFavorites(List<Favorites> favorites) {
			this.favorites = favorites;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getLandmark() {
			return landmark;
		}
		public void setLandmark(String landmark) {
			this.landmark = landmark;
		}
		public String getTrainSchedules() {
			return trainSchedules;
		}
		public void setTrainSchedules(String trainSchedules) {
			this.trainSchedules = trainSchedules;
		}
		public String getPersonInCharge() {
			return personInCharge;
		}
		public void setPersonInCharge(String personInCharge) {
			this.personInCharge = personInCharge;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}

		  public RailwayCrossing() {
			super();
		}
		  
		public RailwayCrossing(int id, String rname, String address, String landmark, String trainSchedules,
					String personInCharge, String status) {
			
				this.id = id;
				this.name = rname;
				this.address = address;
				this.landmark = landmark;
				this.trainSchedules = trainSchedules;
				this.personInCharge = personInCharge;
				this.status = status;
			}
		
		public RailwayCrossing(String name, String location) {
	        this.name = name;
	        this.address = location;
	    }
	}


