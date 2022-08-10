package com.orthofx;

import java.util.Scanner;

public class string_reversing {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		char s;
		String str,Rstr="";
		System.out.println("Enter a string:");
		String a=i.next();
		for(int j=a.length()-1;j>=0;j--)
		{
			s=a.charAt(j);
			Rstr+=s;
		}
		System.out.println(Rstr);
	}
}
