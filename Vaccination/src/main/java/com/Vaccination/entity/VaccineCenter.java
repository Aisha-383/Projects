package com.Vaccination.entity;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class VaccineCenter {
	@Id
	@GeneratedValue
int id;
	
String name;
String city;


@OneToMany(mappedBy = "vaccineCenter")
private List<Citizen> citizens;


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


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public List<Citizen> getCitizens() {
	return citizens;
}


public void setCitizens(List<Citizen> citizens) {
	this.citizens = citizens;
}




}
