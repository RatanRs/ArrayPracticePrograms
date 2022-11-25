package com.bridgelabz;
/***
 * 
 * @author Admin
 *
 */

public class ElementsOnOddPosition {
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = { 12, 15, 45, 78, 58, 96, 35, 25, 87, 98 };
		/*
		 * Checking the condition by using for loop
		 */

		for (int i = 1; i < array.length; i += 2) {

			System.out.print(array[i] + "  ");
		}
	}
}



