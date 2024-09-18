package assignments;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PasswordValidation {

	@Test
	public static void pwd() {
		// TODO Auto-generated method stub
		System.out.println("Enter the password : ");
		Scanner scan = new Scanner(System.in);
		String password = scan.next();
		System.out.println("The password you entered is : " +password);
		boolean valid = true;
		if(password.length() < 10) {
			System.out.println("The password should contain at least 10 characters : ");
			valid = false;
		}
		String uppercase = "(.*[A-Z].*)";
		if(!password.matches(uppercase)) {
			System.out.println("The password should contain at least one upper case letter ");
			valid = false;
		}
		String specialchar = "(.*[~,!,@,#,$,%,^,&,*,(,),_,+,?,/,<,>,;,:,.].*)";
		if(password.matches(specialchar)) {
			System.out.println("The password should not contain any special characters : ");
			valid = false;
		}
		int numCount = 0;
		int charCount = 0;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if(ch >= '0' && ch <= '9') {
				numCount++;
			}
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				charCount++;
			}
		}
		if(numCount < 2) {
			System.out.println("The password should contain at least two digits :");
			valid = false;
		}
		if(charCount < 2) {
			System.out.println("The password should contain at least two characters : ");
			valid = false;
		}
		if(valid == true) {
			System.out.println("The password is a valid one : ");
		}
		else {
			System.out.println("The passsword is an invalid one : ");
		}
	}

}
