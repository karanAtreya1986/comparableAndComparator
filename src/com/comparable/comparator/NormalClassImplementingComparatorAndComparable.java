package com.comparable.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class NormalClassImplementingComparatorAndComparable {

	public static void main(String[] args) {

		// when we dont assign values properly, to the correct index we get null pointer
		// exception.
		// The NullPointerException you're seeing occurs because your array e1 has
		// uninitialized or duplicate entries due to the following issues:
		// Overwriting Array Elements: You are assigning values to e1[0] multiple times,
		// so only the last assignment to e1[0] will persist. Specifically, you assign
		// values to e1[0] three times, and e1[1] once, which leaves e1[2] and e1[3]
		// uninitialized (null).
		// Null Values in Array: Since e1 contains null values, calling Arrays.sort(e1,
		// Comparator.comparing(ImplementComparableComparatorInOneShort::getAge)) will
		// cause a NullPointerException because Comparator.comparing cannot compare null
		// values.To fix this, ensure each element in e1 is initialized and has unique
		// indices:

		ImplementComparableComparatorInOneShort e1[] = new ImplementComparableComparatorInOneShort[4];
//		e1[0] = new ImplementComparableComparatorInOneShort(1, 34, 2323423, "tiger");
//		e1[1] = new ImplementComparableComparatorInOneShort(1, 34, 2323423, "tiger");
//		e1[0] = new ImplementComparableComparatorInOneShort(-1324234, -5654634, -35345345, "liongate");
//		e1[0] = new ImplementComparableComparatorInOneShort(-76575671, 43243, -54654654, "bola");
		
		e1[0] = new ImplementComparableComparatorInOneShort(1, 34, 2323423, "tiger");
		e1[1] = new ImplementComparableComparatorInOneShort(1, 34, 2323423, "tiger");
		e1[2] = new ImplementComparableComparatorInOneShort(-1324234, -5654634, -35345345, "liongate");
		e1[3] = new ImplementComparableComparatorInOneShort(-76575671, 43243, -54654654, "bola");

		Arrays.sort(e1, Comparator.comparing(ImplementComparableComparatorInOneShort::getAge));
		String s1 = Arrays.toString(e1);
		System.out.println("age comparator --> " + s1);

		Arrays.sort(e1);
		String s2 = Arrays.toString(e1);
		System.out.println("id comparator --> " + s2);
	}

}
