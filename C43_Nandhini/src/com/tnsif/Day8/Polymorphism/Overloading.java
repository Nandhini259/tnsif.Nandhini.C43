package com.tnsif.Day8.Polymorphism;


public class Overloading {
	int num1;
	int num2;
	int result;
	
	void sum(int a, int b) // num1,num2 data members //sum method  // num1 stored in a this is called assigning(=)
	{
		num1=a;
		num2=b;
		result=num1+num2;
		System.out.println("the results are: "+result);
	}
	void sum(int a, double b) 
	{
		num1=a;
		num2=(int)b;      //int to double
		result=num1+num2;
		System.out.println("the results are: "+result);
	}
	void sum(double a, double b) 
	{
		num1=(int)a;
		num2=(int)b;      //int to double
		result=num1+num2;
		System.out.println("the results are: "+result);
	}
	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.sum(10,20);
		
	}

}


