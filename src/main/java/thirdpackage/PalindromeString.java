package thirdpackage;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		String c;
		String b = null;
		System.out.print("Enter the string you want to reverse : ");
		Scanner scan = new Scanner(System.in);
		c = scan.next();
		char[] charArray = c.toCharArray();
		for (int i = charArray.length-1; i >= 0 ; i--) {
			System.out.println(charArray[i]);
			str.append(charArray[i]);
			b = str.toString();
		}
		System.out.println("The reversed string is : " +b);
		if(c.equals(b)) {
			System.out.println("The string antered by you is a pallindrome ");
		}
		else {
			System.out.println("The string entered by you is not a pallindrome :");
		}
	}

}
