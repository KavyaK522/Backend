package com.orthofx;

import java.util.Scanner;

public class PyramidForloop {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		System.out.println("n=");
		int a=i.nextInt();
		for(int j=1;j<=a;j++) {
			for(int k=j;k<a;k++) {
			  System.out.print(" ");
			}
			for(int l=1;l<=2*j-1;l++) {
			  System.out.print("*");
			}
			  System.out.println();		
		}

	}
}
