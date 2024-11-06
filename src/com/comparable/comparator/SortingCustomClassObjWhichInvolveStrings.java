package com.comparable.comparator;

import java.util.Arrays;

public class SortingCustomClassObjWhichInvolveStrings {

	public static void main(String[] args) {

		EmployeeComparingStringsAndReturningInteger e1[] = new EmployeeComparingStringsAndReturningInteger[4];

		e1[0] = new EmployeeComparingStringsAndReturningInteger(1, 34, 2323423, "tiger");
		e1[1] = new EmployeeComparingStringsAndReturningInteger(1, 34, 2323423, "tiger");
		e1[2] = new EmployeeComparingStringsAndReturningInteger(0, -5654634, -35345345, "liongate");
		e1[3] = new EmployeeComparingStringsAndReturningInteger(-76575671, 43243, -54654654, "bola");

		Arrays.sort(e1, EmployeeComparingStringsAndReturningInteger.salaryComparator);
		String s1 = Arrays.toString(e1);
		System.out.println("salary comparator --> " + s1);

		Arrays.sort(e1, EmployeeComparingStringsAndReturningInteger.nameComparator);
		String s2 = Arrays.toString(e1);
		System.out.println("name comparator --> " + s2);

	}

}
