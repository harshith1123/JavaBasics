package com.arrays;

class CustomArray{
	private int[] ar; // initially it is pointing null as we didn't initialize to any values.
	private int size;
	
	CustomArray(int size){
		this.size=size;
		ar = new int[size];
	}
	
	private boolean isValidIndex(int indexPosition) {
		boolean flag = true;
		if(indexPosition<0 || indexPosition>=this.size) {
			flag = false;
		}
		return flag;
	}
	
	public void insertElement(int indexPosition, int element) {
		if(!(isValidIndex(indexPosition))) {
			System.out.println("invalid index position");
			return;
		}
		else if(this.ar[indexPosition]!=0) {
			System.out.println("position is not empty");
			return;
		}
		this.ar[indexPosition]=element;
		System.out.println("Element added at indexPosition: "+indexPosition);
	}
	
	public void readArray() {
		System.out.print("[");
		for(int i=0;i<this.ar.length;i++) {
			System.out.print(this.ar[i]+" ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public void readElementAtGivenIndex(int indexPosition) {
		if(!(isValidIndex(indexPosition))) {
			System.out.println("invalid index position");
			return;
		}
		else if(this.ar[indexPosition]==0) {
			System.out.println("No element found at indexPosition :"+indexPosition);
			return;
		}
		System.out.println("Element present at indexPosition :"+indexPosition+" = "+this.ar[indexPosition]);
	}
	public void updateArray(int indexPosition, int updatedElement) {
		if(!isValidIndex(indexPosition)) {
			System.out.println("invalid index position");
			return;
		}
		else if(this.ar[indexPosition]==0) {
			System.out.println("Can't perform updation");
			return;
		}
		this.ar[indexPosition]=updatedElement;
	}
	
	public void deleteArray(int indexPosition) {
		if(!isValidIndex(indexPosition)) {
			System.out.println("invalid index position");
		}
		else if(this.ar[indexPosition]==0) {
			System.out.println("Can't perform deletion");
			return;
		}
		this.ar[indexPosition]=0;
	}
}

public class Test {

	public static void main(String[] args) {
		CustomArray obj = new CustomArray(5);
		obj.readArray();
		obj.insertElement(2,3);
		obj.insertElement(1, 10);
		obj.insertElement(3, 30);
		obj.readArray();
//		obj.readElementAtGivenIndex(2);
		obj.updateArray(2,6);
		obj.readArray();
		
		obj.deleteArray(2);		
		obj.readArray();		
	}

}
