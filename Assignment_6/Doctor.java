package com.orthofx;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Hospital {
	String Name, Department;
	HashMap<String, ArrayList<String>> DoctorDetails = new HashMap<String, ArrayList<String>>();
	Scanner read=new Scanner(System.in);
	public void addDoctorDetails() {
		System.out.println("Enter ID:-");
		String ID=read.next();
		if(!DoctorDetails.containsKey(ID)) {
		DoctorDetails.put(ID, new ArrayList<String>());
		System.out.println("Enter Name:-");
		Name = read.next();
		DoctorDetails.get(ID).add(Name);
		System.out.println("Enter Department:-");
		Department = read.next();
		DoctorDetails.get(ID).add(Department);
		}
		else
			System.out.println("ID already exist");
	}
	public void displayDoctorDetails() {
		System.out.println("Enter ID:-");
		String ID=read.next();
		if(DoctorDetails.containsKey(ID)) {
		System.out.println("Doctor name:");
		System.out.println(DoctorDetails.get(ID).get(0));
		System.out.println("Department:");
		System.out.println(DoctorDetails.get(ID).get(1));
		}
		else
			System.out.println("Invalid ID");
	}
	public void editDoctorDetails() {
		System.out.println("Enter ID:-");
		String ID=read.next();
		if(DoctorDetails.containsKey(ID)) {
		System.out.println("Enter 1 to edit name and 2 to edit department:-");
		int x=read.nextInt();
		switch(x) {
		case (1):
			System.out.println("Name:-");
		    Name = read.next();
		    DoctorDetails.get(ID).set(0,Name);
		    break;
		case (2):
			System.out.println("New Department:-");
		    Department = read.next();
		    DoctorDetails.get(ID).set(1,Department);
		    break;
		}
		}
		else
			System.out.println("Invalid ID");
	}
	public void removeDoctorDetails() {
		System.out.println("Enter ID:-");
		String ID=read.next();
		if(DoctorDetails.containsKey(ID)) {
	    DoctorDetails.remove(ID);	
		}
		else
			System.out.println("Invalid ID");
	}
	
	

}
