package com.tnsif.Day9.Interfaces.WrapperClasses;

	interface parent1{
	    public void show();

	}
	interface parent2{
		public void disp();
	}
	class myclass{
		public void display() {
			System.out.println("Method in Class");
		}
	}
	class Child extends myclass implements parent1,parent2{
		@Override
		public void  disp() {
			System.out.println("hello world!!!");
		}
		public void show() {
			System.out.println("welcome!!!");
		}
	}
	public class MultipleInterfaceDemo {

		public static void main(String[] args) {
			Child obj=new Child();
			obj.show();
			obj.disp();
			obj.display();

		}

	}