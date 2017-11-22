package com.dhan.model;

import java.util.Date;


public class Employee {

	
	//private int id;

	private String ename;
	private String address;
	private int salary;
	private Date date;

	public Employee() {

	}

	public Employee( String ename, String address, int salary, Date date) {
		super();
		//this.id = id;
		this.ename = ename;
		this.address = address;
		this.salary = salary;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", address=" + address + ", salary=" + salary + ", date="
				+ date + "]";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
