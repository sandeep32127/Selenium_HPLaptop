package assignments;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Swapping {
	
	@Test
	public void chkSwap() {
		System.out.println("ENter the value you want to chk .......");
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		StringBuilder sb = new StringBuilder();
		char[] numbArray = number.toCharArray();
		for (int i = 0; i < numbArray.length; i++) {
			for (int j = i+1; j < numbArray.length; j++) {
				if(numbArray[i] > numbArray[j]) {
					char temp = numbArray[i];
					numbArray[i] = numbArray[j];
					numbArray[j] = temp;
				}
			}
		}
		for (int i = 0; i < numbArray.length; i++) {
			sb.append(numbArray[i]);
		}
		 //String sortedValue = numbArray.toString();
		System.out.println("The valueis sorted : "+ sb.toString());
	}
	
}
