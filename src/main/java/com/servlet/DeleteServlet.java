package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.NotetakerService;
import com.service.NotetakerServiceImp;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int id=Integer.parseInt(request.getParameter("note_id"));
	    NotetakerService service=new NotetakerServiceImp();
	    service.removeNote(id);
	    
	    RequestDispatcher rd=request.getRequestDispatcher("all_notes.jsp");
	    rd.forward(request, response);
	    		
		
		
		
	}

}
