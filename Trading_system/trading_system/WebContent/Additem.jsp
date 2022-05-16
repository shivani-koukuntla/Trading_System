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
      

<p> </p>
   
<br>
  
<form action="item_registration" method="post" enctype="multipart/form-data">

<!--
<form action="UploadServlet" method="post" enctype="multipart/form-data">
-->
<label >Userid</label><br>
<input type="text" name="user_id"  required aria-required="true" ></input><br>
 <label for="item_name">Item Name:</label><br>
 <input type="text" name="item_name"  required aria-required="true" ></input><br>
<!--  <label >Select image:</label><br> 
  <input type="file"  name="file" ></input><br>
  -->
 <label >Description</label><br>
 <input type="text" name="description" style="height:120px;" required aria-required="true" ></input><br>
  <input type="submit" value="Submit">
</form>
</div>

</html> 