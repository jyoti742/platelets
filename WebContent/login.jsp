<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>

<style>

body{
	background-color:;
	background-image:url("injection2.jpg");
	background-repeat:no-repeat;
	background-size:100% 600%;
	background-position:center;	
}
.tablecontent{
	
	border-collapse:collapse;
	margin:100px 25px 0px 270px;
	font-size:0.5cm;
	min-width:300px;
	background-color:rgba(0, 0, 0, 0.2);
	color:white;
	border:1px solid black;
	
}

h3{
	color:white;
	font-size:0.9cm;
	text-align:center;
	top:20px;
}
.tablecontent thead tr{
	
	background-color:rgba(0, 0, 0, 0.7);
	color:white;
	text-align:left;
	font-weight:bold;
}
.tablecontent th,.tablecontent td
{
	padding:14px 18px;
}
.tablecontent tbody tr{
	border-bottom:1px solid black;
	
}
table {
margin:150px 300px 50px 550px;
}
</style>
</head>
<body>

    <form action="Login" method="post" class="">
    <table align="center" >
    <tr><td><h3 style="color:red">${message}</h3>
    <h3 style="color:green">${smessage}</h3>
    </td></tr>
    <tr><td><h3 style="color:white">LOGIN</center> </h3></td></tr>
    
    <tr><td style="color:white"> Enter your Email:</td><td> <input type="text"name="email" required></td></tr>
     
     <tr><td style="color:white">Enter Password :</td><td> <input type="password"name="pass" required></td></tr>
     
    <tr><td> <input type="submit" name="submit" value="Login"></td><td><a href="Register.jsp">Registration</a></td></tr>
     </table>
    
    </form>

</body>
</html>