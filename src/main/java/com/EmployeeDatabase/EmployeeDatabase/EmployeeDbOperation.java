package com.EmployeeDatabase.EmployeeDatabase;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDbOperation {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		EmployeeDao empDao = new EmployeeDaoImpl();
		
		/*emp.setEmployeeId(123);
		emp.setName("Any");
		emp.setAge(25);
		emp.setSalary(25000);
		emp.setCountry("Bangladesh");
		emp.setCity("Dhaka");
		emp.setZipcode(1200);
	
		
		empDao.addEmployee(emp);
		
		
		
		Employee emp2 = empDao.getEmployee(123);
		
		System.out.println("Employee Detail: \n\nEmployee ID: "+emp2.getEmployeeId()+"\nName: "+emp2.getName()+"\nAge: "+emp2.getAge()+"\nSalary: "+emp2.getSalary()+"\nCountry: "+emp2.getCountry()+"\nCity: "+emp2.getCity()+"\nZip Code: "+emp2.getZipcode());
		
		
		emp.setEmployeeId(123);
		emp.setSalary(30000);
		empDao.updateEmployee(emp);
		
		
		emp.setEmployeeId(456);
		emp.setName("Siam");
		emp.setAge(25);
		emp.setSalary(25000);
		emp.setCountry("Bangladesh");
		emp.setCity("Dhaka");
		emp.setZipcode(1200);
	
		
		empDao.addEmployee(emp);
		
		
		empDao.deleteEmployee(456);
		
		
		
		for(Employee emp2 : empDao.getAllEmployees() )
		{
			System.out.println("Employee Detail: \n\nEmployee ID: "+emp2.getEmployeeId()+"\nName: "+emp2.getName()+"\nAge: "+emp2.getAge()+"\nSalary: "+emp2.getSalary()+"\nCountry: "+emp2.getCountry()+"\nCity: "+emp2.getCity()+"\nZip Code: "+emp2.getZipcode()+"\n\n");
		}
		
		
		
		String sql = "CREATE TABLE Projects " +
                "(projectId INTEGER not NULL, " +
                " pName VARCHAR(50), " + 
                " emloyeeId INTEGER, " + 
                " PRIMARY KEY ( projectId ))";
		
		empDao.CreateTable(sql);
		
		*/
		//----------------------------------------------------------------------------
		
		
		/*Projects pro = new Projects();
		ProjectsDao proDao= new ProjectsDaoImpl();
		
		pro.setProjectId(001);
		pro.setName("Restaurant POS");
		pro.setEmployeeId(456);
		
		proDao.addProjects(pro);
		
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList = empDao.innerJoin();
		
		
		
		for(Employee emp2 : empList )
		{
			System.out.println("Inner Join: \n\nEmployee ID: "+emp2.getEmployeeId()+"\nEmployee Name: "+emp2.getName()+"\nProject ID: "+emp2.getProjectId()+"\nProject Name: "+emp2.getProjectName()+"\n\n");
		}
		
		for(Employee emp2 : empDao.leftJoin() )
		{
			System.out.println("Left Join: \n\nEmployee ID: "+emp2.getEmployeeId()+"\nEmployee Name: "+emp2.getName()+"\nProject ID: "+emp2.getProjectId()+"\nProject Name: "+emp2.getProjectName()+"\n\n");
		}
		
		for(Employee emp2 : empDao.rightJoin() )
		{
			System.out.println("Right Join: \n\nEmployee ID: "+emp2.getEmployeeId()+"\nEmployee Name: "+emp2.getName()+"\nProject ID: "+emp2.getProjectId()+"\nProject Name: "+emp2.getProjectName()+"\n\n");
		}
		
		for(Employee emp2 : empDao.fullJoin() )
		{
			System.out.println("Full Join: \n\nEmployee ID: "+emp2.getEmployeeId()+"\nEmployee Name: "+emp2.getName()+"\nProject ID: "+emp2.getProjectId()+"\nProject Name: "+emp2.getProjectName()+"\n\n");
		}
		
		
		
		
		
		
		
		
		*/
		
		/*emp.setEmployeeId(789);
		emp.setName("Partho");
		emp.setAge(24);
		emp.setSalary(20000);
		emp.setCountry("Bangladesh");
		emp.setCity("Dhaka");
		emp.setZipcode(1200);
	
		
		empDao.addEmployee(emp);*/
		
		/*String qry = "SELECT employeeId"
				+ " FROM Employees"
				+ " GROUP BY employeeId";
		
		for(Employee emp2 : empDao.GroupByQuery(qry) )
		{
			System.out.println(emp2.getEmployeeId()+"\t"+emp2.getCity()+"\n\n");
		}
		*/
		
		
		
		/*
		String sql = "CREATE TABLE Employees " +
                "(employeeId INTEGER not NULL, " +
                " name VARCHAR(50), " + 
                " age INTEGER, " + 
                " salary INTEGER,"
                +" Department VARCHAR(50),"
                + "country VARCHAR(50),"
                + "city VARCHAR(50),"
                + "zipcode INTEGER,"
                + "PRIMARY KEY (employeeId))";
		
		empDao.CreateTable(sql);
		*/
		
		/*String sql = "CREATE TABLE Projects " +
                "(projectId INTEGER not NULL, " +
                " pName VARCHAR(50), " + 
                " emloyeeId INTEGER, " + 
                " PRIMARY KEY ( projectId ),"
                + "FOREIGN KEY(emloyeeId) REFERENCES Employees(employeeId))";
		
		empDao.CreateTable(sql);
				*/
		
		/*emp.setEmployeeId(126);
		emp.setName("Rakib");
		emp.setAge(24);
		emp.setSalary(15000);
		emp.setDept("Design");
		emp.setCountry("Bangladesh");
		emp.setCity("Dhaka");
		emp.setZipcode(1200);
	
		
		empDao.addEmployee(emp);
		
		*/
		System.out.println("Count employees from each cities:\n\n");
		String qry = "SELECT COUNT(employeeId), city"
				+ " FROM Employees"
				+ " GROUP BY city";
		
		System.out.println("Employee Counts\t\tCity Name\n");
		
		for(Employee emp2 : empDao.GroupByQueryCount(qry) )
		{
			System.out.println(emp2.getEmployeeId()+"\t\t\t"+emp2.getCity()+"\n\n");
		}
		
		
		System.out.println("Count[order by ASC] employees from each cities:\n\n");
		String qryy = "SELECT COUNT(employeeId), city"
				+ " FROM Employees"
				+ " GROUP BY city"
				+ " ORDER BY COUNT(employeeId) ASC";
		
		System.out.println("Employee Counts\t\tCity Name\n");
		
		for(Employee emp2 : empDao.GroupByQueryCount(qryy) )
		{
			System.out.println(emp2.getEmployeeId()+"\t\t\t"+emp2.getCity()+"\n\n");
		}
		
		
		
		
		System.out.println("Count[Having] employees from each cities:\n\n");
		String qryx = "SELECT COUNT(employeeId), city"
				+ " FROM Employees"
				+ " GROUP BY city"
				+ " HAVING COUNT(employeeId) < 2";
		
		System.out.println("Employee Counts\t\tCity Name\n");
		
		for(Employee emp2 : empDao.GroupByQueryCount(qryx) )
		{
			System.out.println(emp2.getEmployeeId()+"\t\t\t"+emp2.getCity()+"\n\n");
		}
		
		
		
		String qry2 = "SELECT MAX(salary),Department"
				+ " FROM Employees"
				+ " GROUP BY Department";
		
		System.out.println("Max salary from each department:\n\n");
		
		System.out.println("Employee Salary\t\tDepartment Name\n");
		
		for(Employee emp2 : empDao.GroupByQueryMax(qry2) )
		{
			System.out.println(emp2.getSalary()+"\t\t\t"+emp2.getDept()+"\n\n");
		}
		
		
		
		String qry3 = "SELECT MIN(salary),Department"
				+ " FROM Employees"
				+ " GROUP BY Department";
		
		System.out.println("MIN salary from each department:\n\n");
		
		System.out.println("Employee Salary\t\tDepartment Name\n");
		
		for(Employee emp2 : empDao.GroupByQueryMax(qry3) )
		{
			System.out.println(emp2.getSalary()+"\t\t\t"+emp2.getDept()+"\n\n");
		}
		 
		
		
		String qry4 = "SELECT SUM(salary),Department"
				+ " FROM Employees"
				+ " GROUP BY Department";
		
		System.out.println("SUM salary department wise:\n\n");
		
		System.out.println("Employee Salary\t\tDepartment Name\n");
		
		for(Employee emp2 : empDao.GroupByQueryMax(qry4) )
		{
			System.out.println(emp2.getSalary()+"\t\t\t"+emp2.getDept()+"\n\n");
		}
		
		
	}

}
