package com.greatlearning.search;

public class BinarySearch {

	
	public static int bin_search(int[] arr , int key , int low , int high) {
		
		int mid = (low + high) / 2 ;
		
		if (arr[mid] == key)
			return mid;
			
		
		if (low == high)
			return -1;
	
		
		if (arr[mid] > key) 
			return bin_search(arr,key,low, mid-1);
			
		if (arr[mid] < key)
			return bin_search(arr,key,mid+1,high);
		
		
		return -1;
		
	}
	
	

}
