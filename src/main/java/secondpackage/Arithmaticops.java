package secondpackage;

public class Arithmaticops {
	int number1;
	int number2;
	static int addTwoNumbers(int n1 , int n2) {
		return (n1+n2);
	}
	static int subTwoNumbers(int n1 , int n2) {
		return (n1-n2);
	}
	static int multiplyTwoNumbers(int n1 , int n2) {
		return (n1*n2);
	}
	static int divideTwoNumbers(int n1 , int n2) {
		return (n1/n2);
	}
	static int powerTwoNumbers(int n1 , int n2) {
		return (n1^n2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = addTwoNumbers(20,30);
		int sub = subTwoNumbers(50,40);
		int mult = multiplyTwoNumbers(10,20);
		int div =  divideTwoNumbers(50,2);
		int pow =  powerTwoNumbers(2,2);
		
		System.out.println("the sum of the two numbers is :" +sum);
		System.out.println("the multiplication of the two numbers is :" +mult);
		System.out.println("the substraction of the two numbers is :" +sub);
		System.out.println("the division of the two numbers is :" +div);
		System.out.println("the power of the two numbers is :" +pow);
		
	}

}
