package in.buildingblocks;

public class Test15 {
	
	public void m1() {
		System.out.println("m1() called");
		this.m2();
	}
	
	public void m2() {
		System.out.println("m2() called");
	}

	public static void main(String[] args) {
		Test15 t = new Test15();
		t.m1();

	}

}
