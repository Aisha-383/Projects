package com.Vaccination.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Vaccination.entity.Citizen;
import com.Vaccination.entity.VaccineCenter;
import java.util.List;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer> {
List<Citizen> findByVaccineCenter(VaccineCenter vaccineCenter);   
}
