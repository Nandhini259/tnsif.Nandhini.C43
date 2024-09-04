package com.tnsif.Day6.Inheritance;

public class inheritance {
	
	public static class a {
		public void show() {
			System.out.println("I'm a Parent");
		}
	}
	public static class a1 extends a {
		public void display() {
			System.out.println("I'm a Child");
		}
	}
	public static void main(String[] args) {
		a1 obj = new a1();
		obj.display();
		obj.show();
		}
}
