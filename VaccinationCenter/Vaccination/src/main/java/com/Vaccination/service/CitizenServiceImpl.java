package com.Vaccination.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;
import com.Vaccination.entity.Citizen;
import com.Vaccination.entity.VaccineCenter;
import com.Vaccination.repo.CitizenRepo;
import com.Vaccination.repo.VaccineCenterRepo;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class CitizenServiceImpl implements CitizenService{
   @Autowired
	CitizenRepo cr;
   @Autowired
   VaccineCenterRepo vc; 
	
   @Override
	public void addcitizen(Citizen ctz) {
	    try {
	        cr.save(ctz);
	    } catch (DataIntegrityViolationException | JpaSystemException e) {
	        // Handle the exception (log or throw a custom exception)
	        throw new RuntimeException("Error saving citizen: " + e.getMessage(), e);
	    }
	}
   
	@Override
	public List<Citizen> getAllcitizen() {
	return cr.findAll();
	}

	@Override
	public Citizen getcitizenById(int id) {
		Optional<Citizen> ctz=cr.findById(id);
		if(ctz.isPresent())
		return ctz.get();
	return null;
	}
	
	@Override
	public void updatecitizen(Citizen ctz) {
		cr.saveAndFlush(ctz);
	}

	@Override
	public void deletecitizen(int id) {
		cr.deleteById(id);
	}
	@Override
    public List<Citizen> getCitizensByVaccineCenter(int id) {
        Optional<VaccineCenter> vaccineCenter = vc.findById(id);
        return vaccineCenter.map(center -> cr.findByVaccineCenter(center))
                            .orElse(Collections.emptyList());
    }
	}


