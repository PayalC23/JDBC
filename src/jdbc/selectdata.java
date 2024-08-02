package jdbc;

import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectdata {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DBConnection.getDBConnection();
		

		String querry = "select * from mobile";
		Statement stmt = con.createStatement();
		ResultSet rst = stmt.executeQuery(querry);
		while(rst.next()) {
			System.out.println(rst.getInt(1) +" " +rst.getString(2) +" "+rst.getString(3) +" "+rst.getInt(4));
		}
	}

}
