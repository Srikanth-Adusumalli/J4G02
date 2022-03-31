

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		String connectionURL = "jdbc:mysql://localhost/shoaib";
		Connection connection;
		
		try{
			  String username1 = request.getParameter("username");
			  String password1 = request.getParameter("password");
			  pw.println(username1);
			  pw.println(password1);
			  Class.forName("org.gjt.mm.mysql.Driver");
			  connection = DriverManager.getConnection
			  (connectionURL, "root", "123456");
			  PreparedStatement pst = connection.prepareStatement
			  ("insert into emp_info values(?,?)");
			  pst.setString(1,username);
			  pst.setString(2,password);
			  int i = pst.executeUpdate();
			  if(i!=0){
			  pw.println("<br><br>Record has been inserted in Database");
			  }
			  else{
			  pw.println("Failed to Insert the data in Database");
			  }
			  }
			  catch (Exception e){
			  pw.println(e);
			  }
	}


	}


