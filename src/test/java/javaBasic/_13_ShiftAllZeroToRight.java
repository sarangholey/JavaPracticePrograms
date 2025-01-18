package javaBasic;

import java.util.Arrays;

public class _13_ShiftAllZeroToRight {

	public static void main(String[] args) {
		int[] i = new int[] {1, 0, 2, 5, 0, 7, 9};
		System.out.println(Arrays.toString(shiftAllZeroToRight(i)));;

	}
	public static int[] shiftAllZeroToRight(int[] a) {
		if(a.length == 1) {
			return a;
		}
		int newArray[] = new int[a.length];
		int count = 0;
		for(int number : a) {
			if(number !=0) {
				newArray[count] = number;
				count++;
			}
		}
		return newArray;	
	}
}
