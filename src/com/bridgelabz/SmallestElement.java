package com.bridgelabz;

/***
 * 
 * @author Admin
 *
 */
public class SmallestElement {
	/***
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Storing thenumbers into array
		 */
		int[] array = { 11, 45, 63, 90 };

		int smallestArray = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < smallestArray) {
				smallestArray = array[i];
			}
		}
		System.out.println("smallest element of the array is=" + smallestArray);
	}
}
