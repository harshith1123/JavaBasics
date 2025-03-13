package in.buildingblocks;

public class Test7 {
	
	public void m1() {
		System.out.println("m1() called");
	}
	
	public static void m2() {
		System.out.println("m2() called");
		
	}
	public static void main(String[] args) {
		Test7 obj = new Test7();
		obj.m1(); // fnCall or invoking a function
		Test7.m2();
		
	}

}
