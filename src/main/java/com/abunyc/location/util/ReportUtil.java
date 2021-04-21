package com.abunyc.location.util;

import java.util.List;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Abu
 */

public interface ReportUtil {
	
	void generatePieChart(String path, List<Object[]> data );

}


