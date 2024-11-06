package com.comparable.comparator;

import java.util.Arrays;

public class SortingCustomClassAndObjectsWithComparable {

	// To sort objects we need comparable or comparator.

	public static void main(String[] args) {

		// interesting way to create objects.
		// we can have array of objects also.
		// sorry this is not object creation, this is new array creation.
		EmployeeCustomClassWithComparable e1[] = new EmployeeCustomClassWithComparable[4];
		// now we create object of the class.
		e1[0] = new EmployeeCustomClassWithComparable(1, 34, 2323423, "tiger");
		e1[1] = new EmployeeCustomClassWithComparable(1, 34, 2323423, "tiger");
		e1[2] = new EmployeeCustomClassWithComparable(0, -5654634, -35345345, "liongate");
		e1[3] = new EmployeeCustomClassWithComparable(-76575671, 43243, -54654654, "bola");

		// since its arrays, we can use arrays.sort()
		Arrays.sort(e1);

		String s1 = Arrays.toString(e1);

		// sorted based on id.
		System.out.println(s1);

	}

}
