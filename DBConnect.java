package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect 
{
	private static Connection con=null;
	
	private DBConnect() {}
	
	static {
		try {
			Class.forName(DBInfo.DBdriver);
			con=DriverManager.getConnection(DBInfo.DBUrl, DBInfo.DBUname, DBInfo.DBPwd);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() {
		return con;
		
	}
	

}
