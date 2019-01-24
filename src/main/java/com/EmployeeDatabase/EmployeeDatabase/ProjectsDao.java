package com.EmployeeDatabase.EmployeeDatabase;

import java.util.List;

public interface ProjectsDao {
	
	public List<Projects> getAllProjects();
	
	public Boolean addProjects(Projects pro);
	
	public Employee getProjects(int empId);
	
	public Boolean updateProjects(Projects pro);
	
	public Boolean deleteProjects(int proId);

}
