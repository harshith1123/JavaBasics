package in.buildingblocks;

public class Test24 {
	public static void printNumber(int i) {		
		if(i==0) return;
		printNumber(i-1);
		System.out.println(i);
	}

	public static void main(String[] args) {
		printNumber(5);

	}

}
