package thirdpackage;

public class OneDArrayInitialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,3,5,11,6,9,8,7};
		int[][] twoDarray = {{1,3,2},
						    {11,5,7},
						    {10,4,8}};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < twoDarray.length; i++) {
			for (int j = 0; j < twoDarray[i].length; j++) {
				System.out.print( " "+twoDarray[i][j]);
			}
			System.out.println();
		}
		
	}

}
