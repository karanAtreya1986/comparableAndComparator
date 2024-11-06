package com.comparable.comparator;

import java.util.Comparator;

public class ImplementComparableComparatorInOneShort implements Comparable<ImplementComparableComparatorInOneShort>,
		Comparator<ImplementComparableComparatorInOneShort> {

	int id, age;
	double salary;
	String empName;

	public ImplementComparableComparatorInOneShort(int id, int age, int salary, String empName) {
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
	public int compare(ImplementComparableComparatorInOneShort o1, ImplementComparableComparatorInOneShort o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}

	@Override
	public int compareTo(ImplementComparableComparatorInOneShort o) {
		// TODO Auto-generated method stub
		return this.getId() - o.getId();
	}

}
