package in.buildingblocks;

public class Test8 {
	public int add(int n1,int n2) {
		return  n1+n2;
	}
	
	public void print() {
		return;
	}
	public static void main(String[] args) {
		System.out.println("main() called");
		Test8 obj= new Test8();
		int var = obj.add(12,12);
		System.out.println(var);
		
	}

}
