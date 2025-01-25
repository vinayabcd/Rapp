<%@page import="java.util.Iterator"%>
<%@page import="com.pack1.CheckBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Final Bill</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 50px;
        }
        table {
            margin: 20px auto;
            border-collapse: collapse;
            width: 80%;
        }
        th, td {
            padding: 10px;
            text-align: left;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f4f4f4;
        }
        .total-row {
            font-weight: bold;
        }
    </style>
</head>
<body>

<header>
    <h1>Final Bill</h1>
</header>

<%
ArrayList<CheckBean> al = (ArrayList<CheckBean>) request.getAttribute("order");
double grandTotal = (double) request.getAttribute("grandTotal");

if (al == null || al.isEmpty()) {
    out.println("<p>No orders found!</p>");
} else {
    out.println("<table>");
    out.println("<tr><th>ID</th><th>Item Name</th><th>Quantity</th><th>Price</th><th>Total Price</th></tr>");
    
    for (CheckBean mb : al) {
        out.println("<tr>");
        out.println("<td>" + mb.getId() + "</td>");
        out.println("<td>" + mb.getName() + "</td>");
        out.println("<td>" + mb.getQty() + "</td>");
        out.println("<td>" + mb.getPrice() + " /-</td>");
        out.println("<td>" + mb.getTotalPrice() + " /-</td>");
        out.println("</tr>");
    }
    // Display the grand total
    out.println("<tr class='total-row'><td colspan='4'>Grand Total</td><td>" + grandTotal + " /-</td></tr>");
    out.println("</table>");
}
%>

<footer>
    <p>Thank you!!<br><br>
   <b> Visit Again We Will Make You Happy</b>
    </p>
    
    <p>© 2025 Your Company. All Rights Reserved.</p>
</footer>

</body>
</html>
