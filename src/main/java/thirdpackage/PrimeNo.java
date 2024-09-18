package thirdpackage;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nuMber;
		int k = 2;
		System.out.println("Enter the number you want :");
		Scanner scan = new Scanner(System.in);
		nuMber = scan.nextInt();
		while(nuMber > k) {
			if(nuMber % k == 0) {
				break;
			}
			k++;
		}
		if(nuMber == k)
			System.out.println(nuMber + " is a prime number");
		else if(nuMber == 1)
			System.out.println(nuMber + " is the special number ");
		else
			System.out.println(nuMber +" is a composite number");
	}

}


