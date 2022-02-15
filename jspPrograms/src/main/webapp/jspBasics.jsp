<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!
	String msg = "hello";
%>
<%!public String MyFunction(String msg){
	return msg;
} %>
<body>
<h1>Message is:- <%out.println(msg); %></h1>
<p>Use of Method</p>
<h2><% out.print("before function call :- "+msg); %></h2>
<h3>After function call</h3>
message is:- <%= MyFunction("forgiveness") %>

</body>
</html>