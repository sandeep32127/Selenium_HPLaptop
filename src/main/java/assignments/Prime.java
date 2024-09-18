package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class Prime {
	
	@Test
	public void prime() {
		System.out.println("ENter the number u want to check : ");
		Scanner scan = new Scanner(System.in);
		int number  = scan.nextInt();
		int k = 2;
		while(k <= number) {
			if(number % k == 0) {
				if(number == k) {
					System.out.println("The entered number is a prime number : "+number);
					break;
				}else {
					System.out.println("The number is not a prime number : "+number);
					break;
				}
				
			}else k++;
		}
	}
	
	@Test
	public void removeDuplicates() {
		System.out.println("ENter the word u want to check : ");
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Set<Character> set= new HashSet<Character>();
		ArrayList<Character> list = new ArrayList<Character>();
		String word = scan.next();
		char[] charArray = word.toCharArray();
		for (char c : charArray) {
			//String b = (String) c;
			set.add(c);
		}
		 //Arrays.asList(sb.toString());
		//Collections.sort(set);
		System.out.println("In ascending form :"+set);
	}
}
