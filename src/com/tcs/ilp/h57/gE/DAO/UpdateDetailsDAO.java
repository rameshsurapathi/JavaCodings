package com.tcs.ilp.h57.gE.DAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.tcs.ilp.h57.gE.POJO.UpdateDetailsPOJO;


public class UpdateDetailsDAO {
	
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
	
	
	public static int updateStudentData(UpdateDetailsPOJO updateobject) throws SQLException, ClassNotFoundException{
		
		
		
		Connection con = UpdateDetailsDAO.createConnection();
		String studentid = updateobject.getStudentid();
		String firstname = updateobject.getFirstname();
		String query = "update studentsample SET studentid='"+studentid+"',name='"+firstname+"' where studentid='"+studentid+"'";
		int updateResult=0;
		Statement stmt = con.createStatement();
		try {
									
			int numRowsChanged = stmt.executeUpdate(query);
			if(numRowsChanged>0){			
				updateResult = 1;
			}
			else{
				updateResult = 0;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			stmt.close();
	        con.close();
		}
		return updateResult;
	}
	


}

