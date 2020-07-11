/* This program will determine the distinct numbers,
 * after the user enters 10 numbers, using the linear
 * search. */

import java.util.Scanner;	//importing the Scanner in Java

public class DistinctNumberWithLinearSearch {
	//Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//generating the scanner object to store the value provided by the user
		int[] numbers = new int[10];		//creating an array of index 10 to store 10 numbers

		// Asking the user to enter ten numbers
		System.out.println("Please enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();

		// To get the distinct numbers, calling the method eliminateDuplicate(numbers)
		int[] distinctNumbers = eliminateDuplicates(numbers);
		input.close();
		// Displaying the results of the distinct numbers
		System.out.print("The distinct numbers are:");
		
		/* Loop for displaying each and every element of the array "distinctNumbers" */
		for (int d: distinctNumbers) {
			if (d > 0)
				System.out.print(" " + d);
		}
		System.out.println();
	}

	/* The method eleminateDuplicates returns a new array with the distinct numbers */
	public static int[] eliminateDuplicates(int[] list) {
		int[] distinctList = new int[list.length];		//creating an array to store the distinct numbers
		int i = 0;	//initializing the variable "i" for the index of the distinctList
		
		/* for the variables in the array list, calling another method to determine the distinct numbers and storing them in an other array */
		for (int d: list) {	
			if (linearSearch(distinctList, d) == -1) {
				distinctList[i] = d;
				i++;
			}
		}
		return distinctList;
	}

	/* Method for the linearSearch of the non-duplicating variables */
	public static int linearSearch(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}
}