package com.EmployeeDatabase.EmployeeDatabase;

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
		
		*/
		
		/*for(Employee emp2 : empDao.getAllEmployees() )
		{
			System.out.println("Employee Detail: \n\nEmployee ID: "+emp2.getEmployeeId()+"\nName: "+emp2.getName()+"\nAge: "+emp2.getAge()+"\nSalary: "+emp2.getSalary()+"\nCountry: "+emp2.getCountry()+"\nCity: "+emp2.getCity()+"\nZip Code: "+emp2.getZipcode()+"\n\n");
		}*/
		//empDao.deleteEmployee(789);
		
	}

}
