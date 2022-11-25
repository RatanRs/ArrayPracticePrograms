package com.bridgelabz;
/***
 * 
 * @author Admin
 *
 */

public class ReverseOrder {
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = { 11, 45, 63, 90 };
		/**Checking the condition by using for loop.
		 */

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i] + " ");
		}
	}
}