package in.buildingblocks;

class A{
	static {
		System.out.println("static block executed");
	}
	
	{
		System.out.println("IIB executed");
	}
}

public class Test31 {
	
	public static void main(String[] args) {
		A a = new A();
		A a1= new A();

	}

}
