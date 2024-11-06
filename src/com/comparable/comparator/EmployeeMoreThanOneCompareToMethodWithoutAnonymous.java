package com.comparable.comparator;

import java.util.Comparator;

public class EmployeeMoreThanOneCompareToMethodWithoutAnonymous
		implements Comparable<EmployeeMoreThanOneCompareToMethodWithoutAnonymous> {

	int id, age;
	double salary;
	String empName;

	public EmployeeMoreThanOneCompareToMethodWithoutAnonymous(int id, int age, int salary, String empName) {
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
	public int compareTo(EmployeeMoreThanOneCompareToMethodWithoutAnonymous o) {
		// TODO Auto-generated method stub
		return this.getAge() - o.getAge();
	}

	// more than one compareto method not allowed directly.
	// compile time error - Duplicate method
	// compareTo(EmployeeMoreThanOneCompareToMethodWithoutAnonymous) in type
	// EmployeeMoreThanOneCompareToMethodWithoutAnonymous
//	@Override
//	public int compareTo(EmployeeMoreThanOneCompareToMethodWithoutAnonymous o1) {
//		// TODO Auto-generated method stub
//		return this.getId() - o1.getId();
//	}

}
