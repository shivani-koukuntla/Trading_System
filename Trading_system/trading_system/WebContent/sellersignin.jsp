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

<form  action="RegisterSeller" method="post">
			<table style="with: 50%">
				<tr>
					<td>Userid</td>
					<td><input type="text" name="seller_id" required aria-required="true"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email_id" required aria-required="true"></td>
				</tr>
				
					<tr>
					<td>address</td>
					<td><input type="text" name="address" required aria-required="true"></td>
				</tr>
                                

			</table>
			<input type="submit" value="Click here to Submit" /></form>
      
</div>
</html> 