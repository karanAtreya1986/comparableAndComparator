package com.comparable.comparator;

import java.util.Comparator;

//If you want to sort by more than one parameter use comparator not comparable. 
//comparable used for one parameter.
//more than one compare method in one class is allowed when using in anonymous class way.
public class EmployeeComparingMoreThanOneParameterExampleTwo
		implements Comparable<EmployeeComparingMoreThanOneParameterExampleTwo> {

	int id, age;
	double salary;
	String empName;

	public EmployeeComparingMoreThanOneParameterExampleTwo(int id, int age, int salary, String empName) {
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
	// Compareto works on any data type.
	public static Comparator<EmployeeComparingMoreThanOneParameterExampleTwo> salaryComparator = new Comparator<EmployeeComparingMoreThanOneParameterExampleTwo>() {

		@Override
		public int compare(EmployeeComparingMoreThanOneParameterExampleTwo e1,
				EmployeeComparingMoreThanOneParameterExampleTwo e2) {

			return (int) (e1.getSalary() - e2.getSalary());
		}
	};

	public static Comparator<EmployeeComparingMoreThanOneParameterExampleTwo> ageComparator = new Comparator<EmployeeComparingMoreThanOneParameterExampleTwo>() {

		@Override
		public int compare(EmployeeComparingMoreThanOneParameterExampleTwo e1,
				EmployeeComparingMoreThanOneParameterExampleTwo e2) {

			return e1.getAge() - e2.getAge();
		}
	};

	public static Comparator<EmployeeComparingMoreThanOneParameterExampleTwo> nameComparator = new Comparator<EmployeeComparingMoreThanOneParameterExampleTwo>() {

		@Override
		public int compare(EmployeeComparingMoreThanOneParameterExampleTwo e1,
				EmployeeComparingMoreThanOneParameterExampleTwo e2) {

			// This will return integer.
			return e1.getEmpName().compareTo(e2.getEmpName());
		}
	};

	@Override
	public int compareTo(EmployeeComparingMoreThanOneParameterExampleTwo o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
