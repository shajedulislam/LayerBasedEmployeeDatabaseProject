package com.EmployeeDatabase.EmployeeDatabase;

import static org.junit.Assert.*;

import org.junit.Test;

public class DbDeleteTest {

	@Test
	public void test() {
		EmployeeDao empDao = new EmployeeDaoImpl();	
		
		assertTrue(empDao.deleteEmployee(456));
	}

}
