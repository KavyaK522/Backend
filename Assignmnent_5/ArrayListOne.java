package com.orthofx;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListOne {
	public static void main(String[] args) {
		   Scanner names=new Scanner(System.in);
		   ArrayList<String> list = new ArrayList<String>();
		   System.out.println("enter the names:-");
		      for(int i=0;i<10;i++) {
	    	       String s=names.next();
	    		   list.add(s);
	          }
	     Collections.sort(list);
	     System.out.println("Sorted list : " + list);
	}

}
