package demo.rescursive;

import java.util.Scanner;

public class Recursion {
	
	public static int binarySearch(int arr[], int key, int left, int right) {
		
		if(left > right) {
			return -1;
		}
		
		int mid = (left+right)/2;
		
		if(key == arr[mid])
			return mid;
		
		if(key > arr[mid])
			return binarySearch(arr, key, mid+1, right);
		
		if(key < arr[mid])
			return binarySearch(arr, key, left, mid-1);
		
		return -1;
	}
		

	public static void main(String[] args) {

		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = binarySearch(arr, key, 0, arr.length-1);
		
		if(index != -1) {
			System.out.println(" Key found at index : "+index);
		}
		else 
			System.out.println(" Key not Found 99");
	}
}
