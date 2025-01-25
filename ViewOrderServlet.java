package com.pack1;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/next")
public class ViewOrderServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		ViewOrderDAO vdao=new ViewOrderDAO();
		
		ArrayList<CheckBean> mb=vdao.checkOut();
		
		req.setAttribute("order", mb);
		
		RequestDispatcher rd=req.getRequestDispatcher("finalCheckOut.jsp");
		rd.forward(req, res);
		
	}

}
