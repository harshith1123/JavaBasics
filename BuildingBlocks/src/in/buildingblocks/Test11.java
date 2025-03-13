package in.buildingblocks;

public class Test11 {
	
	int data =100;
	static int data2 = 500;  // due to class loading
	
	public void m1() {
		System.out.println(data+" "+Test11.data2);
	}
	
	public static void m2(Test11 t) {
		System.out.println(Test11.data2);
		System.out.println(t.data);
	}
	
	public static void main(String[] args) {
		Test11 t = new Test11();
		t.m1();
		Test11.m2(t);
	}
}
