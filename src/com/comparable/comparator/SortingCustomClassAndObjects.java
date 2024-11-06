package com.comparable.comparator;

import java.util.Arrays;

public class SortingCustomClassAndObjects {

	// To sort objects we need comparable or comparator.

	public static void main(String[] args) {

		// interesting way to create objects.
		// we can have array of objects also.
		// sorry this is not object creation, this is new array creation.
		EmployeeCustomClass e1[] = new EmployeeCustomClass[4];
		// now we create object of the class.
		e1[0] = new EmployeeCustomClass(1, 34, 2323423, "tiger");
		e1[1] = new EmployeeCustomClass(1, 34, 2323423, "tiger");
		e1[0] = new EmployeeCustomClass(-1324234, -5654634, -35345345, "liongate");
		e1[0] = new EmployeeCustomClass(-76575671, 43243, -54654654, "bola");

		// since its arrays, we can use arrays.sort()
		Arrays.sort(e1);

		String s1 = Arrays.toString(e1);

		// we get class cast exception.
		// because this is object and how to sort is not mentioned, so we need
		// comparators or comparable for objects.
		System.out.println(s1);

	}

}
