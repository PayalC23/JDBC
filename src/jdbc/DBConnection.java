package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
public static Connection getDBConnection()throws SQLException{
	String url = "jdbc:mysql://localhost:3306/flipcart1";
	String username = "root";
	String password = "root";
	Connection con = DriverManager.getConnection(url,username,password);
	return con;
}
}
