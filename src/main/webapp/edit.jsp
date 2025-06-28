<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.service.*" %>
<%@page import="com.entities.*" %>
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
   
   <h1>This is Edit Page</h1>
   
   <%
	   int id=Integer.parseInt(request.getParameter("note_id"));
	   NotetakerService service=new NotetakerServiceImp();
	   Note n1=service.readNote(id);
	   
	   
	   
   
   
    %>
    
    
    <form action="UpdateServlet" method="post">
     
        <input type="hidden" name="note_id" value="<%= n1.getId() %>">

		  <div class="mb-3">
		    <label for="title" class="form-label">Note Title</label>
		    <input type="text" class="form-control" id="title" name="title" aria-describedby="emailHelp" placeholder="Enter here" value="<%=n1.getTitle()%>">
		    
		  </div>
		  
		  
		  
		  
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Note Content</label>
		    
		    <textarea required id="content" name="content" placeholder="Enter Your Content Here" class="form-control"><%= n1.getContent() %></textarea>

		    
		    
		  </div>
		  
		  <div id="container">
		  
		  <button type="submit" class="btn btn-primary">Save</button>
		  
		  </div>
		  
		 
		  
		</form>
   
   
   </div>


</body>
</html>