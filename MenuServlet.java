package com.pack1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/en")
public class MenuServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws 
	ServletException,IOException
	{
		ViewMenuDAO vmdao=new ViewMenuDAO();
		ArrayList<MenuBean>	vm=vmdao.reterivemenu();
		req.setAttribute("menu", vm);
		RequestDispatcher rd=req.getRequestDispatcher("menu.jsp");
		rd.forward(req, res);
	}
	

}
