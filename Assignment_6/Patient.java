package com.orthofx;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Patient extends Hospital {
	String Name, ConsultedDoctor,Disease ;
	HashMap<String, ArrayList<String>> PatientDetails = new HashMap<String, ArrayList<String>>();
	Scanner read=new Scanner(System.in);
	public void addPatientDetails() {
		System.out.println("Enter ID:-");
		String ID=read.next();
		if(!PatientDetails.containsKey(ID)) {
		PatientDetails.put(ID, new ArrayList<String>());
		System.out.println("Enter Name:-");
		Name = read.next();
		PatientDetails.get(ID).add(Name);
		System.out.println("Enter consulted doctor name:-");
		ConsultedDoctor = read.next();
		PatientDetails.get(ID).add(ConsultedDoctor);
		System.out.println("Enter disease:-");
		Disease = read.next();
		PatientDetails.get(ID).add(Disease);
		}
		else
			System.out.println("ID already exist");
	}
	public void displayPatientDetails() {
		System.out.println("Enter ID:-");
		String ID=read.next();
		if(PatientDetails.containsKey(ID)) {
		System.out.println("Patient name:");
		System.out.println(PatientDetails.get(ID).get(0));
		System.out.println("ConsultedDoctor:");
		System.out.println(PatientDetails.get(ID).get(1));
		System.out.println("Enter disease:-");
		System.out.println(PatientDetails.get(ID).get(2));
		}
		else
			System.out.println("Invalid ID");
	}
	public void editPatientDetails() {
		System.out.println("Enter ID:-");
		String ID=read.next();
		if(PatientDetails.containsKey(ID)) {
		System.out.println("Enter 1 to edit name and 2 to edit Consulted Doctor:-");
		int x=read.nextInt();
		switch(x) {
		case (1):
			System.out.println("Name:-");
		    Name = read.next();
		    PatientDetails.get(ID).set(0,Name);
		case (2):
			System.out.println("ConsultedDoctor:-");
		    ConsultedDoctor = read.next();
		    PatientDetails.get(ID).set(1,ConsultedDoctor);
		case (3):
			System.out.println("Disease:-");
		    Disease = read.next();
		    PatientDetails.get(ID).set(2,ConsultedDoctor);    
		}
		}
		else
			System.out.println("Invalid ID");
	}
	public void removePatientDetails() {
		System.out.println("Enter ID:-");
		String ID=read.next();
		if(PatientDetails.containsKey(ID)) {
	    PatientDetails.remove(ID);	
		}
		else
			System.out.println("Invalid ID");
	}
     
}
