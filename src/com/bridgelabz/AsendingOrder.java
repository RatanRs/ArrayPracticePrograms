package com.bridgelabz;

/***
 * 
 * @author Admin
 *
 */

public class AsendingOrder {
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 78, 98, 45, 65, 21, 32, 54, 85, 41 };
		int number = 0;
		int lengthOfArray = array.length;
		/**
		 * Used for loop to check the condition.
		 */
		for (int i = 0; i < lengthOfArray; i++) {
			for (int j = i + 1; j < lengthOfArray; j++) {
				if (array[i] > array[j]) {
					number = array[i];
					array[i] = array[j];
					array[j] = number;
				}
			}
			System.out.print(array[i] + "  ");
		}
	}
}