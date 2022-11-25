package com.bridgelabz;

/***
 * 
 * @author Admin
 *
 */
public class SecondlargestElement {
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 10, 15, 5, 8, 78, 98, 56, 25, 45, 65 };
		int largestNumber = 0;
		int secondLargestNumber = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largestNumber) {
				secondLargestNumber = largestNumber;
				largestNumber = array[i];
			} else if (array[i] > secondLargestNumber && array[i] != largestNumber) {
				secondLargestNumber = array[i];
			}
		}
		if (largestNumber == 0) {
			System.out.println("No largest number");
		} else {
			System.out.println("Second Largest number is => " + secondLargestNumber);
		}

	}
}
