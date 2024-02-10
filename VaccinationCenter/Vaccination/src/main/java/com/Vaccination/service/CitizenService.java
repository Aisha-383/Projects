package com.Vaccination.service;

import java.util.List;
import com.Vaccination.entity.*;

public interface CitizenService {

    List<Citizen> getAllcitizen();
    Citizen getcitizenById(int id);
    void addcitizen(Citizen citizen);
    void updatecitizen(Citizen citizen);
    void deletecitizen(int id);
	 List<Citizen> getCitizensByVaccineCenter(int vaccineCenterId);
	
}
