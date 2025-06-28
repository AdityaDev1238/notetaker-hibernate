package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entities.Note;
import com.service.NotetakerService;
import com.service.NotetakerServiceImp;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		int id=Integer.parseInt(request.getParameter("note_id"));
		String title=request.getParameter("title");
	    String content=request.getParameter("content");
	    Note note=new Note(id,title,content,new Date());
//	    note.setId(id);
	    NotetakerService service=new NotetakerServiceImp();
	   // Note n1=service.readNote(id);
	    service.modifyNote(note);
	    
	    RequestDispatcher rd=request.getRequestDispatcher("all_notes.jsp");
	    rd.forward(request, response);
	    
	    
	    
	}

}
