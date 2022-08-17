package com.orthofx;
import java.util.Scanner;
import java.util.HashMap;
public class HashMapNameMarks {
	public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
         HashMap<String, Integer> Hmap = new HashMap<>();
         System.out.println("Number of students:-");
         int k=read.nextInt();
         System.out.println("enter name and marks:-");
         for(int i=0;i<k;i++) {
         String name=read.next();
         int mark=read.nextInt();
         Hmap.put(name, mark);
         }
         System.out.println("enter name");
         String input=read.next();         
         System.out.println(Hmap.get(input));
	}      
}
