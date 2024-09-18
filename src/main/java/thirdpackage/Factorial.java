package thirdpackage;

import java.util.InputMismatchException;
import java.util.Scanner;

import freemarker.template.utility.NumberUtil;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number2 = 1;
		System.out.print("Enter the number : " );
		Scanner scan = new Scanner(System.in);
		
		try {
			int number = scan.nextInt();
			if(number >= 1) {
				for (int i = 1; i <= number; i++) {
					number2 = number2 * i;

				}
				System.out.println("The factorial of the number is:" +number2);

			}
			
			else if(number == 0) {
				System.out.println("The factorial of the number is : 1" );

			}else {
				System.out.println("Please enter a positive number to get its factorial");
			}
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid number");
		}
		
	}
}







