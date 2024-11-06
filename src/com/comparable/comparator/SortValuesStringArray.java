package com.comparable.comparator;

import java.util.Arrays;

public class SortValuesStringArray {

//	Comparable versus comparator interface-
//	Comparator gives compareTo() method.
//	Comparable gives compare() method.
//	Both help in sorting.
//	To convert any array or object to a string format use toString() method.
	//Sort method sorts in Ascending order only.

	public static void main(String[] args) {

//		String a[] = { "tiger", "zebra", "tiger", null, "gorilla", null };
		String a[] = { "tiger", "zebra", "tiger", "gorilla" };
		// arrays has inbuilt method to sort.
		// return type is void.
		// sorting happens in place and original array is now sorted.
		// when string has null values then we get null pointer exception.
		Arrays.sort(a);
		// this will print memory address as its reference.
		System.out.println(a);
		// to print the actual values in arrays or objects use the tostring() method
		String s1 = a.toString();
		// this will also print the memory address.
		System.out.println(s1);

		// correct way to use tostring() method is use objectname.tostring() OR
		// arrayname.tostring()
		// Tostring – converts output in regular string so it becomes human readable.
		String s2 = Arrays.toString(a);
		// sorted array is printed.
		System.out.println(s2);
	}

}
