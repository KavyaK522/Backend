package com.orthofx;
import java.util.Scanner;
import java.util.ArrayList;
public class MetrixMulByConstArrayList {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the no. of rows of matrix :-");
		int m=a.nextInt();
		System.out.println("Enter the no. of columns of matrix  :-");
		int n=a.nextInt();
		System.out.println("Enter the constant :-");
		int c=a.nextInt();
		ArrayList<ArrayList<Integer>> m1 = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> m2 = new ArrayList<ArrayList<Integer>>();
		System.out.println("Enter the elements of the matrix:-");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				 if(m1.size() < i + 1) {
                    m1.add(i, new ArrayList<>());
                }
                m1.get(i).add(j, a.nextInt());
			}
		}
		for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 if(m2.size() < i + 1) {
	                    m2.add(i, new ArrayList<>());
	                }
	                m2.get(i).add(j, m1.get(i).get(j)*c);
			 }
		}
		System.out.println("Result:-");
		 for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 System.out.print(m2.get(i).get(j)+" ");
			 }
			 System.out.println();
	     }
	}
}
