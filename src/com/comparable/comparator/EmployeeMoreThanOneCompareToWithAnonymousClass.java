package com.comparable.comparator;

import java.util.Comparator;

//more than one compareto() out of question.
//even one not allowed.

public class EmployeeMoreThanOneCompareToWithAnonymousClass
		implements Comparable<EmployeeMoreThanOneCompareToWithAnonymousClass> {

	int id, age;
	double salary;
	String empName;

	public EmployeeMoreThanOneCompareToWithAnonymousClass(int id, int age, int salary, String empName) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.empName = empName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	// generate tostring() method also and keep so we can easily print object
	// values.
	@Override
	public String toString() {
		return "EmployeeCustomClassWithComparable [id=" + id + ", age=" + age + ", salary=" + salary + ", empName="
				+ empName + "]";
	}

	public static Comparator<EmployeeMoreThanOneCompareToWithAnonymousClass> salaryComparator = new Comparator<EmployeeMoreThanOneCompareToWithAnonymousClass>() {

		@Override
		public int compare(EmployeeMoreThanOneCompareToWithAnonymousClass e1,
				EmployeeMoreThanOneCompareToWithAnonymousClass e2) {

			return (int) (e1.getSalary() - e2.getSalary());
		}
	};

	// this anonymous class will also throw another compile time error -
	// The type new Comparable<EmployeeMoreThanOneCompareToWithAnonymousClass>(){}
	// must implement the inherited abstract method
	// Comparable<EmployeeMoreThanOneCompareToWithAnonymousClass>.compareTo(EmployeeMoreThanOneCompareToWithAnonymousClass)
	// this is because compareto() not implemented here and its implemented in the
	// outer class.
	public static Comparable<EmployeeMoreThanOneCompareToWithAnonymousClass> ageComparator = new Comparable<EmployeeMoreThanOneCompareToWithAnonymousClass>() {

		@Override
		public int compareTo(EmployeeMoreThanOneCompareToWithAnonymousClass o) {
			// TODO Auto-generated method stub
			return 0;
		}

//		@Override
//		public int compareTo(EmployeeMoreThanOneCompareToWithAnonymousClass o) {
//			// TODO Auto-generated method stub
//			return 0;
//		}

		// we get error when we implement comparable and add the compareto method inside
		// anonymous class.
		// compile error - The method getAge() is undefined for the type new
		// Comparable<EmployeeMoreThanOneCompareToWithAnonymousClass>(){}
//		@Override
//		public int compareTo(EmployeeMoreThanOneCompareToWithAnonymousClass ageOne) {
//			return this.getAge() - ageOne.getAge();
//		}

		// it asks us to add this method also in this class.
		// because this keyword refers to current class instance variables and methods,
		// and getAge() method is present in the outer class and not in this anonymous
		// class.
//		private int getAge() {
//			// TODO Auto-generated method stub
//			return 0;
//		}
	};

	public static Comparator<EmployeeMoreThanOneCompareToWithAnonymousClass> nameComparator = new Comparator<EmployeeMoreThanOneCompareToWithAnonymousClass>() {

		@Override
		public int compare(EmployeeMoreThanOneCompareToWithAnonymousClass e1,
				EmployeeMoreThanOneCompareToWithAnonymousClass e2) {

			// This will return integer.
			return e1.getEmpName().compareTo(e2.getEmpName());
		}
	};

	@Override
	public int compareTo(EmployeeMoreThanOneCompareToWithAnonymousClass o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
