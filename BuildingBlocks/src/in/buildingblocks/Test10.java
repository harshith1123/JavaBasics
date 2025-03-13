package in.buildingblocks;


class AImpl{
	int data=10;
}
public class Test10 {
	public void showData(AImpl obj) {
//		AImpl a=new AImpl(); 100 objects will be created if this method calls 100 times
//		System.out.println(a.data);
		System.out.println(obj.data);
	}

	public static void main(String[] args) {
		Test10 obj=new Test10();
		AImpl a = new AImpl();
		obj.showData(a); // 100 times

	}

}
