package in.buildingblocks;

public class Test25 {
	static int sum=0;
	public static int sum(int i) {
		if(i==6) return sum;
		sum+=i;
		return sum((i+1));
				
	}

	public static void main(String[] args) {
		System.out.println(sum(1));

	}

}
