package com.abunyc.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abunyc.location.entities.Location;
import com.abunyc.location.repository.LocationRepository;

/**
 * @author Abu
 */

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	LocationRepository locationRepository;

	@Override
	public Location createLocation(Location location) {
		
		return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		locationRepository.delete(location);
	}

	@Override
	public Optional<Location> getLocationById(int id) {
		return locationRepository.findById(id);
	}

	@Override
	public List<Location> getAllLocation() {
		return locationRepository.findAll();
	}

}
