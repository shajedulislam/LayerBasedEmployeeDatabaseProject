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
			String qry = "SELECT * FROM Employees";
			st = con.createStatement();
			res = st.executeQuery(qry);
			//Employee emp = new Employee();
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
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
		
		String insert = "insert into Employees values("+emp.getEmployeeId()+","+"'"+emp.getName()+"'"+","+"'"+ emp.getAge()+"'"+","+"'"+emp.getSalary()+"'"+","+"'"+emp.getDept()+"'"+","+"'"+emp.getCountry()+"'"+","+"'"+emp.getCity()+"'"+","+"'"+emp.getZipcode()+"'"+")";
		
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
			String qry = "SELECT * FROM Employees WHERE employeeId="+empId;
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
		
		String sql = "UPDATE Employees SET salary="+"'"+emp.getSalary()+"'"+"WHERE employeeId="+emp.getEmployeeId();
		
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
		 
		 String sql = "DELETE FROM Employees WHERE employeeId="+empId;
		 
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
	
	public Boolean CreateTable(String sql) {
		
		Connection con = null;
		Statement st = null;
		
		
		
		try {
			
			DataSource ds = new DataSource();
			 
			con = ds.createConnection();
			 
			st = con.createStatement();
			 
			st.execute(sql);
			 
			return true;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	return null;
	}
	
	//----------------------join------------------------
	
	
	public List<Employee> innerJoin() {
		
		
		DataSource ds = new DataSource();
		Connection con = ds.createConnection();
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry ="SELECT Projects.projectId, Projects.pName, Employees.employeeId, Employees.name" + 
						" FROM Projects"+ 
						" INNER JOIN Employees ON Projects.emloyeeId=Employees.employeeId ";
			
			
			st = con.createStatement();
			res = st.executeQuery(qry);
			
			List <Employee> empList2 = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setEmployeeId(res.getInt("employeeId"));
				emp.setName(res.getString("name"));
				emp.setProjectId(res.getInt("projectId"));
				emp.setProjectName(res.getString("pName"));
				
				
				empList2.add(emp);
				
				
			}
			return empList2;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return null;
		
	}
	
	public List<Employee> leftJoin() {
		
		
		DataSource ds = new DataSource();
		Connection con = ds.createConnection();
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry ="SELECT Projects.projectId, Projects.pName, Employees.employeeId, Employees.name" + 
					" FROM Employees" + 
					" LEFT JOIN Projects ON Projects.emloyeeId = Employees.employeeId;";
			
			
			st = con.createStatement();
			res = st.executeQuery(qry);
			
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setEmployeeId(res.getInt("employeeId"));
				emp.setName(res.getString("name"));
				emp.setProjectId(res.getInt("projectId"));
				emp.setProjectName(res.getString("pName"));
				
				
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
	
	public List<Employee> rightJoin() {
		
		
		DataSource ds = new DataSource();
		Connection con = ds.createConnection();
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry ="SELECT Projects.projectId, Projects.pName, Employees.employeeId, Employees.name" + 
					" FROM Employees" + 
					" RIGHT JOIN Projects ON Projects.emloyeeId = Employees.employeeId;";
			
			
			st = con.createStatement();
			res = st.executeQuery(qry);
			
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setEmployeeId(res.getInt("employeeId"));
				emp.setName(res.getString("name"));
				emp.setProjectId(res.getInt("projectId"));
				emp.setProjectName(res.getString("pName"));
				
				
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
	
	public List<Employee> fullJoin() {
		
		
		DataSource ds = new DataSource();
		Connection con = ds.createConnection();
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry ="SELECT Projects.projectId, Projects.pName, Employees.employeeId, Employees.name" + 
					" FROM Employees" + 
					" FULL OUTER JOIN Projects ON Employees.employeeId = Projects.emloyeeId;";
			
			
			st = con.createStatement();
			res = st.executeQuery(qry);
			
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setEmployeeId(res.getInt("employeeId"));
				emp.setName(res.getString("name"));
				emp.setProjectId(res.getInt("projectId"));
				emp.setProjectName(res.getString("pName"));
				
				
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
	
	public List<Employee> GroupByQueryCount(String qry) {
		
		
		DataSource ds = new DataSource();
		Connection con = ds.createConnection();
		Statement st = null;
		ResultSet res = null;
		
		try {
			
			
			st = con.createStatement();
			res = st.executeQuery(qry);
			
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setEmployeeId(res.getInt(1));
				emp.setCity(res.getString("city"));
								
				
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
	
	public List<Employee> GroupByQueryMax(String qry) {
		
		
		DataSource ds = new DataSource();
		Connection con = ds.createConnection();
		Statement st = null;
		ResultSet res = null;
		
		try {
			
			
			st = con.createStatement();
			res = st.executeQuery(qry);
			
			List <Employee> empList = new ArrayList<Employee>();
			
			while(res.next())
			{
				Employee emp = new Employee();
				emp.setSalary(res.getInt(1));
				emp.setDept(res.getString("Department"));
				//emp.setName(res.getString("name"));
								
				
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
	
	

}
