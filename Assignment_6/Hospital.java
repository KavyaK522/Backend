package com.orthofx;

import java.util.Scanner;

public class Hospital {
	String ID, age;

	static Doctor doctor = new Doctor();
	static Patient patient = new Patient();

	public Hospital() {}

	public static void main(String[] args) {
		char c;
		int n, m;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("press 1 to enter doctor section");
			System.out.println("press 2 to enter patient section");
			System.out.println("press 3 to exit");
			n = input.nextInt();
			System.out.println("press 1 to add");
			System.out.println("press 2 to display");
			System.out.println("press 3 to edit");
			System.out.println("press 4 to delete");
			m = input.nextInt();
			switch (n) {
			case (1):
				switch (m) {
				case (1):
					doctor.addDoctorDetails();
					break;
				case (2):
					doctor.displayDoctorDetails();
					break;
				case (3):
					doctor.editDoctorDetails();
					break;
				case (4):
					doctor.removeDoctorDetails();
					break;
				}
				break;
			case (2): 
				switch (m) {
				case (1):
					patient.addPatientDetails();
					break;
				case (2):
					patient.displayPatientDetails();
					break;
				case (3):
					patient.editPatientDetails();
					break;
				case (4):
					patient.removePatientDetails();
					break;
				}
			break;
			case (3):
				System.exit(0);

				break;
			default:
				System.out.println("Invalid input");
			}
		} while (n==1||n==2);
	}
}
