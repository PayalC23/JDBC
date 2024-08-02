package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class updatedata {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DBConnection.getDBConnection();
		

		String querry = "update mobile set name=?  where id=?";
		PreparedStatement pst = con.prepareStatement(querry);
		pst.setString(1, "iphonepro15");
	    pst.setInt(2,1 );
		pst.execute();
	}

}
