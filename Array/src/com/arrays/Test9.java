package com.arrays;

public class Test9 {

	public static void main(String[] args) {
		int[][] arr = {{11,2,14},{5,1,19},{6,1,3}};		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==0) {
					arr[i][j]=arr[i][j];
					System.out.print(arr[i][j]+" ");
					if(j==arr.length-1) {
						System.out.println();
					}
				}				
				if(i==1) {					
					int temp=arr.length-1;
					int row=1;
					for(int k=0;k<arr[i].length;k++) {
						arr[i][k]=arr[row][temp];
						System.out.print(arr[i][k]+" ");
						row++;
						if(row==arr.length) {
							row--;
						}
					}
					
				}
			}
		}

	}

}
