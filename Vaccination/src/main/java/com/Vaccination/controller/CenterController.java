package com.Vaccination.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
public class CenterController{
	@Autowired
	CenterService cc;
	@Autowired
	CitizenService cs;
	
	@GetMapping("/nctr")
	public String NewCenter(Model m)
	{
		m.addAttribute("ctr", new VaccineCenter());
		return "AddCenter";
	}
	
	@PostMapping("/ctrinfo")
	public String NewCtz(@ModelAttribute("ctr") VaccineCenter ctr, Model m)
	{	
		
		cc.addVaccinationCenter(ctr);
		return "redirect:/ctrall";
	}
	@GetMapping("/ctr")
	public String ViewCenterinfo(Model m)
	{
		List<VaccineCenter> ctrlist = cc.getAllVaccinationCenters();
		m.addAttribute("ctrlist",ctrlist);
		return "ShowAllCtr";
	}

	@GetMapping("/ctrall")
	public String ViewCtrInfos(Model m)
	{
		List<VaccineCenter> ctrlist = cc.getAllVaccinationCenters();
		m.addAttribute("ctrlist",ctrlist);
		return "ShowAllCtr";
	}
	
	@GetMapping("/ctredit/{id}")
	public String editCitizen(@PathVariable int id, Model m) { 
	    Citizen ctz = cs.getcitizenById(id);
	    
	    m.addAttribute("ctz", ctz);
	    return "CenterEdit";
	}


    @PostMapping("/ctredit/{id}")
    public String updateCitizen(@PathVariable int id, @ModelAttribute("ctz") Citizen ctz) {
        cs.updatecitizen(ctz);
        return "redirect:/ctrall";
    }

    @GetMapping("/ctrdelete/{id}")
    public String deleteCenter(@PathVariable int id) {
        cc.deleteVaccinationCenter(id);
        return "redirect:/ctrall";
    }


    @GetMapping("/ctrview/{id}")
    public String getCitizensByVaccineCenter(@PathVariable int id, Model model) {
        List<Citizen> citizens = cs.getCitizensByVaccineCenter(id);
        if (citizens.isEmpty()) {
            return "NoCitizensView";
        } else {
            model.addAttribute("citizensList", citizens);
            return "CenterView";
        }
}
}