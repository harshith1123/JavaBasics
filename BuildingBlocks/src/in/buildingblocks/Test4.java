package in.buildingblocks;

public class Test4 {
	int data = 100; // state

	public static void main(String[] args) {
		Test4 obj= new Test4();
		
		// Accessing an instance variable:
		// objName.varName
		
		System.out.println(obj.data);
		
		Test4 obj2 = new Test4();
		System.out.println(obj2.data);
		
		obj.data=200;
		
		System.out.println(obj.data);
		System.out.println(obj2.data);

	}

}
