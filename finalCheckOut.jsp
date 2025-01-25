<%@page import="java.util.Iterator"%>
<%@page import="com.pack1.CheckBean"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<style>
        table {
            width: 80%;
            margin: 20px auto;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #f4f4f4;
        }
        .no-data {
            text-align: center;
            color: red;
            font-weight: bold;
        }
        footer {
            text-align: center;
            margin-top: 20px;
        }
    </style>
</head>
<body>

<header>
        <h1>Order details</h1>
 </header>

<%
ArrayList<CheckBean> al = (ArrayList<CheckBean>) request.getAttribute("order");
//double grandTotal = (double) request.getAttribute("grandTotal");
if (al == null || al.size() == 0) {
    out.println("<p class='no-data'>No menu items available</p>");
} else {
    out.println("<table>");
    out.println("<tr><th>ID</th><th>Name</th><th>Qty</th><th>Price</th><th>TotalPrice</th></tr>");
    
    Iterator<CheckBean> i = al.iterator();
    while (i.hasNext()) {
    	CheckBean mb = i.next();
        out.println("<tr>");
        out.println("<td>" + mb.getId() + "</td>");
        out.println("<td>" + mb.getName() + "</td>");
        out.println("<td>" + mb.getQty() + "</td>");
        out.println("<td>" + mb.getPrice() + "</td>");
        out.println("<td>" + mb.getTotalPrice() + " /-</td>");
        out.println("</tr>");
    }
    // Display the grand total
   // out.println("<tr class='total-row'><td colspan='4'>Grand Total</td><td>" + grandTotal + " /-</td></tr>");
    out.println("</table>");
}

%>

 <!-- Footer Section -->
    <footer>
      <a href="order.html">Make order</a>
      <a href="finalBill"> Ok finish!</a>
      
        <p>© 2025 V Grand. All Rights Reserved.</p>
    </footer>

</body>
</html>