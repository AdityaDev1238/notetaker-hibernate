<nav class="navbar navbar-expand-lg navbar-dark purple">
  <div class="container-fluid">
    <a class="navbar-brand" href="">Note Taker</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="add_notes.jsp">Add Note</a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link " href="all_notes.jsp">Show Notes</a>
        </li>
      </ul>
      
      <form class="d-flex" action="search.jsp" method="get">
  <input class="form-control me-2" type="search" name="search" placeholder="Search">
  <button class="btn btn-outline-success" type="submit">Search</button>
</form>

      
    </div>
  </div>
</nav>