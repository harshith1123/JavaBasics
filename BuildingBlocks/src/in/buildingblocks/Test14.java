package in.buildingblocks;

// differentiating between instance and local variable when they have same name

class Student{
	int studentId = 101;
	String studentName = "Harsh";
			
	public void showDetails() {
		int studentId = 201;
		System.out.println(this.studentId+" "+this.studentName);
	}
}
public class Test14 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.showDetails();

	}

}
