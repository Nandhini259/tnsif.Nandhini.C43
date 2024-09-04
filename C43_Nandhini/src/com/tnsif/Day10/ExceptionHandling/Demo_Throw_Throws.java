package com.tnsif.Day10.ExceptionHandling;

public class Demo_Throw_Throws {
	public void Demo() { //throws Exception //Arithmetic Exception
		int a=5/0;
		System.out.println(a);
	}
	public void Show() {
		try {
			Demo();
			//throw new Exception(); //Syntax for throw
		}
		catch(Exception e) {
			System.out.println("Exception------>"+e);
		}
		finally {
			System.out.println("Hello World");
		}
	}
}

