package assignments;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

import freemarker.template.utility.DateUtil.CalendarFieldsToDateConverter;

public class Palindrome2 {

	@Test(enabled= false)
	public void palindrome() {
		System.out.println("Enter the number u want to check :");
		Scanner scan = new Scanner(System.in);
		int revnum = 0;
		int num = scan.nextInt();
		int expnum = num;
		do {
			int digit = num % 10;
			revnum = (revnum * 10) +digit;
			num = num / 10;
		}while (num > 0);
		if (expnum == revnum) {
			System.out.println("The entered number is a palindrome number");
		} else {
			System.out.println("The entered number is not a palindrome number");
		}
	}

	@Test(enabled= false)
	public void Fibonacci() {
		System.out.println("Enter the range you want for fibonacii series");
		Scanner scan = new Scanner(System.in);
		int range = scan.nextInt();
		int t0 = 0 ; 
		int t1 = 1;
		int sum = 0;

		for (int i = 0; i <range; i++) {
			System.out.println(t0);
			sum = t0+t1;
			t0 = t1;
			t1 = sum;
		}
	}

	@Test(enabled= false)
	public void duplicateCharacterinaString() {
		System.out.println("Enter the STring of your choice");
		Scanner scan = new Scanner(System.in);
		String chkString = scan.next();
		LinkedHashSet<String> dupString = new LinkedHashSet<String>();
		StringBuilder sb = new StringBuilder();
		char[] charArray = chkString.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			String chkCharacter = Character.toString(charArray[i]);
			dupString.add(chkCharacter);
		}
		for (String c : dupString) {
			sb.append(c);
		}
		System.out.println("The String after removing the duplicate characters : "+sb.toString());
	}

	@Test(enabled= false)
	public void findDuplicareInArray() {
		System.out.println("Enter the string you want to search");
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		//String substring = word.substring(1);
		HashMap<Character, Integer> dupHashMap = new HashMap<Character, Integer>();
		for (Character chara : word.toCharArray()) {
			if(dupHashMap.containsKey(chara)) {
				dupHashMap.put(chara, dupHashMap.get(chara)+1);
			}else dupHashMap.put(chara, 1);
		}
		Set<Character> keySet = dupHashMap.keySet();
		for (Character character : keySet) {
			while (dupHashMap.get(character)>1) {
				System.out.println("The character is : "+character + " The repeatation value is : "+dupHashMap.get(character));
				break;
			}
		}
	}

	@Test(enabled= false)
	public void chkFactorial() {
		System.out.println("enter the number u want to get factorial");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int fact=1;
		while (number > 0) {
			fact = fact * number;
			number--;
		}
		System.out.println("The factorial of the number is : "+fact);
	}

	@Test(enabled= true)
	public static void chkreverse() {
		String str;
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		str = "456";//scanner.nextLine();
		scanner.close();
		String reversed = reverseString(str);
		System.out.println("The reversed string is: " + reversed);
		Date time = Calendar.getInstance().getTime();
		System.out.println("Date is : "+time);
	}

	public static String reverseString(String str)
	{
		if (str.isEmpty())
			return str;
		//Calling Function Recursively
		System.out.println("***"+str);
		System.out.println("+++"+str.substring(1));
		System.out.println("---"+str.charAt(0));
		return reverseString(str.substring(1)) + str.charAt(0);//56 4 6 5 6
	}

	@Test(enabled= false)
	public void similarString() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string you want to chk :");
		String text1 = scan.next();
		System.out.println("Enter the second string you want to check :");
		String text2 = scan.next();
		List<Character> arlst1 = new ArrayList<Character>();
		List<Character> arlst2 = new ArrayList<Character>();
		for (Character character : text1.toCharArray()) {
			arlst1.add(character);
		}
		for (Character character : text2.toCharArray()) {
			arlst2.add(character);
		}
		Collections.sort(arlst1);
		Collections.sort(arlst2);
		System.out.println("After sorting the txts are "+arlst1+"++++"+arlst2);
		if (arlst1.equals(arlst2)) {
			System.out.println("The two strings are similar");
		}else System.out.println("The two strings are not similar");
	}

	@Test(enabled= true)
	public void chkStarPattern() {
		for (int i = 0; i < 5; i++) {
			for (int j = (5-i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	@Test(enabled= true)
	public void chkRevertStar() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 5-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	@Test(enabled= true)
	public void chkDiamond() {
		int space = 5- 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			space--;
			System.out.println();
		}
		space = 0;
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			space++;
			System.out.println();
		}
	}

	@Test
	public void checkRightAngle() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	@Test
	public void checkReverseRightAngle() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2*(5-i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
