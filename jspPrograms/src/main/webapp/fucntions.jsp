<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Date Demo</title>
</head>
<%@page import="java.util.*" %>
<%!	String ShowTime (){
	String msg = "hello";
	Date d = new Date();
	if(d.getHours()>12){
		msg+="It's afternoon now";
	}
	else if(d.getHours()>20){
		msg+="It's night now";
	}
	else{
		msg+="It's morning now";
	}
	return msg;
}	
%>
<body>
	<h2><%= ShowTime() %></h2>
</body>
</html>