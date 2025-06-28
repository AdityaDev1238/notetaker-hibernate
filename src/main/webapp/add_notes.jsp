<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.bundle.min.js" integrity="sha384-k6d4wzSIapyDyv1kpU366/PK5hCdSbCRGRCMv+eplOQJWyd1fbcAu9OCUj5zNLiq" crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	   <div class="container">
		 <%@include file="navbar.jsp" %>  
		  <br>
		<h1>Please Fill Your Note Details</h1>
		<br>
		<!-- This is Add Form -->
		
		<form action="SaveNoteServlet" method="post">
		  <div class="mb-3">
		    <label for="title" class="form-label">Note Title</label>
		   <input type="text" class="form-control" id="title" name="title" required placeholder="Enter here">

		    
		  </div>
		  
		  
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Note Content</label>
		    
		    <textarea required id="content" name="content" placeholder="Enter Your Content Here" class="form-control"></textarea>
		    
		    
		  </div>
		  
		  <div id="container">
		  
		  <button type="submit" class="btn btn-primary">Add</button>
		  
		  </div>
		  
		 
		  
		</form>
	
	 </div>






</body>
</html>