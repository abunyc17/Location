package com.abunyc.location.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		modelMap.addAttribute("successMsg", msg);

		return "createLocation";
	}
	
	@RequestMapping("/displayLocation")
	public String displayLocation(ModelMap modelMap) {
		List<Location> locations = locationService.getAllLocation();
		modelMap.addAttribute("locations", locations);
		
		return "displayLocation";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = new Location();
		location.setId(id);
		locationService.deleteLocation(location);
		//Reloading with all remaining datas
		List<Location> locations = locationService.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocation";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdateLocation(@RequestParam("id") int id, ModelMap modelMap) {
		Optional<Location> location = locationService.getLocationById(id);
		if(location.isPresent()) {
			Location locationUpdate = location.get();
			modelMap.addAttribute("location", locationUpdate);
		}
		return "updateLocation";
	}
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location")Location location, ModelMap modelMap) {
		locationService.updateLocation(location);
		List<Location> aLllocation = locationService.getAllLocation();
		modelMap.addAttribute("locations", aLllocation);
		return "displayLocation";
	}
	
	

}
