package in.buildingblocks;

class Box{
	Box(){
		System.out.println("current value of this-->"+this.hashCode());
			
	}
}

public class Test13 {

	public static void main(String[] args) {
		Box b = new Box();
		System.out.println("current value of b"+b.hashCode());

		Box b1 = new Box();
		System.out.println("current value of b-->"+b.hashCode());
		System.out.println("current value of b1-->"+b1.hashCode());
	}

}
