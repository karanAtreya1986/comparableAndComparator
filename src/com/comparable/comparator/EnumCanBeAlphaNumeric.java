package com.comparable.comparator;

public class EnumCanBeAlphaNumeric {

	// compile errors when we write enums like this -
	// Syntax error on tokens, delete these tokens - for AHAWE_12313!@#!@# enum
	// value.
	// Underscores have to be located within digits - for 23432_ewrwerwer enum
	// value.
	// Invalid float literal number for - 3242343erwerewrwerwer enum value.
	// Syntax error, insert ")" to complete Arguments for - 4567-werewr enum value.
	// Syntax error on token "1", delete this token for - 1SYS enum value.
	// Syntax error on tokens, UnannotatableQualifiedName expected instead for -
	// @#$#@$EWREWR enum value
	// Syntax error on token "Test", delete this token for - _5 Test enum value.
	// Syntax error on tokens, delete these tokens - _@#$#24WEREWR not allowed.
	// $3Test, _TEST$1234 -- dollar and underscore valid letters for enums.
	public enum Company {
		GOOGLE, YAHOO, SYS_23432423, TEST, $3Test, _TEST$1234
	}

	Company c1;

	public EnumCanBeAlphaNumeric(Company c1) {
		super();
		this.c1 = c1;
	}

	public void companyDetails() {
		switch (c1) {
//		case AMAZON:
//			System.out.println("Hello amazon");
//			break;
		case SYS_23432423:
			System.out.println("Hello SYS_23432423");
			break;
		// how to give multiple cases and common functionality for them.
		case GOOGLE:
		case YAHOO:
			System.out.println("Hello internet searchers");
			break;
		// since enum value paypal not there, so compile error - PAYPAL cannot be
		// resolved or is not a field
//		case PAYPAL:
//			System.out.println("hello paypal");
//			break;
//		case TEST:
//			System.out.println("Hello TEST");
//			break;
		default:
			System.out.println("invalid company");
			break;
		}
	}

	public static void main(String[] args) {
		// compile error when we pass invalid values - AMAZON cannot be resolved or is
		// not a field
//		EnumCanBeAlphaNumeric e1 = new EnumCanBeAlphaNumeric(Company.AMAZON);
//		e1.companyDetails();
		EnumCanBeAlphaNumeric e1 = new EnumCanBeAlphaNumeric(Company.SYS_23432423);
		e1.companyDetails();
		EnumCanBeAlphaNumeric e2 = new EnumCanBeAlphaNumeric(Company.GOOGLE);
		e2.companyDetails();
		// does not allow us to add invalid values which are not in enum - compile error
		// - INVALID cannot be resolved or is not a field
//		HowEnumWorks e3 = new HowEnumWorks(Company.INVALID);
//		e3.companyDetails();
	}
}
