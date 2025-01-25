package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewMenuDAO 
{
	public ArrayList<MenuBean> mal=new ArrayList<MenuBean>();
	public ArrayList<MenuBean> reterivemenu() 
	{
		try {
			Connection con=DBConnect.getCon();
			PreparedStatement pstm = con.prepareStatement("select * from menu_items");
			ResultSet rs=pstm.executeQuery();
			while (rs.next()) {
			MenuBean mb=new MenuBean();
			mb.setId(rs.getInt(1));
			mb.setName(rs.getString(2));
			mb.setCategory(rs.getString(3));
			mb.setPrice(rs.getDouble(4));	
			mal.add(mb); 
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return mal;
		
	}

}
