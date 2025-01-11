package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.beans.ReportService;

import AppConfig.Spring_Congif;

public class Main_App {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Spring_Congif.class);
	
	ReportService service =context.getBean(ReportService.class);
	service.generateReport();
	
	}
}
