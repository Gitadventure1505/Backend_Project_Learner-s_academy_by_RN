<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import = "java.sql.Connection" %>
    <%@ page import = "java.sql.DriverManager" %>
    <%@ page import = "java.sql.ResultSet" %>
    <%@ page import = "java.sql.Connection" %> 
    <%@ page import = "java.sql.Statement" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin_Dashboard</title>
</head>
<body>
<center>

<font color="sky blue">  
<H1>Welcome to Admin Dashboard<H1>
</font>

<H2> Click below button to display students list  </H2>

<form action = "PageNavigationServlet" method = "post">
<input type = "submit" colspan = "2"  value = "Students_List" name = "submit" style = "background-color:lightgray"/>
</form>
<br>

<H2> Click below button to display Teachers list  </H2>
<form action = "PageNavigationServlet" method = "post">
<input type = "submit" colspan = "2"  value = "Teachers_List" name = "submit" style = "background-color:lightgray"/>
</form>
<br>

<H2> Click below button to display  Subjects list  </H2>
<form action = "PageNavigationServlet" method = "post">
<input type = "submit" colspan = "2"  value = "Subjects_List" name = "submit" style = "background-color:lightgray"/>
</form>
<br>

<H2>Select the class which need to display the Class Report</H2>
<form action = "PageNavigationServlet" method = "post">
<select type = "select"  name = "Class_Report" style = "background-color:lightgray"  />
<option value = "Class_A">Class_A</option>
<option value = "Class_B">Class_B</option>
<option value = "Class_C">Class_C</option>
<option value = "Class_D">Class_D</option>
<option value = "Class_E">Class_E</option>
<option value = "Class_F">Class_F</option>
</select>
<br>
<br>
<input type = "submit" colspan = "2"  value = "Show_Report" name = "submit" style = "background-color:lightgray"/>
</form>


</form>
</center>

</body>
</html>