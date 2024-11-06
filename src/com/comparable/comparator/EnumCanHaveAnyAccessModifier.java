package com.comparable.comparator;

public class EnumCanHaveAnyAccessModifier {
	
	//output of every access modifier is the same

	// enum can be public
//	public enum Company {
//		AMAZON, GOOGLE, YAHOO, PAYPAL
//	}

	// enum can be private.
//	private enum Company {
//		AMAZON, GOOGLE, YAHOO, PAYPAL
//	}

	// enum can be protected.
//	protected enum Company {
//		AMAZON, GOOGLE, YAHOO, PAYPAL
//	}

	// enum can be default.
	enum Company {
		AMAZON, GOOGLE, YAHOO, PAYPAL
	}

	Company c1;

	public EnumCanHaveAnyAccessModifier(Company c1) {
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
		// how to call enum.
		// enum name.values.
		EnumCanHaveAnyAccessModifier e1 = new EnumCanHaveAnyAccessModifier(Company.AMAZON);
		e1.companyDetails();
		EnumCanHaveAnyAccessModifier e2 = new EnumCanHaveAnyAccessModifier(Company.GOOGLE);
		e2.companyDetails();
		// enum prevents invalid data to be sent.
		// compile error - INVALID cannot be resolved or is not a field
//		HowEnumWorks e3 = new HowEnumWorks(Company.INVALID);
//		e3.companyDetails();
	}
}
