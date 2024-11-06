package com.comparable.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class NormalClassImplementingEmployeeWithoutToString {

	public static void main(String[] args) {


		EmployeeClassWithoutToString e1[] = new EmployeeClassWithoutToString[4];
		
		e1[0] = new EmployeeClassWithoutToString(1, 34, 2323423, "tiger");
		e1[1] = new EmployeeClassWithoutToString(1, 34, 2323423, "tiger");
		e1[2] = new EmployeeClassWithoutToString(-1324234, -5654634, -35345345, "liongate");
		e1[3] = new EmployeeClassWithoutToString(-76575671, 43243, -54654654, "bola");

		Arrays.sort(e1, Comparator.comparing(EmployeeClassWithoutToString::getAge));
		String s1 = Arrays.toString(e1);
		System.out.println("age comparator --> " + s1);

		Arrays.sort(e1);
		String s2 = Arrays.toString(e1);
		System.out.println("id comparator --> " + s2);
	}

}
