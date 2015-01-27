package com.tcs.ilp.h57.gE.DAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tcs.ilp.h57.gE.POJO.LoginPOJO;


public class LoginDAO {
	
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
	
	
	public static int loginValidation(LoginPOJO login) throws SQLException, ClassNotFoundException{
		
		
		
		Connection con = LoginDAO.createConnection();
		String query = "select * from admin";
		PreparedStatement pstmt = con.prepareStatement(query);
		try {
			
			ResultSet rset = pstmt.executeQuery();
			while(rset.next()) {
				
				if((rset.getString(1).equals(login.getadminid()))
						&&(rset.getString(2).equals(login.getPassword()))){
					return_value = 1;
					
				}
				else{
					return_value = 0;
				}
				
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			pstmt.close();
	        con.close();
		}
		return return_value;
		
	}
	


}
