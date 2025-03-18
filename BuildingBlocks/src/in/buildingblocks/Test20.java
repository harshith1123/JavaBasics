package in.buildingblocks;

class Y{
	Y(){
		this(3);
		System.out.println("zero-arg constructor");
	}
	
	Y(int a){
		
		System.out.println("one-arg constructor");
	}
}

public class Test20 {
	public static void main(String[] args) {
		Y obj=new Y();
	}
}
