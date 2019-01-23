package com.EmployeeDatabase.EmployeeDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
*/

public class EmployeeDaoImpl implements EmployeeDao {

	//private Statement st;

	public List<Employee> getAllEmployees() {
		
		DataSource ds = new DataSource();
		Connection con = ds.createConnection();
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry = "SELECT * FROM Employee";
			st = con.createStatement();
			res = st.executeQuery(qry);
			Employee emp = new Employee();
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				emp.setEmployeeId(res.getInt("employeeId"));
				emp.setName(res.getString("name"));
				emp.setAge(res.getInt("age"));
				emp.setSalary(res.getInt("salary"));
				emp.setCountry(res.getString("country"));
				emp.setCity(res.getString("city"));
				emp.setZipcode(res.getInt("zipcode"));
				
				empList.add(emp);
				
				
			}
			return empList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
		
		
	}

	public Boolean addEmployee(Employee emp) {
		
		Connection con = null;
		
		Statement st = null;
		
		String insert = "insert into Employee values("+emp.getEmployeeId()+","+"'"+emp.getName()+"'"+","+"'"+ emp.getAge()+"'"+","+"'"+emp.getSalary()+"'"+","+"'"+emp.getCountry()+"'"+","+"'"+emp.getCity()+"'"+","+"'"+emp.getZipcode()+"'"+")";
		
		try
		{
			DataSource ds = new DataSource();
			con = ds.createConnection();
			st = con.createStatement();
			
			st.execute(insert);
			
			//System.out.println("Inserted");
			
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	public Employee getEmployee(int empId) {
		DataSource ds = new DataSource();
		Connection con = ds.createConnection();
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry = "SELECT * FROM Employee WHERE employeeId="+empId;
			st = con.createStatement();
			res = st.executeQuery(qry);
			Employee emp = new Employee();
			while(res.next())
			{
				emp.setEmployeeId(res.getInt("employeeId"));
				emp.setName(res.getString("name"));
				emp.setAge(res.getInt("age"));
				emp.setSalary(res.getInt("salary"));
				emp.setCountry(res.getString("country"));
				emp.setCity(res.getString("city"));
				emp.setZipcode(res.getInt("zipcode"));
				
				return emp;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	public Boolean updateEmployee(Employee emp) {
		
		Connection con = null;
		Statement st = null;
		
		String sql = "UPDATE Employee SET salary="+"'"+emp.getSalary()+"'"+"WHERE employeeId="+emp.getEmployeeId();
		
		try {
			DataSource ds = new DataSource();
			con = ds.createConnection();
			st = con.createStatement();
			st.execute(sql);
			//System.out.println("Information updated for Employee ID: "+emp.getEmployeeId());
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	public Boolean deleteEmployee(int empId) {
		
		Connection con = null;
		 Statement st = null;
		 
		 String sql = "DELETE FROM Employee WHERE employeeId="+empId;
		 
		 try {
			 DataSource ds = new DataSource();
			 
			 con = ds.createConnection();
			 
			 st = con.createStatement();
			 
			 st.execute(sql);
			 
			 return true;
			 
			 //System.out.println("Informations deleted for Employee ID: "+empId);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 return null;
	}
	

}
