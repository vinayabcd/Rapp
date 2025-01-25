package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewOrderDAO 
{
	ArrayList<CheckBean> check=new ArrayList<CheckBean>();
	String sqlQuery = "SELECT o.id AS order_id, o.itemname AS ordered_item, o.qty AS ordered_quantity,m.price AS item_price, (o.qty * m.price) AS total_price "
            			+ "FROM ORDER_table o JOIN menu_items m ON o.itemname = m.name";

	public ArrayList<CheckBean> checkOut()
	{
		try 
		{
			Connection con=DBConnect.getCon();
			PreparedStatement pstm2=con.prepareStatement(sqlQuery);
			ResultSet rs=pstm2.executeQuery();
			
			
			
			
			while (rs.next()) {
			     CheckBean cbean = new CheckBean();
		            cbean.setId(rs.getInt(1));           // Set the order ID
		            cbean.setName(rs.getString(2));  // Set the item name
		            cbean.setQty(rs.getInt(3));  // Set the quantity
		            cbean.setPrice(rs.getDouble(4));   // Set the item price
		            cbean.setTotalPrice(rs.getDouble(5)); // Set the total price
				
				check.add(cbean);
				
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
		
		
		
		
		return check;
		
	}

}
