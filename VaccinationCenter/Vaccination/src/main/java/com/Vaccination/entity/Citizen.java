package com.Vaccination.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "citizen")
public class Citizen {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String city;
    private int Doses;
    private String status;

    @ManyToOne
    @JoinColumn(name = "vaccination_center_id")
    private VaccineCenter vaccineCenter;

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

    public int getDoses() {
        return Doses;
    }

    public void setDoses(int doses) {
        this.Doses = doses;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VaccineCenter getVaccineCenter() {
        return vaccineCenter;
    }

    public void setVaccineCenter(VaccineCenter vaccineCenter) {
        this.vaccineCenter = vaccineCenter;
    }
}
