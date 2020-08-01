<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<style>

 body{
	background-color:#848471;
	background-image:url("injection2.jpg");
	background-repeat:no-repeat;
	background-size:100% 500%;
	background-position:center;	
}
h3{
         text-align:center;
         color:#fff;
         font-size:50px;
         text-transform:capitalize;
         
     }
.tablecontent{
	
	border-collapse:collapse;
	margin:100px 250px 0px 480px;
	font-size:0.5cm;
	min-width:300px;
	background-color:rgba(0, 0, 0, 0.4);
	color:white;
	border:
	
}
 
table,tr,td
{
padding: 10px 20px 10px 20px; 

}
</style>
</head>
<body>
 <form action="Login" method="post" >
 <h3 style="color:white"><center>REGISTRATION </center></h3>
    <table  align="center" class="tablecontent">
    <tr><td></td></tr>
      <tr><td style="color:white"> Enter your Name:</td><td> <input type="text"name="name" required></td></tr>
        <tr><td style="color:white"> Enter Username:</td><td> <input type="text"name="uname"></td></tr>
    
    <tr><td style="color:white"> Enter your Email:</td><td> <input type="text"name="email" required></td></tr>
     <tr><td style="color:white"> Enter Contact Number:</td><td> <input type="text"name="phone" required></td></tr>
     
     <tr><td style="color:white">Enter Password :</td><td> <input type="password"name="pass" required></td></tr>
     <tr><td style="color:white">Confirm Password :</td><td> <input type="password"name="pass1" required></td></tr>
     
     
    <tr><td> <input type="submit" name="submit" value="Register"></td></tr>
     </table>
    
    </form>
</body>
</html>