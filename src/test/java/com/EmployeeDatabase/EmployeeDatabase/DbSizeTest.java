package com.EmployeeDatabase.EmployeeDatabase;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DbSizeTest {

	@Test
	public void test() {
		
		Employee emp = new Employee();
		
		EmployeeDao empDao = new EmployeeDaoImpl();
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList = empDao.getAllEmployees();
		
		assertEquals(empList.size(),1);
	}

}
