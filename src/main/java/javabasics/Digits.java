package javabasics;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		String numb = scan.nextLine();
		char t = 0;
		char[] array = numb.toCharArray();
		System.out.println(array);
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] >= array[j]) {
					t= array[i];
					array[i] = array[j];
					array[j] = t;
				}
					
			}
			
		}
		//System.out.println("The number in increasing order is given by :" +array);
		System.out.println("The largerst number is " +array[array.length-1]+ " and the smallest number is " +array[0]);
		
	}

}
