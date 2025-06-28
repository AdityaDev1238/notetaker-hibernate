<%@ page import="java.util.*" %>
<%@ page import="com.service.*" %>
<%@ page import="com.entities.*" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Search Notes</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.bundle.min.js"></script>
  <link rel="stylesheet" href="css/style.css">
  
</head>
<body>


  <div class="container">
    
  <%@include file="navbar.jsp" %> 

 
  <h3>Search Results</h3>

  <%
    String search = request.getParameter("search");

    if (search != null && !search.trim().isEmpty()) {
        NotetakerService service = new NotetakerServiceImp();
        List<Note> allNotes = service.readAllNote();
        List <Note> req=new ArrayList<>();
        for (Note note : allNotes) {
            String title = note.getTitle();
            String content = note.getContent();

            if (title.equals(search)) {
  %>
 
  <div class="card mt-3">
    <div class="card-body">
    <img src="image/notepad.png" style="width:100px" class="card-img-top" alt="...">
      <h5 class="card-title"><%= title %></h5>
      <p class="card-text"><%=content  %></p>
    </div>
  </div>

  <%
            }
        }
    } else {
  %>
    <p>Please enter something to search.</p>
  <%
    }
  %>

</div>

</body>
</html>
