package com.EmployeeDatabase.EmployeeDatabase;

import static org.junit.Assert.*;

import org.junit.Test;

public class DbAddTest {

	@Test
	public void test() {
		
		Employee emp = new Employee();
		
		EmployeeDao empDao = new EmployeeDaoImpl();
		
		emp.setEmployeeId(789);
		emp.setName("Robin");
		emp.setAge(24);
		emp.setSalary(20000);
		emp.setCountry("Bangladesh");
		emp.setCity("Dhaka");
		emp.setZipcode(1200);
	
		
		assertTrue(empDao.addEmployee(emp));
	}

}
