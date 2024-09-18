package assignments;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Fibonacci {
	
	@Test
	public void fibonacii() {
		System.out.println("ENter the range for fibonacii series");
		Scanner scan = new Scanner(System.in);
		int range = scan.nextInt();
		int num = 0;
		int num1 = 1;
		int sum = 0;
		for (int i = 0; i < range; i++) {
			System.out.print(num + " + ");
			
			sum = num + num1;
			num = num1 ;
			num1 = sum;
		}
	}
}
