package thirdpackage;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = -305012552.123;
		double b = -506453489451.233;
		if(a > b)
		{
			System.out.println("The largest among the two numbers is :"  +a);	
		}
		else if (a == b)
		{
			System.out.println("both numbers have same values");
		}
		else if (a < b)
		{
			System.out.println("The smallest among the two numbers is :"  +a);
		}
	}
}


