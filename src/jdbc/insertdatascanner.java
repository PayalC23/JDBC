package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertdatascanner {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DBConnection.getDBConnection();
		String query ="insert into mobile(name,company,price)values(?,?,?)";
		PreparedStatement pst = con.prepareStatement(query);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mobile name");
		String mobName = sc.nextLine();
		pst.setString(1,mobName);
		System.out.println("Enter the company name");
		String company = sc.next();
		pst.setString(2,company);
		System.out.println("Enter the price");
		int price= sc.nextInt();
		pst.setInt(3,price);
		pst.execute();
	}

}
