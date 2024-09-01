<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add.Notes.com</title>

			<%@ include file = "all_js_css.jsp" %>
	
</head>
<body>
	
	<div class = "container-fluid p-0 m-0 " >
	
		<%@ include file = "navbar.jsp" %>
	
	<h1>Please Fill Your Details</h1>
	
	<form action="SaveNoteServlet" method = "post">
	
  <div class="form-group">
    <label for="title">Note Title</label>
    <input required type="text" name = "title" class="form-control" id="title" aria-describedby="title" placeholder="Enter Here">
  </div>
  
  <div class="form-group">
    <label for="content">Note Content</label>
	<textarea required id="content" name = "content" class="form-control"  style="height: 300px;" PlaceHolder="Enter your content here"></textarea>
  </div>
 <div class="container text-center">
  <button type="submit"  class="btn btn-primary">ADD</button>

</div>
</form>
	
	
	</div>
</body>
</html>