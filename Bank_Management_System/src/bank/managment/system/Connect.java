package bank.managment.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect {
	
	Connection connection;
	Statement statement;
	
	public Connect() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "krish123@mysql");
			statement = connection.createStatement();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
