package com.abunyc.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abunyc.location.entities.Location;

/**
 * @author Abu
 */

@Service
public interface LocationService {

	Location createLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Optional<Location> getLocationById(int id);

	List<Location> getAllLocation();

}
