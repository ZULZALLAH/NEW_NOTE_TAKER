<%@ page import="com.helper.FactoryProvider" %>
<%@ page import="org.hibernate.*" %>
<%@ page import="com.entity.Note" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <%@ include file = "all_js_css.jsp" %>
</head>
<body>
	
	<div class = "container-fluid p-0 m-0 " >
	
		<%@ include file = "navbar.jsp" %>
	
	<h1>UPDATE NOTE</h1>
	<br>
	
	<%
		
		int noteId = Integer.parseInt(request.getParameter("note_id").trim());
		Session s = FactoryProvider.getFactory().openSession();
		Note note =(Note) s.get(Note.class,noteId);
	
	
	%>
	
	<form action="UpdateServlet" method = "post">
	
	<div class="form-group">
    <label for="id">Note ID</label>
    <input required type="hidden" name = "noteId" class="form-control" id="id" aria-describedby="id"  value="<%=note.getId()%>"/>
  </div>
  
  <div class="form-group">
    <label for="title">Note Title</label>
    <input required type="text" name = "title" class="form-control" id="title" aria-describedby="title"  value="<%=note.getTitle()%>"/>
  </div>
  
  <div class="form-group">
    <label for="content">Note Content</label>
	<textarea required id="content" name = "content" class="form-control"  style="height: 300px;" > <%=note.getContent()%></textarea>
  </div>
 <div class="container text-center">
  <button type="submit"  class="btn btn-success">Save Your Note</button>

</div>
</form>
	
	
	
	</div>
</body>
</html>