<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

   <head> 
   
      <title>Homepage</title>
      
      <link rel="stylesheet" href="style1.css">
   </head>

   <body>
   <div class="bgimg" style="background-image:url(https://image.shutterstock.com/image-illustration/light-abstract-gradient-motion-blurred-600w-1121608547.jpg); width: 2000px; height: 800px;">
<br>
        Enter your details for registering

<p> </p>
   
<br>

<form  action="userregistration" method="post">
			<table style="with: 50%">
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" required aria-required="true"></td>
				</tr>
				<tr>
					<td>Phone number</td>
					<td><input type="tel"  name="phonenumber" required aria-required="true">
					</td>
					
				</tr>
					<tr>
					<td>Username</td>
					<td><input type="text" name="username" required aria-required="true"></td>
				</tr>
                                <tr>
					<td>Password</td>
					<td><input type="text" name="password" required aria-required="true"></td>
				</tr>

			</table>
			<input type="submit" value="Click here to Submit" /></form>
     </div>

</html> 