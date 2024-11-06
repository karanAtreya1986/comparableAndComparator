package com.comparable.comparator;

public class CreateInstanceOfEnum {

	enum Company2 {
		AMAZON, GOOGLE, YAHOO, PAYPAL
	}

	Company2 c1;

	public CreateInstanceOfEnum(Company2 c1) {
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

		// cannot create instance of enum.
		// compile error - Cannot instantiate the type CreateInstanceOfEnum.Company2
		// You cannot create instance of enum using new keyword. This is because
		// constructor of enum is private.
//		Company2 c1 = new Company2();

		CreateInstanceOfEnum e1 = new CreateInstanceOfEnum(Company2.AMAZON);
		e1.companyDetails();
		CreateInstanceOfEnum e2 = new CreateInstanceOfEnum(Company2.GOOGLE);
		e2.companyDetails();

	}
}
