package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertdata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DBConnection.getDBConnection();
    String query ="insert into mobile(name,company,price)values(?,?,?)";
    PreparedStatement pst = con.prepareStatement(query);
    pst.setString(1, "samsung s24");
    pst.setString(2, "samsung");
    pst.setLong(3, 100000);
    pst.execute();
    

	}

}
