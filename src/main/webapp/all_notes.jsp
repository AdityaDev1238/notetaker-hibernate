<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.service.*" %>
<%@ page import="com.entities.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.bundle.min.js" integrity="sha384-k6d4wzSIapyDyv1kpU366/PK5hCdSbCRGRCMv+eplOQJWyd1fbcAu9OCUj5zNLiq" crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/style.css">
</head>
<body>


    <div class="container">
    
     <%@include file="navbar.jsp" %> 
     
     
     <div class="row">
     
     <div class="col-12">
     
     <%
    
		    NotetakerService service=new NotetakerServiceImp();
		    List<Note> list=service.readAllNote();
		    
		    
		      
		  
		   if(list!=null)
		   {
			   for(Note note:list)
						{
					    	%>
					    	
					    	<div class="card mt-3 ps-4 pt-4">
							  <img src="image/notepad.png" style="width:100px" class="card-img-top" alt="...">
							  <div class="card-body">
							    <h5 class="card-title"><%= note.getTitle() %></h5>
							    <p class="card-text"><%=note.getContent() %></p>
							   
							    <a href="DeleteServlet?note_id=<%=note.getId() %>" class="btn btn-danger" onclick="return confirm('Are you sure you want to delete this note?')">Delete</a>
							    
							    <a href="edit.jsp?note_id=<%=note.getId() %>" class="btn btn-primary">Update</a>
							  </div>
							</div>
					    	
					    	<%
					    	
					    	
					    	
						    }
						  
				   
			   
		   }
		    %>
		
		   
		    
   
     
     
     </div>
     
     </div>
    
    </div>
    
    
    
    

</body>
</html>