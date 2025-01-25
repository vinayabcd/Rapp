package com.pack1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/or")
public class OrderServlet  extends HttpServlet{
	
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
OrderDAO oDAO=new OrderDAO();
String iname=req.getParameter("iname");
String qty=req.getParameter("qty");
OrderBean bean =new OrderBean();
OrderBean order = new OrderBean();
order.setIname(iname);
order.setQty(qty);

int rowCount=oDAO.insertOrder(order);
if(rowCount>0) {
	req.setAttribute("msg","Order Placed!!!");
	RequestDispatcher rd=req.getRequestDispatcher("order.jsp");
	rd.forward(req, res);
}
else {
	req.setAttribute("msg","Data not inserted");
	RequestDispatcher rd=req.getRequestDispatcher("order.jsp");
	rd.forward(req, res);
}
}
	

}
