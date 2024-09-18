package thirdpackage;

import java.util.Scanner;

public class Factorial_patni {
	
	static float getFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the number you want :");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		float sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + (i/getFactorial(i));
		}
		System.out.println("The result is : " +sum);
	}
}
