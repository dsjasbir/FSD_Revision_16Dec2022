package com.greatlearning.search;

public class Driver {

	public static void main(String[] args) {

		// Liner Search		
		
		int[] arr = { 45, 54, 11, 27, 65 };
		int nSize = arr.length;

		int x = 27;

		int index = LinerSearch.search(arr, nSize, x);

		if (index == -1) {

			System.out.println("Searched Element is not present in Array");

		} else {

			System.out.println("Searched Element is found at positions " + index);

		}
		
		


	}

}
