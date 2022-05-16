import java.io.IOException;
import java.sql.ResultSet;
import java.nio.file.Paths;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.InputStream;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.InputStreamReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;


/**
 * Servlet implementation class item_registration
 */
@WebServlet("/item_registration")
@MultipartConfig
public class item_registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public item_registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
			//item_id //image-id //item_name //description
			String user_id = request.getParameter("user_id");
			//String email = request.getParameter("email");
			String item_name = request.getParameter("item_name");
			String description = request.getParameter("description");
			//String Password = request.getParameter("password");
	        //username //password //name //phonenumber
			//String myloc=request.getParameter("file");
			
			
			
			Connection con = null;
	 		String url = "jdbc:mysql://localhost:3306/trading_system"; //MySQL URL and followed by the database name
	 		String username = "admin1"; //MySQL username
	 		String password = "Password_112041"; //MySQL password
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password); 
	 		System.out.println("Printing connection object "+con);

	 		PreparedStatement ps,ps1;
	 		ResultSet finalresult;
	 		//createStatement st1 = conn.createStatement();
	 		//finalresult= st1.executeQuery("select item_id from item order by item_id FETCH FIRST 1 ROW ONLY;")
	 		 //		int id=parseInt(finalresult.getString("item_id")
	 		 	//	id++; 
	 		 /*
	 		  * String image_id = request.getParameter("image_id);
			//String email = request.getParameter("email");
			String item_name = request.getParameter("item_name");
			String description = request.getParameter("description");
	 		  */		
	 		  
	 		 		
	 		//st=con.prepareStatement("insert into item values(?,?,?,?);");
	 		//st.setString(1,String.valueOf(id));
	 		//st.setString(2,Password);//---understand what to do
	 		//st.setString(3,item_name);
	 		//st.setString(4,description);
	//------	FileInputStream fs=null;
	 		
	 		//item_id //image-id //item_name //description
	 		//protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 		    //String description = request.getParameter("description"); // Retrieves <input type="text" name="description">
	 	//-----	    Part filePart = request.getPart("file"); // Retrieves <input type="file" name="file">
	 		   // String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
	 //-----		    InputStream fileContent = filePart.getInputStream();
	 		   // System.setOut(fileContent);
	 		    // ... (do your job here)
	 		   //InputStream fs= filePart.getInputStream();
	 		    // ... (do your job here)
	 	//	}
	 		
	 		ps= con.prepareStatement("INSERT INTO item(item_name,description) VALUES(?,?)");
		    ps.setString(1, item_name);
		    ps.setString(2, description);
		    
		    ps1=con.prepareStatement("Insert into sells(user_id,item_id) values(?,?");
		    ps1.setString(1,user_id);
		    ps1.setString(2, item_name);
		    
		    //FileInputStream fis=null;
		 //   File image= new File(myloc);
		  
		   // fis=new FileInputStream(image);
		 //   ps.setBinaryStream(2, (InputStream) fis, (int) (image.length()));
		    
		    ps1.executeUpdate();
			   
		    
		  //---  ps.setBinaryStream(1,fs,fileContent.available());
		    ps.executeUpdate();
		    
		    System.out.println("Image Stored Successfully");
	 		
	 		//st1.executeQuery("select top 1 from (select * from item order by item_id desc"))
	 		
	 		
	 		
	 		//if(num_rows >0)
	 			request.getRequestDispatcher("itemadded.jsp").forward(request, response);
	 		
	 		
			} //try ends here
			 catch (Exception e) 
	 		{
	 			e.printStackTrace();
	 		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
