package assignments;



public class Armstrong {
	//int n;
	public static int armstrong(int n) {
		int sum = 0;
		while (n > 0) {
			int a = n % 10;
			sum = (int) (sum + Math.pow(a, 3));
			n = n / 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Enter the three digit number of your choice : ");
		Scanner scan = new Scanner(System.in);
		int nuMber = scan.nextInt();*/
		System.out.println("The armstrong numbers betwwen 100 and 1000 are  displayed below : ");
		for (int i = 100; i < 1000; i++) {
			if(i== armstrong(i)) {
				System.out.println(i);
			}
		}

	}
}
