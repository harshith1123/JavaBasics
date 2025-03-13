package in.basics;

// Object : toString()

class Car{
	String carName="Santro";

	@Override
	public String toString() {
		return this.carName;
	}
	
			
}

public class Test2 {
	public static void main(String[] args) {
//		className objName = new ClassName();
		Car c=new Car();
		System.out.println(c);
		
	}
}
