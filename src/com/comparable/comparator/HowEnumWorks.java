package com.comparable.comparator;

public class HowEnumWorks {

	// Enum-
	// Predefined list of constants.
	// Enum is data type.
	// enum helps avoid exceptions during run time if the value is not present.
	// How to use enum-
	// 1.create enum object.
	// 2.constructor and pass enum object.
	//second way:
//	Steps in enum-
//	1.create enum.
//	2. create variable of same enum type.
//	3. create constructor (optional).
//	4. use the variable created in step 2 and use it further in program.


	// Enum constants are static final by default. Cant be changed once created.
	// Enum once created then its done, cant add more values. Enum belongs to class,
	// hence its static. Since they cant be modified so they are also final. Enums
	// can be declared outside or inside of class, but never inside methods. Enums
	// do not come under variables, objects. They are pre-defined list of constants.

	public enum Company {
		AMAZON, GOOGLE, YAHOO, PAYPAL
	}

	Company c1;

	public HowEnumWorks(Company c1) {
		super();
		this.c1 = c1;
	}

	public void companyDetails() {
		switch (c1) {
		case AMAZON:
			System.out.println("Hello amazon");
			break;
		// how to give multiple cases and common functionality for them.
		case GOOGLE:
		case YAHOO:
			System.out.println("Hello internet searchers");
			break;
		case PAYPAL:
			System.out.println("hello paypal");
			break;
		default:
			System.out.println("invalid company");
			break;
		}
	}

	public static void main(String[] args) {
		// how to call enum.
		// enum name.values.
		HowEnumWorks e1 = new HowEnumWorks(Company.AMAZON);
		e1.companyDetails();
		HowEnumWorks e2 = new HowEnumWorks(Company.GOOGLE);
		e2.companyDetails();
		// enum prevents invalid data to be sent.
		// compile error - INVALID cannot be resolved or is not a field
//		HowEnumWorks e3 = new HowEnumWorks(Company.INVALID);
//		e3.companyDetails();
	}
}
