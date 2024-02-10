package com.Vaccination.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Vaccination.entity.*;

@Repository
public interface VaccineCenterRepo  extends JpaRepository<VaccineCenter, Integer>{

}
