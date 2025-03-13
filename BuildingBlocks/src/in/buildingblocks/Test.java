package in.buildingblocks;

class Product{
	int productId =10;
	String productName="abc";
	static String category="xyz";
			
	public void showDetails(Product obj) {
		System.out.println(obj.productId+"\n"+obj.productName+"\n"+Product.category);
	}
}

public class Test {

	public static void main(String[] args) {		
		Product p = new Product();
		p.showDetails(p);
	}
}