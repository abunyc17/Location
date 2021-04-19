package com.abunyc.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.abunyc.location.entities.Location;
import com.abunyc.location.service.LocationService;

/**
 * @author Abu
 */

@Controller
public class LocationController {

	@Autowired
	LocationService locationService;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping(value = "/saveLoc", method = RequestMethod.POST)
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {

		Location locationSaved = locationService.createLocation(location);
		String msg = "Location Saved with id "+ locationSaved.getId();
		modelMap.addAttribute("msg", msg);

		return "createLocation";
	}
	
	@RequestMapping("/displayLocation")
	public String displayLocation(ModelMap modelMap) {
		List<Location> locations = locationService.getAllLocation();
		modelMap.addAttribute("locations", locations);
		
		return "displayLocation";
	}

}
