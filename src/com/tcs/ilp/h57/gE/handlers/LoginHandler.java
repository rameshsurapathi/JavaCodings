package com.tcs.ilp.h57.gE.handlers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tcs.ilp.h57.gE.DAO.LoginDAO;
import com.tcs.ilp.h57.gE.POJO.LoginPOJO;


public class LoginHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginHandler() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String adminid_value = request.getParameter("adminid");
		String password_value = request.getParameter("password");
		
		System.out.println(adminid_value);
		
		LoginPOJO login =new LoginPOJO();
		login.setadminid(adminid_value);
		login.setPassword(password_value);
		
		
		try {
			int result = LoginDAO.loginValidation(login);
						
			if(result==1){
				HttpSession session = request.getSession(true);
				session.setAttribute("login_value",1);
				response.sendRedirect("/NSEP/JspPages/Home.jsp");

			}
			else if(result==0){
				 response.sendRedirect("/NSEP");
				 PrintWriter out = response.getWriter();
                 out.println("Invalid Username or Password");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
				
		
	}

}
