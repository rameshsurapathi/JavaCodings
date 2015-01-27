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


import com.tcs.ilp.h57.gE.DAO.DeleteDetailsDAO;
import com.tcs.ilp.h57.gE.POJO.DeleteDetailsPOJO;


public class DeleteDetailsHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DeleteDetailsPOJO deleteobject = new DeleteDetailsPOJO();
		
		
		deleteobject.setStudentid(request.getParameter("studentid"));
				
		try {
			int deleteresult = DeleteDetailsDAO.deleteStudentData(deleteobject);
			
						
if(deleteresult==1){
				
				HttpSession session = request.getSession(true);
				session.setAttribute("session_value",7);
				
						
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
