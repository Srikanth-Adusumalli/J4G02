
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class users {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user", "root", "sound");
		System.out.println("Driver Loaded Successfully");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from user");

		while (rs.next()) {
			String uname = rs.getString("uname");
			String password = rs.getString("password");
			System.out.println(uname + "-" + password);

		}
		st.close();
		con.close();
	}

}
