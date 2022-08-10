package com.orthofx;

import java.util.Scanner;

public class StringReversing {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		char s;
		String str,rstr="";
		System.out.println("Enter a string:");
		String a=i.next();
		for(int j=a.length()-1;j>=0;j--) {
			s=a.charAt(j);
			rstr+=s;
		}
		System.out.println(rstr);
	}
}
