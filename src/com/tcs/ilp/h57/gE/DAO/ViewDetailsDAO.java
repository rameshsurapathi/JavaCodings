package com.tcs.ilp.h57.gE.DAO;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tcs.ilp.h57.gE.POJO.ViewDetailsPOJO;
import com.tcs.ilp.h57.gE.POJO.SendStudentDetailsPOJO;

public class ViewDetailsDAO {
	
	public static LoginDAO testDAO = null;
	public static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DBURL = "jdbc:oracle:thin:@//127.0.0.1:1521/XE";
	public static final String DBUSER = "system";
	public static final String DBPASS = "123456";
	
	public static int return_value;	
	
	static Connection createConnection() throws SQLException, ClassNotFoundException {	
		Connection conn = null;
				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
						
			Driver driver = new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS);
			System.out.println("DATABASE CONNECTION ESTABLISHED!n\n");
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static SendStudentDetailsPOJO viewStudentData(ViewDetailsPOJO viewobject) throws SQLException, ClassNotFoundException{
		
		
		
		Connection con = ViewDetailsDAO.createConnection();
		String student_id = viewobject.getStudentid();
		String query = "select * from studentsample where studentid="+student_id;
		SendStudentDetailsPOJO sendobject = new SendStudentDetailsPOJO();
		
		Statement stmt = con.createStatement();
		
		try {
						
			ResultSet  rs = stmt.executeQuery(query);
			
			            
			while (rs.next()) {
				sendobject.setStudentid(rs.getString(1));
				sendobject.setFirstname(rs.getString(2));
				
			}
			
				     
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			stmt.close();
	        con.close();
		}
		
		return sendobject;
	}
	


}

