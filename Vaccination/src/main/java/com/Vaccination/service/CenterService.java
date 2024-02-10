package com.Vaccination.service;

import java.util.List;
import java.util.Optional;

import com.Vaccination.entity.*;

public interface CenterService {

    List<VaccineCenter> getAllVaccinationCenters();
    VaccineCenter getVaccinationCenterById(int id);
    void addVaccinationCenter(VaccineCenter center);
    void updateVaccinationCenter(VaccineCenter center);
    void deleteVaccinationCenter(int id);
	void updateCenter(VaccineCenter updatedCenter);
	Optional<VaccineCenter> findById(int id);
	

}
