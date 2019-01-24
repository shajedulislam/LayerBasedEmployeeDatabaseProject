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
		
		proDao.addProjects(pro);*/
		
		
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
		
		
				
	}

}
