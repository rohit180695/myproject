package org.generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {
	Connection connection;

	public List<String> getDatabase(String query, String columnName) throws SQLException{
		
		
		 Statement statement = connection.createStatement();
		ResultSet result=statement.executeQuery(query);
		List<String> list1 = new ArrayList<>();
		while(result.next()) {
			list1.add(result.getString(columnName));
		}
		return list1;
	}
	public void openDBConnection(String dbURL, String dbUserName, String dbPassword) throws SQLException {
		Driver dbdriver=new Driver();
		DriverManager.registerDriver(dbdriver);
		connection=DriverManager.getConnection(dbURL, dbUserName, dbPassword);
		
	}
	public void closeDB() throws SQLException {
		connection.close();
	}
	

}
