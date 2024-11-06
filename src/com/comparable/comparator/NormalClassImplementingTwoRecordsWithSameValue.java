package com.comparable.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class NormalClassImplementingTwoRecordsWithSameValue {

	// when two records have same data for comparison, it is returned in the way we
	// have inserted them.

	public static void main(String[] args) {

		ImplementComparableComparatorInOneShort e1[] = new ImplementComparableComparatorInOneShort[4];

		e1[0] = new ImplementComparableComparatorInOneShort(1, 34, 2323423, "tiger");
		e1[1] = new ImplementComparableComparatorInOneShort(1, 334, 3434, "lioness");
		e1[2] = new ImplementComparableComparatorInOneShort(-1324234, -5654634, -35345345, "liongate");
		e1[3] = new ImplementComparableComparatorInOneShort(-76575671, -5654634, -54654654, "bola");

		Arrays.sort(e1, Comparator.comparing(ImplementComparableComparatorInOneShort::getAge));
		String s1 = Arrays.toString(e1);
		System.out.println("age comparator --> " + s1);

		Arrays.sort(e1);
		String s2 = Arrays.toString(e1);
		System.out.println("id comparator --> " + s2);
	}

}
