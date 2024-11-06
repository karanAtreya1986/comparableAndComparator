package com.comparable.comparator;

//implement comparable interface and add the unimplemented method.
//generics for comparable will be the class name on which to apply comparable.
public class EmployeeCustomClassWithComparable implements Comparable<EmployeeCustomClassWithComparable> {

	int id, age, salary;
	String empName;

	public EmployeeCustomClassWithComparable(int id, int age, int salary, String empName) {
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

	// generate tostring() method also and keep so we can easily print object
	// values.
	@Override
	public String toString() {
		return "EmployeeCustomClassWithComparable [id=" + id + ", age=" + age + ", salary=" + salary + ", empName="
				+ empName + "]";
	}

	// Compareto method can be written only once inside class. At a time, it will
	// work on one attribute only. Compareto expects return as integer only.
	@Override
	public int compareTo(EmployeeCustomClassWithComparable argumentZero) {

		return this.id - argumentZero.id;
	}

}
