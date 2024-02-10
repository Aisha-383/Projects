package com.Vaccination.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Vaccination.entity.VaccineCenter;
import com.Vaccination.repo.CitizenRepo;
import com.Vaccination.repo.VaccineCenterRepo;


@Service
@Transactional
public class CenterServiceImpl implements CenterService{
    @Autowired
	VaccineCenterRepo cr;
    @Autowired
	CitizenRepo Cr;
    
	@Override
	public List<VaccineCenter> getAllVaccinationCenters() {
		return cr.findAll();
		
	}
	@Override
	public void updateCenter(VaccineCenter updatedCenter) { 
        Optional<VaccineCenter> existingCenterOptional = cr.findById(updatedCenter.getId());
        if (existingCenterOptional.isPresent()) {
            VaccineCenter existingCenter = existingCenterOptional.get();
            existingCenter.setName(updatedCenter.getName());
            existingCenter.setCity(updatedCenter.getCity());
            cr.save(existingCenter);
        } 
    }
	@Override
	public VaccineCenter getVaccinationCenterById(int id) {
		
		Optional<VaccineCenter> ctr=cr.findById(id);
		if(ctr.isPresent())
		return ctr.get();
		
	return null;	
	}


	@Override
	public void addVaccinationCenter(VaccineCenter ctr) {
		cr.save(ctr);
	}

	@Override
	public void updateVaccinationCenter(VaccineCenter ctr) {
		cr.saveAndFlush(ctr);
		
	}

	@Override
	public void deleteVaccinationCenter(int id) {
		cr.deleteById(id);
	}
	@Override
	public Optional<VaccineCenter> findById(int id) {
		return cr.findById(id);
		
	}
	 
}
