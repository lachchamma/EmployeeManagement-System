package com.zettamine.ems.configs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.ResourceBundle;

public class ConnectionFactory {
	
	private static Connection con=null;
	
	public static Connection getConnectionDB() throws Exception {
		
		if(con==null) {
			Properties p=new Properties();
			/*FileInputStream fis=new FileInputStream("/zettamine_jdbc/src/com/zettamine/jdbc/dbConfig.properties");
			p.load(fis);
			String driverClass=p.getProperty("driverClass");
			String url=p.getProperty("url");
			String userName=p.getProperty("userName");
			String password=p.getProperty("password");*/
			
			ResourceBundle bundle=ResourceBundle.getBundle("com/zettamine/jdbc/dbConfig");
			String driverClass=bundle.getString("driverClass");
			String url=bundle.getString("url");
			String userName=bundle.getString("userName");
			String password=bundle.getString("password");
			
			
			Class.forName(driverClass);
			con=DriverManager.getConnection(url,userName,password);
		
		
		
	}
		return con;

}
}
