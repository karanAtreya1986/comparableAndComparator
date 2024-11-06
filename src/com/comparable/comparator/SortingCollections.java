package com.comparable.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

	// applies to all collections.
	//Sort method sorts in Ascending order only.

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(1);
		l1.add(0);
		l1.add(654645654);
		l1.add(-345345);
		l1.add(-234234);
		l1.add(154565465);

		// return type of sort is void.
		Collections.sort(l1);

		// since its collection, no need of tostring() method.
		// directly print the collection name and you are done.
		System.out.println(l1);

	}

}
