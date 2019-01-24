package com.EmployeeDatabase.EmployeeDatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProjectsDaoImpl implements ProjectsDao {

	public List<Projects> getAllProjects() {
		
		DataSource ds = new DataSource();
		Connection con = ds.createConnection();
		Statement st = null;
		ResultSet res = null;
		
		try {
			String qry = "SELECT * FROM Projetcs";
			st = con.createStatement();
			res = st.executeQuery(qry);
			Projects pro = new Projects();
			List <Projects> proList = new ArrayList<Projects>();
			
			while(res.next())
			{
				pro.setProjectId(res.getInt("projectId"));
				pro.setEmployeeId(res.getInt("employeeId"));
				pro.setName(res.getString("pName"));
				
				
				proList.add(pro);
				
				
			}
			return proList;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

	public Boolean addProjects(Projects pro) {
		
		Connection con = null;
		
		Statement st = null;
		
		String insert = "insert into Projects values("+pro.getProjectId()+","+"'"+pro.getName()+"'"+","+"'"+ pro.getEmployeeId()+"'"+")";
		
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

	public Employee getProjects(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean updateProjects(Projects pro) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean deleteProjects(int proId) {
		// TODO Auto-generated method stub
		return null;
	}

}
