package com.orthofx;

import java.util.Scanner;

public class MatrixMul {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the no. of rows of matrix-1 :-");
		int m=a.nextInt();
		System.out.println("Enter the no. of columns of matrix-1 :-");
		int n=a.nextInt();
		System.out.println("Enter the no. of rows of matrix-2 :-");
		int o=a.nextInt();
		System.out.println("Enter the no. of columns of matrix-2 :-");
		int p=a.nextInt();
		if(n==o) {
			int x[][]= new int[m][n];
			int y[][]= new int[o][p];
			int z[][]= new int[m][p];
		System.out.println("Enter the elements of matrix-1:-");	
		  for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				x[i][j]=a.nextInt();
			}
		  }
		System.out.println("Enter the elements of matrix-2:-");  
		  for(int i=0;i<o;i++) {
			for(int j=0;j<p;j++) {
				y[i][j]=a.nextInt();
			} 
		  }
		  for(int i=0;i<m;i++) {
			for(int j=0;j<p;j++) {
				for(int k=0;k<n;k++) {
					z[i][j]+=x[i][k]*y[k][j];
			    }
		    }
		  }
		  for(int i=0;i<m;i++) {
			  for(int j=0;j<p;j++) {
				  System.out.print(z[i][j]+" ");
			  }
			  System.out.println();
		  }
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
