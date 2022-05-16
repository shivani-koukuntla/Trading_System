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
@WebServlet("/display_item")
public class display_item extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public display_item() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
	
		//getting input values from jsp page
//		String seller_id = request.getParameter("seller_id");
//		String email = request.getParameter("email");
//		String address = request.getParameter("address");


		Connection con = null;
 		String url = "jdbc:mysql://localhost:3306/trading_system"; //MySQL URL and followed by the database name
 		String username = "admin1"; //MySQL username
 		String password = "Password_112041"; //MySQL password
		
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
 		System.out.println("Printing connection object "+con);

		//Prepared Statement to add student data
 		PreparedStatement st1 = con.prepareStatement("SELECT * FROM item");
// 		st1.setString(1,seller_id);
 		ResultSet result=st1.executeQuery();
// 		if(result1.getInt("count(*)") > 0) {
// 			PreparedStatement st = con .prepareStatement("insert into seller values(?,?,?)");
// 	 		st.setString(1,seller_id);
// 			st.setString(2,email);
// 			st.setString(3,address);
//// 			st.setString(4,author);
// 			int result=st.executeUpdate();
//
// 			//Checks if insert is successful.If yes,then redirects to Result.jsp page 
 			while(result.next())
 			{
 				request.setAttribute("listData", result);
 				System.out.println(result);
 				RequestDispatcher rd = request.getRequestDispatcher("displayrecords.jsp");
 				rd.forward(request, response);
 			}
// 		}

		}
		 catch (Exception e) 
 		{
 			e.printStackTrace();
 		}

	
	}


}

