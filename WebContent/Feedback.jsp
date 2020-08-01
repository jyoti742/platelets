<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title> CONTACT US </title>
   
    <link href="CSS/feedback.css" rel="stylesheet" type="text/css">
</head>

<body>
        
    <form action="feed" method="POST">
        <div class="contactus">
            <h1>FEEDBACK</h1>
            
            <p>Email us with any questions or feedback.<br>We would be happy to answer your question!!</p><br>
            <div class="textbox">
                <input type="text" placeholder="Name" name="name">
            </div>
            <div class="textbox">
                <input type="email" placeholder="Email" name="email" >
            </div>
            <div class="textbox">
                <input type="text" placeholder="Subject" name="subject" >
            </div>
            <div class="textbox">
                <textarea class="textbox message" placeholder="Message..." name="message"></textarea>
            </div>
            <div class="btn">

                <input type="submit" value="SEND MESSAGE">
            </div>
            </br>
        </div>
    </form>
</body>

</html>
