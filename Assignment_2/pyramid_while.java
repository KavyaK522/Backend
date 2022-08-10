package com.orthofx;

import java.util.Scanner;

public class pyramid_while {
	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		System.out.println("n=");
		int a=i.nextInt();
		int j=1;
		while(j<=a)
		{
			int k=j;
			while(k<a)
			{
				System.out.print(" ");
				k++;
			}
			int l=1;
			while(l<=2*j-1)
			{
				System.out.print("*");
				l++;
			}
			System.out.println();
			j++;
		}
	}

}
