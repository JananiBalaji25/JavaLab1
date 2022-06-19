package com.lab.model;

public class Employee {
	private String firstName;
	private String lastName;
	//create constructor
	public Employee(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getfirstName()
	{
		return firstName;
	}
	public void setfirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public void setlastName(String lastName)
	{
		this.lastName=lastName;
	}

}
