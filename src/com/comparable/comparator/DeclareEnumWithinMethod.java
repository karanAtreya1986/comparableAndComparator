//package com.comparable.comparator;
//
////enum names cant be repeated in multiple files under same package.
////compile error - The type Company is already defined
////enum Company1 {
////	AMAZON, GOOGLE, YAHOO, PAYPAL
////}
//
//public class DeclareEnumWithinMethod {
//
//	Company1 c1;
//
//	public DeclareEnumWithinMethod(Company1 c1) {
//		super();
//		this.c1 = c1;
//	}
//
//	public void companyDetails() {
//		switch (c1) {
//		case AMAZON:
//			System.out.println("Hello amazon");
//			break;
//
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
//
//		// enum cannot be inside method.
//		// compile error - The member enum Company1 can only be defined inside a
//		// top-level class or interface or in a static context
////		enum Company1{AMAZON,GOOGLE,YAHOO,PAYPAL}
//	}
//
//	public static void main(String[] args) {
//
//		DeclareEnumWithinMethod e1 = new DeclareEnumWithinMethod(Company1.AMAZON);
//		e1.companyDetails();
//		DeclareEnumWithinMethod e2 = new DeclareEnumWithinMethod(Company1.GOOGLE);
//		e2.companyDetails();
//
//	}
//}
