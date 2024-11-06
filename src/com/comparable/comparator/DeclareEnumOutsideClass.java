package com.comparable.comparator;

//if you add visibility then we get compile error -
//The public type Company must be defined in its own file
//public enum Company {
//	AMAZON, GOOGLE, YAHOO, PAYPAL
//}

//remove visibility and it works.
//inside one class file, there can be only one public class.
enum Company {
	AMAZON, GOOGLE, YAHOO, PAYPAL
}

public class DeclareEnumOutsideClass {

	Company c1;

	public DeclareEnumOutsideClass(Company c1) {
		super();
		this.c1 = c1;
	}

	public void companyDetails() {
		switch (c1) {
		case AMAZON:
			System.out.println("Hello amazon");
			break;

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

		DeclareEnumOutsideClass e1 = new DeclareEnumOutsideClass(Company.AMAZON);
		e1.companyDetails();
		DeclareEnumOutsideClass e2 = new DeclareEnumOutsideClass(Company.GOOGLE);
		e2.companyDetails();

	}
}
