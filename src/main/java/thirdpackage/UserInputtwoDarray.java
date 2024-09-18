package thirdpackage;

import java.util.Scanner;

public class UserInputtwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array u want : ");
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] twoDimArray = new int[m][n];


		// for taking input for the array

		for (int i = 0; i < twoDimArray.length; i++) {
			for (int j = 0; j < twoDimArray[i].length; j++) {
				twoDimArray[i][j] = scan.nextInt();

			}
		}

		// for printing the array
		System.out.println("The Array in Matrix format is : ");
		for (int i = 0; i < twoDimArray.length; i++) {
			for (int j = 0; j < twoDimArray[i].length; j++) {
				System.out.print( " "+twoDimArray[i][j]);
			}
			System.out.println();
		}


	}

}
