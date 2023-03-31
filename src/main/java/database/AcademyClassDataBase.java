package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.AcademyClass;

public class AcademyClassDataBase {
	// fetch all records -> select *
	public List<AcademyClass> getAllClasses() throws SQLException
	{
		List<AcademyClass> classes = new ArrayList<AcademyClass>();

		// select * from customer
		//String sql = "select city, phone from customer";
		String sql = "select * from customer";

		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statememt
		Statement stat = conn.createStatement();
		// 3. execute the query
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()) {
			AcademyClass c1 = new AcademyClass();
			c1.setName(rs.getString(1));

			classes.add(c1);
		}
		return classes;
	}
	
	public boolean insertClassUsingPrepareStatement(AcademyClass academyClass) throws SQLException
	{
		String sql = "insert into class values(?,?,?,?,?)";
		System.out.println(sql);
		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statememt
		PreparedStatement stat = conn.prepareStatement(sql);
		stat.setString(1, academyClass.getName());

		try {
			stat.execute();
		} catch(Exception e)
		{
			System.out.println("error "+e.getMessage());
			return false;
		}
		return true;
	}

	public boolean updateClassById(int id, String subject, int subjectId) throws SQLException
	{

		String sql = "update class set subjectId=? where id=?";
		System.out.println(sql);
		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statememt
		PreparedStatement stat = conn.prepareStatement(sql);
		stat.setString(1, "Test1");
		stat.setString(2, "Test2");
		stat.setInt(3, id);
		try {
			stat.execute();
		}catch(Exception e)
		{
			System.out.println("error "+e.getMessage());
			return false;
		}
		return true;
	}
	
	public AcademyClass getClassById(int classId) throws SQLException
	{
		String sql = "select * from class where id=?";

		// 1. DB connection 
		Connection conn = DBConnection.dbConn();
		//2. create the statememt
		PreparedStatement stat = conn.prepareStatement(sql);

		stat.setInt(1, classId);
		// 3. execute the query
		AcademyClass c1 = null;
		ResultSet rs = stat.executeQuery();
		while(rs.next()) {
			c1= new AcademyClass();
			c1.setName(rs.getString(1));
		}
		return c1;
	}
	
}
