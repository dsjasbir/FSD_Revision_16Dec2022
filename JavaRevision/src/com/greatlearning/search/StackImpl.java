package com.greatlearning.search;

public class StackImpl {

	int Size_of_Stack = 1000;

	int[] arr = new int[Size_of_Stack];

	int counter = -1;

	boolean push(int x) {

		if (counter >= (Size_of_Stack - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			arr[++counter] = x;
			System.out.println(x + " pushed in Stack");
			return true;
		}

	}

	int pop() {

		if (counter < 0) {

			System.out.println("Stock underflow");
			return 0;

		}

		int x = arr[counter--];
		return x;

	}

	void printStack() {

		for (int i = counter; counter >=0; i--) {

			System.out.println(arr[i]);
			
			if(i==0)
				break;
			
			
		}

	}

}
