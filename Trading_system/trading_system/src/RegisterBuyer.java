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
@WebServlet("/RegisterBuyer")
public class RegisterBuyer extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RegisterBuyer() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
	
		//getting input values from jsp page
		String buyer_id = request.getParameter("buyer_id");
		String address = request.getParameter("address");


		Connection con = null;
 		String url = "jdbc:mysql://localhost:3306/trading_system"; //MySQL URL and followed by the database name
 		String username = "admin1"; //MySQL username
 		String password = "Password_112041"; //MySQL password
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
 		System.out.println("Printing connection object "+con);

		//Prepared Statement to add student data
 		PreparedStatement st1 = con .prepareStatement("SELECT user_id FROM user WHERE user_id = (?)");
 		st1.setString(1,buyer_id);
 		ResultSet result1=st1.executeQuery();
 		if(result1.next()) {
 			PreparedStatement st = con .prepareStatement("insert into buyer values(?, ?)");
 	 		st.setString(1,buyer_id);
 			st.setString(2,address);
// 			st.setString(3,category);
// 			st.setString(4,author);
 			int result=st.executeUpdate();

 			//Checks if insert is successful.If yes,then redirects to Result.jsp page 
 			if(result>0)
 			{
 				
 				RequestDispatcher rd = request.getRequestDispatcher("buyerpage.jsp");
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

