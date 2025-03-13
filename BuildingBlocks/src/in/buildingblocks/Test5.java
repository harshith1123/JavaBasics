package in.buildingblocks;

public class Test5 {
	static int data=200;
	public static void main(String[] args) {
//	className.varName;
		System.out.println(Test5.data);
		
		Test5 obj= new Test5();
		Test5 obj2= new Test5();
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		obj.data=500;
		
		System.out.println(obj.data);
		System.out.println(obj2.data);
	

	}

}
