package com.Vaccination.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Vaccination.entity.Citizen;
import com.Vaccination.entity.VaccineCenter;
import com.Vaccination.service.CenterService;
import com.Vaccination.service.CitizenService;

@Controller
public class CitizenController{
	@Autowired
	CitizenService cs;
	
	@Autowired
	CenterService vs;
	
	@GetMapping("/nctz")
	public String NewCitizen(Model m)
	{
		m.addAttribute("ctz", new Citizen());
		return "AddCitizen1";
	}
	
	@PostMapping("/ctzinfo")
	public String NewCtz(@ModelAttribute("ctz") Citizen ctz, Model m)
	{	
		
		cs.addcitizen(ctz);
		return "redirect:/ctzall";
	}
	@GetMapping("/ctz")
	public String ViewCitizeninfo(Model m)
	{
		List<Citizen> ctzlist = cs.getAllcitizen();
		m.addAttribute("ctzlist",ctzlist);
		return "ShowAllCtz";
	}

	@GetMapping("/ctzall")
	public String ViewCtzInfos(Model m)
	{
		List<Citizen> ctzlist = cs.getAllcitizen();
		m.addAttribute("ctzlist",ctzlist);
		return "ShowAllCtz";
	}

	@GetMapping("/ctzedit/{id}")
	public String editCitizen(@PathVariable int id, Model m) { 
	    Citizen ctz = cs.getcitizenById(id);
	    
	    m.addAttribute("ctz", ctz);
	    return "CitizenEdit";
	}


    @PostMapping("/ctzedit/{id}")
    public String updateCitizen(@PathVariable int id, @ModelAttribute("ctz") Citizen ctz) {
        cs.updatecitizen(ctz);
        return "redirect:/ctzall";
    }
	
    @GetMapping("/ctzdelete/{id}")
    public String deleteCitizen(@PathVariable int id) {
        cs.deletecitizen(id);
        return "redirect:/ctzall";
    }

//    @GetMapping("/ctzview/{id}")
//    public String viewCitizen(@PathVariable int id, Model model) {
//        // Retrieve citizen by ID from the service
//        Citizen citizen = cs.getcitizenById(id);
//        model.addAttribute("citizen", citizen);
//        return "ShowAllCtz";
//    }
    
    @GetMapping("/ctzview/{id}")
    public String getCitizensByVaccineCenter(@PathVariable int id, Model model) {
        List<Citizen> citizens = cs.getCitizensByVaccineCenter(id);
        if (citizens.isEmpty()) {
            return "NoCitizensView";
        } else {
            model.addAttribute("citizensList", citizens);
            return "CitizenView";
        }
    }
}
    


