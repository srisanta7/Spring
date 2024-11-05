<%@page import="springmvc.controller.Student"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>this is help page</title>
</head>
<body>
    <h1>my name is sri</h1>
    <h1>this is help page</h1>
    
    <%String name = (String) request.getAttribute("name");
      LocalDateTime now = (LocalDateTime)request.getAttribute("time");
    %>
    <h1>name : <%=name %></h1>
    <h1>time : <%=now.toString() %></h1>
     <%Student st = (Student) request.getAttribute("student"); %>
     
     <h1>id <%st.getId(); %></h1>
     <h1>name <%st.getName(); %></h1>
    
</body>
</html>