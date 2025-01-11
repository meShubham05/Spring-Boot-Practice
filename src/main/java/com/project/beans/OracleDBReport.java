package com.project.beans;

import org.springframework.stereotype.Repository;

@Repository("report")
public class OracleDBReport implements ReportDao {

	public void getData() {
		
		System.out.println("Getting Data from OracleDB Report ");
	}

}
