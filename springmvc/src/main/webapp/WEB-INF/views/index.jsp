<%@page import="springmvc.controller.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
     <h1>this is home page</h1>
     <h1>called by home controller</h1>
     <h1>url /home</h1>
     
     <%
        String name = (String) request.getAttribute("name");
     %>
     <h1>name <%=name %></h1>
     
     <%
        int id = (Integer) request.getAttribute("id");
     %>
     <h1>id <%=id %></h1>
     
     <% List<String> friends = (List<String>)request.getAttribute("friends"); %>
     
     <%for(String f : friends){
    	 
    	 %>
    	 <h1><%=f %></h1>
    	 <% 
     } %>
     
     <%Student st = (Student) request.getAttribute("student"); %>
     
     <h1><%st.getId(); %></h1>
     <h1><%st.getName(); %></h1>
</body>
</html>