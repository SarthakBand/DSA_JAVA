package demo.linear;

import java.util.Scanner;

public class Linear {

	public static int linearSearch(int arr[], int key) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr [] = {88, 33, 66, 99, 11, 77, 22, 55, 14};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the key to be searched : ");
		int key = sc.nextInt();
		
		int index = linearSearch(arr, key);
		
		if( index != -1 ) {
			System.out.println(" Key found at index : "+index);
		}
		else 
			System.out.println(" Key is not found ");
	}
}
