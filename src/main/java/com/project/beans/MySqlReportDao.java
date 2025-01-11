package com.project.beans;

import org.springframework.stereotype.Repository;

@Repository
public class MySqlReportDao implements ReportDao{

	public void getData() {
		System.out.println("Some data getting from Mysql Database ");
	}

}
