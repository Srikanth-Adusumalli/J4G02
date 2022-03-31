import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class prod {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/product1", "root", "sound");
		System.out.println("Driver Loaded Successfully");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from product1");

		while (rs.next()) {

			String pid = rs.getString("pid");
			String pname = rs.getString("pname");
			String price = rs.getString("price");
			String pcategory = rs.getString("pcategory");
			System.out.println(pid + "  " + pname + "  " + price + "  " + pcategory);

		}
		con.close();
		st.close();

	}

}
