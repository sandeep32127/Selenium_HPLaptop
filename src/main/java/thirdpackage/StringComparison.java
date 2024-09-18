package thirdpackage;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "TestLeaf Java";
		String str2 = "TestLeaf java";
		String str3 = "TestLeaf java";
		String str4 = "testleaf Java";
		String str5 = "Java";
		comparestring(str1,str2,str3,str4,str5);
	}
	public static void comparestring(String str1,String str2,String str3,String str4,String str5) {
		/*if(str1 == str2) {
			System.out.println("Okay");
		}
		else {
			System.out.println("not Okay");
		}*/
		/*if(str1.equalsIgnoreCase(str4)) {
			System.out.println("Okay");
		}
		else {
			System.out.println("not Okay");
		}*/
		if(str1.contentEquals(str2)) {
			System.out.println("Okay");
		}
		else {
			System.out.println("not Okay");
		}
	}

}


