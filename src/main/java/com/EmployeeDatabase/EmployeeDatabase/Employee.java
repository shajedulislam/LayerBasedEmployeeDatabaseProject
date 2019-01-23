package com.EmployeeDatabase.EmployeeDatabase;

public class Employee {
	
	private int employeeId;
	private String name;
	private int age;
	private int salary;
	private String country;
	private String city;
	private int zipcode;
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public void setEmployeeId(int empId)
	{
		this.employeeId = empId;
	}
	
	
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String nm)
	{
		this.name = nm;
	}
	
	
	
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int ag)
	{
		this.age = ag;
	}
	
	
	
	
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int sl)
	{
		this.salary = sl;
	}
	
	
	
	public String getCountry()
	{
		return country;
	}
	public void setCountry(String cn)
	{
		this.country = cn;
	}
	
	
	
	
	public String getCity()
	{
		return city;
	}
	public void setCity(String ct)
	{
		this.city = ct;
	}
	
	
	
	
	public int getZipcode()
	{
		return zipcode;
	}
	public void setZipcode(int zc)
	{
		this.zipcode = zc;
	}
	

}
