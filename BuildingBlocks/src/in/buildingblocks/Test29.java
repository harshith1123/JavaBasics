package in.buildingblocks;

public class Test29 {
	static int rev=0;
	
	public static int reverseNum(int num) {
		if(num==0) return rev;
		else {
			rev=rev*10+(num%10);
			return reverseNum(num/10);
		}
	}

	public static void main(String[] args) {
		System.out.println(reverseNum(3495));

	}

}
