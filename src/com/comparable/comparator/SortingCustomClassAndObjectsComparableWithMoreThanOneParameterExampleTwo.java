package com.comparable.comparator;

import java.util.Arrays;

public class SortingCustomClassAndObjectsComparableWithMoreThanOneParameterExampleTwo {

	// To sort objects we need comparable or comparator.

	public static void main(String[] args) {

		// interesting way to create objects.
		// we can have array of objects also.
		// sorry this is not object creation, this is new array creation.
		EmployeeComparingMoreThanOneParameterExampleTwo e1[] = new EmployeeComparingMoreThanOneParameterExampleTwo[4];
		// now we create object of the class.
		e1[0] = new EmployeeComparingMoreThanOneParameterExampleTwo(1, 34, 2323423, "tiger");
		e1[1] = new EmployeeComparingMoreThanOneParameterExampleTwo(1, 34, 2323423, "tiger");
		e1[2] = new EmployeeComparingMoreThanOneParameterExampleTwo(0, -5654634, -35345345, "liongate");
		e1[3] = new EmployeeComparingMoreThanOneParameterExampleTwo(-76575671, 43243, -54654654, "bola");

		// since its arrays, we can use arrays.sort()
		// we also pass in the comparator to this.
		// now sorted in ascending order of salary.
		Arrays.sort(e1, EmployeeComparingMoreThanOneParameterExampleTwo.salaryComparator);
		String s1 = Arrays.toString(e1);
		System.out.println("salary comparator --> "+s1);
		
		Arrays.sort(e1, EmployeeComparingMoreThanOneParameterExampleTwo.nameComparator);
		String s2 = Arrays.toString(e1);
		System.out.println("name comparator --> "+s2);
		
		Arrays.sort(e1, EmployeeComparingMoreThanOneParameterExampleTwo.ageComparator);
		String s3 = Arrays.toString(e1);
		System.out.println("age comparator --> "+s3);

	

	}

}
