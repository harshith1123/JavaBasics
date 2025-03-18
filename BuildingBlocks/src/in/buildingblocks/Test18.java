package in.buildingblocks;

class Vehicle{
	int numberOfWheels;
	String vehicleName;
	
	
	public Vehicle(int numberOfWheels, String vehicleName) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.vehicleName = vehicleName;
	}

	
	public Vehicle(Vehicle obj) {
		this.numberOfWheels=obj.numberOfWheels;
		this.vehicleName = obj.vehicleName;
	}
	@Override
	public String toString() {
		return "Vehicle [numberOfWheels=" + numberOfWheels + ", vehicleName=" + vehicleName + "]";
	}
	
	
}

public class Test18 {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(4,"bus");
		System.out.println(v1);
		
		Vehicle v2 = new Vehicle(v1);
		System.out.println(v2);

	}

}
