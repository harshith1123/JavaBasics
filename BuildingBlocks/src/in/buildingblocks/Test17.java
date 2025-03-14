package in.buildingblocks;


// parameterized constructor
class Category{
	int categoryId;
	String categoryName;
		
	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

//	this method is present in the Object class 
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	
}

public class Test17 {

	public static void main(String[] args) {
		Category c1 = new Category(101,"Electronics");
		Category c2 = new Category(102,"Mobiles");
		System.out.println(c1);  // internally it will call c1.toString
		System.out.println(c2);

	}

}
