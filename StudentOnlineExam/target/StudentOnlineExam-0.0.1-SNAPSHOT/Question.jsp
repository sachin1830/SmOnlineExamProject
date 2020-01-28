<%
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("Login.html");
	}
%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.org.model.Question"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
 <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
 <script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script> 
  <link rel="stylesheet" type="text/css" href="style.css">
<title>Question</title>
</head>
<body>
<%
  ArrayList<Question> arr=(ArrayList)request.getAttribute("Result");
  Iterator list=arr.iterator();
%>
<%while(list.hasNext()) { Question que=(Question)list.next(); int i=0;%>
<div class="correntcontainer m-5">
   <%out.print(que.getQuestion());%><br>
  <input type="hidden" name="qid" value="<%= que.getId()%>" class="qid">
  <input type="radio" name="item" class="mt-3 " value="<%= que.getOption1()%>"><% out.print(que.getOption1());%><br>
  <input type="radio" name="item" class="mt-3 " value="<%= que.getOption2()%>"><% out.print(que.getOption2());%><br>
  <input type="radio" name="item" class="mt-3 " value="<%= que.getOption3()%>"><%out.print(que.getOption3()); %><br>
  <input type="radio" name="item" class="mt-3 " value="<%= que.getOption4()%>"><%out.print(que.getOption4());%><br>
  
  <button type="button" name="submit" class="selectbtnn btn btn-success">Submit</button><hr>
</div>
<%}%>
<script type="text/javascript" src="script.js"></script>
</body>
</html>