//package com.comparable.comparator;
//
//public class EnumCannotBeNumber {
//
//	// compile error - Syntax error on token(s), misplaced construct(s)
//	// Syntax error on tokens, delete these tokens
//Predefined list of constants, but they should not be number.
//No invalid values can be passed is the advantage.
//Enum is predefined list of constants. Enum cannot be numerical data.

//advantage of enum is unknown values will never come and we never get error related to enum data because the data has to be correct when entering by the user.
////	public enum Company {
////		1, 234, 345345, 345435345
////	}
//
//	Company c1;
//
//	public EnumCannotBeNumber(Company c1) {
//		super();
//		this.c1 = c1;
//	}
//
//	public void companyDetails() {
//		switch (c1) {
//		case AMAZON:
//			System.out.println("Hello amazon");
//			break;
//		// how to give multiple cases and common functionality for them.
//		case GOOGLE:
//		case YAHOO:
//			System.out.println("Hello internet searchers");
//			break;
//		case PAYPAL:
//			System.out.println("hello paypal");
//			break;
//		default:
//			System.out.println("invalid company");
//			break;
//		}
//	}
//
//	public static void main(String[] args) {
//		// how to call enum.
//		// enum name.values.
//		EnumCannotBeNumber e1 = new EnumCannotBeNumber(Company.AMAZON);
//		e1.companyDetails();
//		EnumCannotBeNumber e2 = new EnumCannotBeNumber(Company.GOOGLE);
//		e2.companyDetails();
//		// enum prevents invalid data to be sent.
//		// compile error - INVALID cannot be resolved or is not a field
////		HowEnumWorks e3 = new HowEnumWorks(Company.INVALID);
////		e3.companyDetails();
//	}
//}
