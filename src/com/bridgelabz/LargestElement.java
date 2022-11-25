package com.bridgelabz;
/***
 * 
 * @param args
 */

public class LargestElement {
/***
 * 
 * @param args
 */

	public static void main(String[] args) {
		int[] array= {10,20,30,21,22};
		int emptyArray=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>emptyArray) {
				emptyArray=array[i];
				
				
			}
		}
System.out.println(emptyArray);
}
}