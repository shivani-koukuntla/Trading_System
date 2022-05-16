<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%

String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "trading_system";
String userid = "admin1";
String password = "Password_112041";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>
<div class="bgimg" style="background-image:url(https://image.shutterstock.com/image-illustration/light-abstract-gradient-motion-blurred-600w-1121608547.jpg); width: 2000px; height: 800px;">
<h1>Retrieve data from database in jsp</h1>
<table border="1">
<tr>

<td>item name</td>
<td>description</td>
<td>Phone Number</td>



</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select item.item_name,item.description,user.phone_no from user, sells,item where item.item_name=sells.item_name and user.user_id=sells.seller_id";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("item_name") %></td>
<td><%=resultSet.getString("description") %></td>
<td><%=resultSet.getString("phone_no") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</div>
</body>

</html> 
    