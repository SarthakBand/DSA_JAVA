package demo.binarysearch;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int arr[], int key) {

		int left = 0, right = arr.length - 1, mid;

		while (left <= right) {

			mid = (left + right) / 2;
			
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				left = mid + 1;
			} else
				right = mid - 1;
		}
		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();

		int indx = binarySearch(arr, key);

		if (indx != -1) {
			System.out.println(" Key found at index : " + indx);
		} else
			System.out.println(" Key not Found ");
	}
}
