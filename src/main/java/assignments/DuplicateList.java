package assignments;

import java.util.Scanner;

public class DuplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("The array is : ");
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
			
		}
		System.out.println("Duplicate below");
		for (int i = 0; i < n; i++) {
			int count =0;
			for (int j = i+1; j < n; j++) {
				if(array[i] == array[j] && count < 1) {
					System.out.println(array[i]);
					count++;
				}
			
		}
	}

}
}
