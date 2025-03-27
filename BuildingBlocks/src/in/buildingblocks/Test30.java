package in.buildingblocks;

public class Test30 {
	
	public static void arithmeticOperators() {
		int a =10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

	public static void relationalOperators() {
		int a =10;
		int b = 20;
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
	}
	
	public static void logicalOperators() {
		int a=5;
		int b=10;
		System.out.println((a!=b) && (a==b));
		System.out.println((a!=b) || (a==b));
	}
	
	public static void unaryOperators() {
		int a=10;
//		int b=a++;
		int b=++a;
		System.out.println(a+" "+b);
		
		int x = ~(12); // -(x+1)
	}
	
	public static void bitwiseOperators() {
		int a=5;  // 0 1 0 1		
		int b=11; // 1 0 1 1
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a|b);
		System.out.println(a^b);		
	}
	
	public static void shiftOperators() {
		int a =20;
		System.out.println(a<<2);  // a * 2^m
		System.out.println(a>>3); // a/2^m
	}
	
	public static void ternaryOperator() {
		// var result = (condition) ? exp1 : exp2
		boolean flag= true;
		String result = !flag? "Java": "Python";
		System.out.println(result);
	}
	
	public static void assignmentOperators() {
		int a =10;
		
		a+=20;  // a= a+20
		System.out.println(a);
		
		a%=10;
		System.out.println(a);
	}
	
	public static void instanceOf() {
		String str = "Java";
		if(str instanceof String) {
			System.out.println(str.length());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("____________________________________");
		arithmeticOperators();
		
		System.out.println("____________________________________");
		relationalOperators();
		
		System.out.println("____________________________________");
		logicalOperators();
		
		System.out.println("____________________________________");
		unaryOperators();
		
		System.out.println("____________________________________");		
		bitwiseOperators();		
		
		System.out.println("____________________________________");		
		shiftOperators();		
		
		System.out.println("____________________________________");
		ternaryOperator();
		
		System.out.println("____________________________________");
		assignmentOperators();
		
		System.out.println("____________________________________");
		instanceOf();
	}

}
