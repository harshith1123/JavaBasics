package in.buildingblocks;

public class Test22 {
	public static void printOne(int a) {
		System.out.println(a);
		printTwo(2);
	}
	
	public static void printTwo(int b) {
		System.out.println(b);
		printThree(3);
	}
	
	public static void printThree(int c) {
		System.out.println(c);
		printFour(4);
	}
	
	public static void printFour(int d) {
		System.out.println(d);
		printFive(5);
	}
	
	public static void printFive(int e) {
		System.out.println(e);
		return;
	}

	public static void main(String[] args) {
		printOne(1);

	}

}
