package com.comparable.comparator;

import java.util.Comparator;

public class EmployeeMoreThanOneCompareMethodAllowedOrNot
		implements Comparator<EmployeeMoreThanOneCompareMethodAllowedOrNot> {

	int id, age;
	double salary;
	String empName;

	public EmployeeMoreThanOneCompareMethodAllowedOrNot(int id, int age, int salary, String empName) {
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

	@Override
	public int compare(EmployeeMoreThanOneCompareMethodAllowedOrNot e1,
			EmployeeMoreThanOneCompareMethodAllowedOrNot e2) {

		return e1.getAge() - e2.getAge();
	}

	// compile error when we write more than one compare method.
	// Duplicate method compare(EmployeeMoreThanOneCompareMethodAllowedOrNot,
	// EmployeeMoreThanOneCompareMethodAllowedOrNot) in type
	// EmployeeMoreThanOneCompareMethodAllowedOrNot
	// we have to use anonymous class for writing more than one compare method.
//	@Override
//	public int compare(EmployeeMoreThanOneCompareMethodAllowedOrNot e1,
//			EmployeeMoreThanOneCompareMethodAllowedOrNot e2) {
//
//		return e1.getAge() - e2.getAge();
//	}

}
