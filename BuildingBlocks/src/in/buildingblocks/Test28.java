package in.buildingblocks;

public class Test28 {
	
	static int  sum=0;
	static int rem=0;
	
	public static int sumOfDigits(int num) {
		
		if(num==0) return sum;
		else {
			int val=num/10;	
			rem=num%10;
			sum+=rem;
			return sumOfDigits(val);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(12345));
	}

}
