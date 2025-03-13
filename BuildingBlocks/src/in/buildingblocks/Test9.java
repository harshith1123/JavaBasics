package in.buildingblocks;

public class Test9 {
	public void m1() {
		System.out.println("m1() called");
	}
	
	public static void main(String[] args) {
		System.out.println("main started");
		Test9 obj=new Test9();
		obj.m1();
		System.out.println("main completed");
		
	}

}
