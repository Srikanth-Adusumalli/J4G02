
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.CallableStatement;

public class Assignment02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/shoaib", "root", "123456");
		System.out.println("Driver is Loaded to work");

		/* } catch (ClassNotFoundException e) { */
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from product where productcategory='garment'");

		while (rs.next()) {

			String productid = rs.getString("productid");
			String productname = rs.getString("productname");
			String productprice = rs.getString("productprice");

			String productcategory = rs.getString("productcategory");
			System.out.println(productid + " | " + productname + " | " + productprice + " | " + productcategory);

		}
		con.close();
		st.close();

	}

}
