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


@WebServlet("/SaveNoteServlet")
public class SaveNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveNoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String title=request.getParameter("title");
	    String content=request.getParameter("content");
	    
	    Note note=new Note(title,content,new Date());
		
	    NotetakerService service=new NotetakerServiceImp();
	    Note n1=service.addNotes(note);
	    
	    RequestDispatcher rd=request.getRequestDispatcher("done.jsp");
	    if(n1.getTitle()!=null && n1.getContent()!=null)
	    {
	    	out.print("<h1>Added in Servlet</h1>");
	    	rd.forward(request, response);
	    }
	    else
	    {
	    	out.print("<h1>Not Added in Servlet</h1>");
	    }
	    
	    
		
		
	}

}
