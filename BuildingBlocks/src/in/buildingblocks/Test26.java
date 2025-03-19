package in.buildingblocks;

public class Test26 {
	
	public static int pow(int a,int b) {
		if(b==1) {
			return a*b;
		}
		else {
			return a*pow(a,(b-1));
		}
	}

	public static void main(String[] args) {
		System.out.println(pow(3,4));
	}
}