package com.tcs.ilp.h57.gE.DAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import com.tcs.ilp.h57.gE.POJO.AddDetailsPOJO;


public class AddDetailsDAO {
	
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
	
	
	public static int insertStudentData(AddDetailsPOJO addobject) throws SQLException, ClassNotFoundException{
		
		
		
		Connection con = AddDetailsDAO.createConnection();
		String firstname = addobject.getFirstname();
		String query = "insert into studentsample values(?,?)";
		int insertResult=0;
		
		PreparedStatement pstmt = con.prepareStatement(query);
		
		try {
						
			Random studentIDGenerator = new Random();
            int studentID = studentIDGenerator.nextInt(1000000);
            pstmt.setInt(1, studentID);
			pstmt.setString(2, firstname);
			int numRowsChanged = pstmt.executeUpdate();
			if(numRowsChanged>0){			
			insertResult = 1;
			}
			else{
				insertResult = 0;
			}
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			pstmt.close();
	        con.close();
		}
		
		return insertResult;
	}
	


}

