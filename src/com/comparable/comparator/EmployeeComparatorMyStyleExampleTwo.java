package com.comparable.comparator;

import java.util.Comparator;

//If you want to sort by more than one parameter use comparator not comparable. 
//comparable used for one parameter.
//more than one compare method not allowed in normal method style.
//more than one compare method allowed in anonymous class style.
public class EmployeeComparatorMyStyleExampleTwo implements Comparator<EmployeeComparatorMyStyleExampleTwo> {

	int id, age;
	double salary;
	String empName;

	public EmployeeComparatorMyStyleExampleTwo(int id, int age, int salary, String empName) {
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

	// uses of tostring()
	// Get output in the format we want.
	// Tostring belongs to object class.

	@Override
	public String toString() {
		return "EmployeeCustomClassWithComparable [id=" + id + ", age=" + age + ", salary=" + salary + ", empName="
				+ empName + "]";
	}

	@Override
	public int compare(EmployeeComparatorMyStyleExampleTwo o1, EmployeeComparatorMyStyleExampleTwo o2) {
		return o1.getAge() - o2.getAge();
	}

}
