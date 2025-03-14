package in.buildingblocks;

// JVM provides the constructor when no constructor defined
class Shape{
	Shape(){
		System.out.println("object created");
	}
}
public class Test16 {

	public static void main(String[] args) {
		Shape shape = new Shape();

	}

}
