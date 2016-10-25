<%@ page language="java" import="java.io.*,java.util.*,java2.Identity" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>THANKS FOR THE INFO</h1>
	<% 
	Date date = new Date();
	out.print("<h2 align=\"center\">" + date.toString() + "<h2>" + "<br>");
	HttpSession sessions = request.getSession(false);
	List<Identity> users = (List<Identity>)sessions.getAttribute("identity");
	out.print("<h2 align=\"center\">THE NUMBER OF USERS IS: " + users.size()+ "<h2>");
	%>
	
</body>
</html>