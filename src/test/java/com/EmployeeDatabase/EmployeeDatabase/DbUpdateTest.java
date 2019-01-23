package com.EmployeeDatabase.EmployeeDatabase;

import static org.junit.Assert.*;

import org.junit.Test;

public class DbUpdateTest {

	@Test
	public void test() {
		
		Employee emp = new Employee();
		
		EmployeeDao empDao = new EmployeeDaoImpl();
		
		
		
		emp.setEmployeeId(456);
		emp.setSalary(30000);
		
		assertTrue(empDao.updateEmployee(emp));
		
		
		
	}

}
