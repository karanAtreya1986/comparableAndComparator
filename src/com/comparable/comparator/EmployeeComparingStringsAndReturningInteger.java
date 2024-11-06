package com.comparable.comparator;

import java.util.Comparator;

public class EmployeeComparingStringsAndReturningInteger
		implements Comparable<EmployeeComparingStringsAndReturningInteger> {

	int id, age;
	double salary;
	String empName;

	public EmployeeComparingStringsAndReturningInteger(int id, int age, int salary, String empName) {
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

	public static Comparator<EmployeeComparingStringsAndReturningInteger> salaryComparator = new Comparator<EmployeeComparingStringsAndReturningInteger>() {

		@Override
		public int compare(EmployeeComparingStringsAndReturningInteger e1,
				EmployeeComparingStringsAndReturningInteger e2) {

			return (int) (e1.getSalary() - e2.getSalary());
		}
	};

	public static Comparator<EmployeeComparingStringsAndReturningInteger> ageComparator = new Comparator<EmployeeComparingStringsAndReturningInteger>() {

		@Override
		public int compare(EmployeeComparingStringsAndReturningInteger e1,
				EmployeeComparingStringsAndReturningInteger e2) {

			return e1.getAge() - e2.getAge();
		}
	};

	public static Comparator<EmployeeComparingStringsAndReturningInteger> nameComparator = new Comparator<EmployeeComparingStringsAndReturningInteger>() {

		@Override
		public int compare(EmployeeComparingStringsAndReturningInteger e1,
				EmployeeComparingStringsAndReturningInteger e2) {

			// This will return integer.
			// to compare strings, get the name and use the compareto() method
			// pass in the other string and it will return integer value
			// returns -
			// the value 0 if the argument string is equal to this string; a value less than
			// 0 if this string is lexicographically less than the string argument; and
			// a value greater than 0 if this string is lexicographically greater than the
			// string argument.
			return e1.getEmpName().compareTo(e2.getEmpName());
		}
	};

	@Override
	public int compareTo(EmployeeComparingStringsAndReturningInteger o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
