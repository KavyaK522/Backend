package com.orthofx;

import java.util.Scanner;

public class marks {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		System.out.println("Enter the mark:-");
		int b=i.nextInt();
		if(b>=90) {
			System.out.println("Amazing");
		}
		else if(90>b && 80<=b) {
			System.out.println("Good");
		}
		else if(80>b && 70<=b) {
			System.out.println("All right");
		}
		else {
			System.out.println("Okay");
		}
				
	}

}
