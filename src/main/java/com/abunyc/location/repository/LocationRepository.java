package com.abunyc.location.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abunyc.location.entities.Location;

/**
 * @author Abu
 */

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

	public static final String LOCATION_TYPE_COUNT = "select type, count(type) from location_tbl group by type";

	@Query(value = LOCATION_TYPE_COUNT, nativeQuery = true)
	public List<Object[]> findTypeAndCount();

}
