import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegServ extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
	public RegServ() {
       			 super();
   		           }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter ss = response.getWriter();
		String connectionURL = "jdbc:mysql://localhost/serv";
		Connection connection;
		
		try{
			  String username = request.getParameter("username");
			  String password = request.getParameter("password");
			  ss.println(username);
			  ss.println(password);
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  connection = DriverManager.getConnection("jdbc:mysql://localhost/serv", "root", "sound");
			  PreparedStatement ps = connection.prepareStatement ("insert into employee values(?,?)"); 
			  ps.setString(1,username);
			  ps.setString(2,password);
			  int i = ps.executeUpdate();
			  if(i!=0)
			 {
			  	 ss.println("Data added Successfully");
			  }
			  else
			{
				  ss.println("Data failed");
			  }
		        }
		 catch (Exception e)
		{
			 ss.println(e);
		}
	}

}