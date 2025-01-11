package com.project.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

	@Autowired
	private ReportDao report;
	
	public void generateReport()
	{
		report.getData();
		System.out.println("Report Generated....");
	}
}
