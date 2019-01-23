package com.EmployeeDatabase.EmployeeDatabase;

import java.util.List;

public interface EmployeeDao {
	
	public List<Employee> getAllEmployees();
	
	public Boolean addEmployee(Employee emp);
	
	public Employee getEmployee(int empId);
	
	public Boolean updateEmployee(Employee emp);
	
	public Boolean deleteEmployee(int empId);

}
