package com.orthofx;

import java.util.Scanner;

public class MulByAConst {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the no. of rows of matrix :-");
		int m=a.nextInt();
		System.out.println("Enter the no. of columns of matrix  :-");
		int n=a.nextInt();
		System.out.println("Enter the constant :-");
		int c=a.nextInt();
		int x[][]= new int[m][n];
		int y[][]= new int[m][n];
		System.out.println("Enter the elements of the matrix:-");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				x[i][j]=a.nextInt();
			}
		}
		for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 y[i][j]=c*x[i][j];
			 }
		}
		System.out.println("Result:-");
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 System.out.print(y[i][j]+" ");
			 }
			 System.out.println();
	     }
	}
}
