<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%@page import="java.util.Date" %>Today is:<%= new Date() %> --%> 
<%-- 
<%@page contentType=application/msword %>
Today is:<%= new java.util.Date() %>
--%>
<%@page buffer="16kb" language="java" %>
Today is: <%=new java.util.Date() %>
</body>
</html>