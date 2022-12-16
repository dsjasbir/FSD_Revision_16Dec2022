package com.greatlearning.search;

public class DriverBinary {

	public static void main() {

		int[] arr2 = { 23, 45, 67, 89, 90 };
		int high = arr2.length;
		int low = 0;
		int key = 90;

		int index = BinarySearch.bin_search(arr2, key, low, high);

		if (index == -1) {

			System.out.println("Searched Element is not present in Array");

		} else {

			System.out.println("Searched Element is found at positions " + index);

		}
	}
}
