package in.buildingblocks;

class Product1{
	int productId;
	String productName;
	float productPrice;
	
	public Product1(int productId, String productName,float productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;		
	}
	
	public Product1 showDetails() {		
		return this;
	}

	@Override
	public String toString() {
		return "Product1 [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
}

public class Test19 {

	public static void main(String[] args) {
		Product1 p = new Product1(21,"Rolls Royce",100.0f);
		System.out.println(p.showDetails());
		
	}

}
