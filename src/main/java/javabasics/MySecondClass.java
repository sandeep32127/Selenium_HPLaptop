package javabasics;

import secondpackage.FirstVariable;

public class MySecondClass {
	
	boolean vegetarian;
	public String dgh;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstVariable obj1 = new FirstVariable();
		obj1.age = 25;
		System.out.println("My age is : " + obj1.age);
		obj1.myname = "Sandeep";
		System.out.println("My name is : " + obj1.myname);
	}

}
