package com.orthofx;

import java.util.Scanner;

public class fruits {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		System.out.println("Enter the fruit:-");
		String a=i.next();
		switch(a)
		{
		case "apple":
		System.out.println("red");
		break;
		case "banana":
			System.out.println("yellow");
			break;
			default:
				System.out.println("green");
				break;
			
		}
		
	}

}
