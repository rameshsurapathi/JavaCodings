package com.tcs.ilp.h57.gE.handlers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSession;
//import javax.servlet.RequestDispatcher;


import com.tcs.ilp.h57.gE.DAO.UpdateDetailsDAO;
import com.tcs.ilp.h57.gE.POJO.UpdateDetailsPOJO;


public class UpdateDetailsHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UpdateDetailsPOJO updateobject = new UpdateDetailsPOJO();
		
		
		updateobject.setStudentid(request.getParameter("studentid"));
		updateobject.setFirstname(request.getParameter("studentname"));
		
		try {
			int updateresult = UpdateDetailsDAO.updateStudentData(updateobject);
			
           if(updateresult==1){
				
				HttpSession session = request.getSession(true);
				session.setAttribute("session_value",6);
				
						
				RequestDispatcher rd = request.getRequestDispatcher("JspPages/student.jsp");
				rd.include(request, response);
				 
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
