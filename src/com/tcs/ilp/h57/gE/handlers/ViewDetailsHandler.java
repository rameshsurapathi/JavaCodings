package com.tcs.ilp.h57.gE.handlers;

import java.io.IOException;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSession;
//import javax.servlet.RequestDispatcher;


import com.tcs.ilp.h57.gE.DAO.ViewDetailsDAO;
import com.tcs.ilp.h57.gE.POJO.SendStudentDetailsPOJO;
import com.tcs.ilp.h57.gE.POJO.ViewDetailsPOJO;


public class ViewDetailsHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ViewDetailsPOJO viewobject = new ViewDetailsPOJO();
		
		
		viewobject.setStudentid(request.getParameter("studentid"));
		
		try {
			
			HttpSession session = request.getSession(true);	
		if((Integer)session.getAttribute("session_value")==4){
			
			SendStudentDetailsPOJO update_object = ViewDetailsDAO.viewStudentData(viewobject);
			
            session.setAttribute("session_value",5);
			
			session.setAttribute("update_object",update_object);
					
			response.sendRedirect("/NSEP/JspPages/student.jsp");
			
		}
		else{
			SendStudentDetailsPOJO send_object = ViewDetailsDAO.viewStudentData(viewobject);
			
					
			session.setAttribute("session_value",3);
			
			session.setAttribute("send_object",send_object);
					
			 response.sendRedirect("/NSEP/JspPages/student.jsp");
		}	
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
