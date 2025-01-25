package com.pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/finalBill")
public class FinalBillServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		
		 ViewOrderDAO vdao = new ViewOrderDAO();
	        ArrayList<CheckBean> orders = vdao.checkOut();

	        // Calculate the total price
	        double grandTotal = 0.0;
	        for (CheckBean order : orders) {
	            grandTotal += order.getTotalPrice();
	        }

	        // Set attributes
	        req.setAttribute("order", orders);
	        req.setAttribute("grandTotal", grandTotal);

	        // Forward to JSP
	        RequestDispatcher rd = req.getRequestDispatcher("finalbill.jsp");
	        rd.forward(req, res);
	    }
	}


