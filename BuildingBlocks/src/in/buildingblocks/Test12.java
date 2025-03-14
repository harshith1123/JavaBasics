package in.buildingblocks;

class Car{
	public boolean isSameObject(Car obj) {
		if(obj==this) return true;
		return false;
	}
}

public class Test12 {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.isSameObject(c));
		
		Car c1 = new Car();
		System.out.println(c1.isSameObject(c));

	}

}
