<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page import="com.learneracademy.DatabaseConnectivity.ConnectDatabase" %>
 <%@page import="java.sql.Connection" %>
 <%@page import="java.sql.Statement" %>
 <%@page import="java.sql.ResultSet" %>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display_Subjects</title>

<center>
<style>
	
table {
  border-collapse: collapse;
  width: 50%;
}

th, td {
  text-align: center;
  padding: 2px;
  border:1px solid;
}

tr:nth-child(even) {
  background-color: #D6EEEE;
</style>
</head>
<body>


<H1>List of Subjects<H2>

<table>

<th style = "background-color:lightgray">Subject_Id</th>
<th style = "background-color:lightgray">Subject_Name</th>
<th style = "background-color:lightgray">Subject_Difficulty</th>


<%
try
{
ConnectDatabase conDb = new ConnectDatabase();
Connection conn  = conDb.getConnection();


Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("select * from subjects");


while (rs.next()) {
	
	
	%>
	
	
	
	<tr>
	
	<td><%= rs.getString("Subject_Id") %></td>

	<td><%= rs.getString("Subject_Name") %></td>

	<td><%= rs.getString("Subject_Difficulty") %></td>
	</tr>
	

	
	<% 
}


conDb.closeConnection();
}

catch (Exception e)
{
	out.print(e);
	
	}
	


%>
</table>

</body>
</center>
</html>