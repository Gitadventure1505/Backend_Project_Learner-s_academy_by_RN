<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.learneracademy.DatabaseConnectivity.ConnectDatabase" %>
 <%@page import="java.sql.Connection" %>
 <%@page import="java.sql.Statement" %>
 <%@page import="java.sql.ResultSet" %>
  <%@page import="java.util.*" %>
 
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class_Report</title>

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

tr {
  background-color: #D6EEEE;
</style>
</head>
<body>


<H1>Report of <%= request.getParameter("Class_Report") %><H2>

<table>

<th style = "background-color:lightgray">CLASS</th>
<th style = "background-color:lightgray">SUBJECT</th>
<th style = "background-color:lightgray">TEACHER</th>
<th style = "background-color:lightgray">OCCURENCE</th>
<th style = "background-color:lightgray">TIMINGS</th>
<th style = "background-color:lightgray">STUDENTS</th>



<%
try
{
ConnectDatabase conDb = new ConnectDatabase();
Connection conn  = conDb.getConnection();
String req_class = request.getParameter("Class_Report");
String sub_id = null;
String sub_name = null;
String teach_id = null;
String teach_name = null;
String timings = null;
String class_occurence = null;
List<String> student_list_dis = new ArrayList<String>();

//FAETCHING Subject name
Statement stmt1 = conn.createStatement();
Statement stmt2 = conn.createStatement();

ResultSet rs_sub_id = stmt1.executeQuery("select Subject_Id from class where Class_Name ='"+req_class+"'");

while(rs_sub_id.next())
{
	
	sub_id = rs_sub_id.getString("Subject_Id");
	
}


ResultSet rs_sub_name = stmt2.executeQuery("select Subject_Name from Subjects where Subject_Id = '"+sub_id+"'");

while(rs_sub_name.next())
{
	sub_name = rs_sub_name.getString("Subject_Name");
	 %>
	 <tr>
	 <td rowspan = "3" ><%= req_class%></td>
	 <td rowspan = "3" ><%= sub_name  %></td>
	 <% 
}



//FETCHING TEACHER NAME
Statement stmt3 = conn.createStatement();
Statement stmt4 = conn.createStatement();

ResultSet rs_t_id = stmt3.executeQuery("select Teacher_Id from class where Class_Name = '"+req_class+"'");

while(rs_t_id.next())
{
	teach_id  = rs_t_id.getString("Teacher_Id");
}

ResultSet rs_t_name = stmt4.executeQuery("select T_Name from teachers where Teacher_Id = '"+teach_id+"'");

while(rs_t_name.next())
{
teach_name = rs_t_name.getString("T_Name");
%>

<td rowspan = "3"><%= teach_name %></td>

<%

}


//FETCHING CLASS TIMING DETAILS
Statement stmt5 = conn.createStatement();
ResultSet rs_cl_tim = stmt5.executeQuery("select Timings, Class_occurence from class where Class_Name = '"+req_class+"'");

while (rs_cl_tim.next())
{

	timings = rs_cl_tim.getString("Timings");
	class_occurence = rs_cl_tim.getString("Class_occurence");
	%>
	<td rowspan = "3"><%= class_occurence %></td>
	<td rowspan = "3"><%= timings  %></td>
	
	<%
	
}



//FETCHING Students
Statement stmt6 = conn.createStatement();
ResultSet rs_stu_list = stmt6.executeQuery("select Student_Name from students where Class = '"+req_class+"'");

while(rs_stu_list.next())
{
	int i = 0;
	i++;
	student_list_dis.add(rs_stu_list.getString("Student_Name"));
	
}
for(String student:student_list_dis)
{
	%>
	<td><%= student %></td>
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