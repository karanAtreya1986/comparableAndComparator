package com.comparable.comparator;

import java.util.Comparator;

//If you want to sort by more than one parameter use comparator not comparable. 
//comparable used for one parameter.
public class EmployeeComparingMoreThanOneParameter implements Comparable<EmployeeComparingMoreThanOneParameter> {

	int id, age;
	double salary;
	String empName;

	public EmployeeComparingMoreThanOneParameter(int id, int age, int salary, String empName) {
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

	// Our salary is defined as long and since the return type is int we have
	// downcasted it:
	// lets use anonymous class implementation.
	// If we use anonymous classes, Multiple sorting functions can be written for
	// different attributes within a class.
	// Compare method is present. Return type is always int. two arguments to it.
	public static Comparator<EmployeeComparingMoreThanOneParameter> salaryComparator = new Comparator<EmployeeComparingMoreThanOneParameter>() {

		@Override
		public int compare(EmployeeComparingMoreThanOneParameter e1, EmployeeComparingMoreThanOneParameter e2) {

			return (int) (e1.getSalary() - e2.getSalary());
		}
	};

	@Override
	public int compareTo(EmployeeComparingMoreThanOneParameter o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
