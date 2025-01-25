<%@page import="java.util.Iterator"%>
<%@page import="com.pack1.MenuBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Available Menu Items</title>
    <style>
        /* Reset and Basic Styles */
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f7fc;
            margin: 0;
            padding: 0;
            color: #333;
        }
        h1, h3 {
            margin: 0;
            padding: 10px;
        }

        /* Header Section */
        header {
            background-color: #333;
            color: white;
            padding: 20px;
            text-align: center;
        }

        header h1 {
            font-size: 2.5em;
            margin: 0;
        }

        /* Table Design */
        table {
            width: 80%;
            margin: 30px auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 12px 20px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #f8f8f8;
            color: #555;
            font-size: 1.1em;
        }
        td {
            color: #666;
        }
        tr:hover {
            background-color: #f1f1f1;
        }

        /* No Data Message */
        .no-data {
            text-align: center;
            font-size: 1.2em;
            color: #888;
        }

        /* Footer and Login section */
        footer {
            text-align: center;
            margin-top: 40px;
        }
        .login-link {
            text-decoration: none;
            color: #007BFF;
            font-size: 1.1em;
        }
        .login-link:hover {
            text-decoration: underline;
        }

        /* Responsive Design */
        @media (max-width: 768px) {
            table {
                width: 100%;
                margin: 20px;
            }
            th, td {
                font-size: 0.9em;
            }
        }
        a{
         text-decoration: none;
            color: #007BFF;
            font-size: 2.1em;
            
        }

    </style>
</head>
<body>

    <!-- Header Section -->
    <header>
        <h1>Our Delicious Menu</h1>
    </header>

    <!-- Main Content -->
    <div class="container">
        <center>
        <h3>Available Menu Items</h3>

        <%
            ArrayList<MenuBean> al = (ArrayList<MenuBean>) request.getAttribute("menu");

            if (al == null || al.size() == 0) {
                out.println("<p class='no-data'>No menu items available</p>");
            } else {
                out.println("<table>");
                out.println("<tr><th>ID</th><th>Name</th><th>Price</th></tr>");
                
                Iterator<MenuBean> i = al.iterator();
                while (i.hasNext()) {
                    MenuBean mb = i.next();
                    out.println("<tr>");
                    out.println("<td>" + mb.getId() + "</td>");
                    out.println("<td>" + mb.getName() + "</td>");
                    out.println("<td>" + mb.getPrice() + " /-</td>");
                    out.println("</tr>");
                }
                
                out.println("</table>");
            }
        %>

        </center>
    </div>

    <!-- Footer Section -->
    <footer>
      <a href="order.html">Make Order</a>
      
        <p>© 2025 V Grand. All Rights Reserved.</p>
    </footer>
    
</body>
</html>
