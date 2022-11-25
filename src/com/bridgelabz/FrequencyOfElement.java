package com.bridgelabz;

/***
 * 
 * @author Admin
 *
 */

public class FrequencyOfElement {
	/***
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		/*
		 * Storing numbers into array
		 */
		int array[] = { 10, 20, 30, 10, 20 };

		boolean visited[] = new boolean[5];
		/*
		 * checking the condition by using for loop.
		 * 
		 */
		for (int i = 0; i < array.length; i++) {
			if (visited[i] == true) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println("Frequency of " + array[i] + " is => " + count + " times");
		}
	}

}
