package in.buildingblocks;

public class Test27 {
	
	public static int factorial(int n) {
		if(n==1) {
			return n;
		}
		else {
			return n* factorial(n-1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Factorial of a number is "+factorial(4));
	}

}
