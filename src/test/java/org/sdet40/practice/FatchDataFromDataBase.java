package org.sdet40.practice;

import java.sql.SQLException;
import java.util.List;

import org.generic.DatabaseUtility;
import org.generic.IConstant;

public class FatchDataFromDataBase {

	
		public static void main(String[]args) throws SQLException {
			DatabaseUtility databaseUtility = new DatabaseUtility();
			databaseUtility.openDBConnection(IConstant.DB_URL, "root", "emp_name");
			List<String> data = databaseUtility.getDatabase("select*from sdet40;", "emp_name");
			List<String> data1 = databaseUtility.getDatabase("select*from sdet40;", "emp_name");
			List<String> data2 = databaseUtility.getDatabase("select*from sdet40;", "emp_name");
			System.out.println(data);
			System.out.println(data1);
			System.out.println(data2);
		}

	

}
