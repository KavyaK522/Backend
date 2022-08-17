package com.orthofx;
import java.util.Scanner;
import java.util.ArrayList;
public class MetrixAddArrayList {
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
		if(m==o && n==p) {
			ArrayList<ArrayList<Integer>> m1 = new ArrayList<ArrayList<Integer>>();
	        ArrayList<ArrayList<Integer>> m2 = new ArrayList<ArrayList<Integer>>();
	        ArrayList<ArrayList<Integer>> sum = new ArrayList<ArrayList<Integer>>();
		System.out.println("Enter the elements of matrix-1:-");	
		  for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(m1.size() < i + 1) {
                    m1.add(i, new ArrayList<>());
                }
                m1.get(i).add(j, a.nextInt());
            }
		  }
		System.out.println("Enter the elements of matrix-2:-");
		  for(int i=0;i<o;i++) {
			for(int j=0;j<p;j++) {
				 if(m2.size() < i + 1) {
	                    m2.add(i, new ArrayList<>());
	                }
	                m2.get(i).add(j, a.nextInt());
	            }
			} 
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 if(sum.size() < i + 1) {
	                    sum.add(i, new ArrayList<>());
	                }
	                sum.get(i).add(j, m1.get(i).get(j) + m2.get(i).get(j));
			 }
		 }
		 System.out.println("Added result:-");
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 System.out.print(sum.get(i).get(j) + "    ");
			 }
			 System.out.println();
		 }
	  }
	else {
			System.out.println("Invalid input");
		}
	}
}
