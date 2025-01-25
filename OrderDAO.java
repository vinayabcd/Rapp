package com.pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrderDAO 
{

	public int insertOrder(OrderBean bean) {
		int	rowCount=0;
		String itemname=bean.getIname();
		String itemqty=bean.getQty();
		try {
			Connection con=DBConnect.getCon();
			String sql = "INSERT INTO ORDER_table (id, itemname, qty) VALUES (ORDER_SEQ.NEXTVAL, ?, ?)";
			PreparedStatement pstm1=con.prepareStatement(sql);
			
			
			pstm1.setString(1,itemname);
			pstm1.setString(2,itemqty);
			
			rowCount=pstm1.executeUpdate();
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	
		return rowCount;
	}

}
