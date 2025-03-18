package in.buildingblocks;

public class Test23 {
	
	public static void printNumber(int i) {
		if(i>=6) return;
		System.out.println(i);
		printNumber(i+1);
	}

	public static void main(String[] args) {
		printNumber(1);

	}

}
