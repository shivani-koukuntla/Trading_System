

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userregistration
 */
@WebServlet("/userregistration")
public class userregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userregistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
		String name = request.getParameter("name");
		//String email = request.getParameter("email");
		String phonenumber = request.getParameter("phonenumber");
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
        //username //password //name //phonenumber
		Connection con = null;
 		String url = "jdbc:mysql://localhost:3306/trading_system"; //MySQL URL and followed by the database name
 		String username = "admin1"; //MySQL username
 		String password = "Password_112041"; //MySQL password
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password); 
 		System.out.println("Printing connection object "+con);

 		PreparedStatement st;
 		ResultSet finalresult;
 		
 		st=con.prepareStatement("insert into user values(?,?,?,?);");
 		st.setString(1,Username);
 		st.setString(2,Password);
 		st.setString(3,name);
 		st.setString(4,phonenumber);
 		
 		int num_rows=st.executeUpdate();
 		if(num_rows >0)
 			
 			request.getRequestDispatcher("registration.jsp").forward(request, response);
 		
 		
		} //try ends here
		 catch (Exception e) 
 		{
 			e.printStackTrace();
 		}
	}
    
 

}




















		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	









