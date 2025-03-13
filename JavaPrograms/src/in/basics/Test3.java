package in.basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student{
	int studentId;
	String studentName;
	
	public void getStudentDetails() {
		System.out.println("student data");
	}
}


public class Test3 {

	public static void main(String[] args) {
		Student s1=new Student();
		
		Class c = s1.getClass(); // Class object will provide entire information of that file
		
		System.out.println(c);
		
		Field[] fields = c.getDeclaredFields();
		
		for(Field field:fields) {
			System.out.println(field.getName());
		}
		
		Method[] declaredMethods = c.getDeclaredMethods();
		for(Method method:declaredMethods) {
			System.out.println(method.getName());
		}
	}

}
