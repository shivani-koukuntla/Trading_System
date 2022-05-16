

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/user_signup")
public class user_signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public user_signup() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
	
		//getting input values from jsp page
		String user_id = request.getParameter("user_id");
		String user_password = request.getParameter("password");


		Connection con = null;
 		String url = "jdbc:mysql://localhost:3306/trading_system"; //MySQL URL and followed by the database name
 		String username = "admin1"; //MySQL username
 		String password = "Password_112041"; //MySQL password
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
 		System.out.println("Printing connection object "+con);

		//Prepared Statement to add student data
 		PreparedStatement st1 = con .prepareStatement("SELECT user_id FROM user WHERE user_id = (?)");
 		st1.setString(1,user_id);
 		ResultSet result1=st1.executeQuery();
 		if(result1.next()) {
 			PreparedStatement st = con .prepareStatement("SELECT password FROM user WHERE password = (?)");
 	 		st.setString(1,user_password);
// 			st.setString(3,category);
// 			st.setString(4,author);
 			ResultSet result=st.executeQuery();

 			//Checks if insert is successful.If yes,then redirects to Result.jsp page 
 			if(result.getString(2) == user_password)
 			{
 				
 				RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
 				rd.forward(request, response);
 			}
 		}

		}
		 catch (Exception e) 
 		{
 			e.printStackTrace();
 		}

	
	}


}
