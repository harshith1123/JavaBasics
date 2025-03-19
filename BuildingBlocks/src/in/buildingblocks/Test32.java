package in.buildingblocks;

class B{
	static int counter=0;
	static {
		System.out.println("static block executed");
	}
	
	{
		counter++;
	}
	
	public static void printCounter() {
		System.out.println(B.counter);
	}
}

public class Test32 {

	public static void main(String[] args) {
		B a = new B();
		B a1 = new B();
		B.printCounter();

	}

}
