package com.comparable.comparator;

import java.util.Comparator;

public class EmployeeClassWithoutToString
		implements Comparable<EmployeeClassWithoutToString>, Comparator<EmployeeClassWithoutToString> {

	int id, age, salary;
	String empName;

	// no tostring() method in class.
	// now when we sort, we will get memory address of objects not the actual
	// objects.
	public EmployeeClassWithoutToString(int id, int age, int salary, String empName) {
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

	public int getSalary() {
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

	@Override
	public int compare(EmployeeClassWithoutToString o1, EmployeeClassWithoutToString o2) {

		return o1.getAge() - o2.getAge();
	}

	@Override
	public int compareTo(EmployeeClassWithoutToString o) {

		return this.getId() - o.getId();
	}

}
