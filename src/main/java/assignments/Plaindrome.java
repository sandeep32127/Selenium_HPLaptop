package assignments;

import java.util.Scanner;

import org.testng.annotations.Test;


public class Plaindrome {
	
	@Test
	public void chkPalindrome() {
		System.out.println("Enter the number u want to test -----");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int chknum = num;
		int sum = 0;
		while (chknum > 0) {
			int digit = chknum % 10;
			sum = (sum * 10 ) + digit;
			chknum = chknum / 10;
		}
		System.out.println("++++++++++"+num);
		System.out.println("**********"+sum);
		if(sum == num) {
			System.out.println("The number is a palindrome");
		}else {
			System.out.println("The number is not a palindrome");
		}
	}
	
	@Test
	public void chkPlaindrome2() {
		System.out.println("ENter the value you want to chk .......");
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		StringBuilder sb = new StringBuilder();
		char[] numbArray = number.toCharArray();
		for (int i = numbArray.length-1; i >= 0; i--) {
			sb.append(numbArray[i]);
		}
		if(sb.toString().equals(number)) {
			System.out.println("The value is a palindrome");
		}else System.out.println("The value is not a palindrome");
	}

}
