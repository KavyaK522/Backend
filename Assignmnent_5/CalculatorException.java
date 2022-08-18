package com.orthofx;

import java.util.Scanner;

public class CalculatorException {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		System.out.println("Enter any two numbers:- ");
		int a = i.nextInt();
		int b = i.nextInt();
		System.out.println("Enter an arithmetic operator:- ");
		char O = i.next().charAt(0);
		switch (O) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			try {
			System.out.println(a / b);
			}catch (ArithmeticException e) {
				System.out.println("cannot be divided by zero");
			}
			break;
		case '%':
			System.out.println(a % b);
			break;

		default:
			System.out.println("Enter the correct Operator!");
			break;
		}
	}
}
