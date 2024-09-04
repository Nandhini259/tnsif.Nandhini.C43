package com.tnsif.Day10.ExceptionHandling;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Exp_Demo {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try {
    	System.out.println("Enter the number : ");
    	int num=sc.nextInt();  //get integer input
    	System.out.println(num % 2==0 ? num +" is Even": num +" is Odd");
    	return;
    }
    catch(InputMismatchException e) {
    	System.err.println("Invalid input...");
    }
    finally {
    	System.out.println("In Finally...");
    sc.close();
    }
}
}