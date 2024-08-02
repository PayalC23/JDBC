package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deletedata {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DBConnection.getDBConnection();
		String query ="delete from mobile where id = ?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, 2);
		pst.execute();
	}

}
