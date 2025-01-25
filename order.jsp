<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Order Confirmation</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f8f9fa;
            color: #343a40;
            text-align: center;
        }
        footer {
            margin-top: 20px;
            padding: 10px 0;
            background-color: #343a40;
            color: white;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
        footer a {
            color: #007bff;
            text-decoration: none;
        }
        footer a:hover {
            text-decoration: underline;
        }
        .message {
            margin: 20px auto;
            padding: 20px;
            width: 50%;
            background-color: #ffffff;
            border: 1px solid #dee2e6;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
    </style>
    <script>
    function Changebuttonvalue(link) {
        link.textContent = "Order In Progress..."; // Change link text
        link.style.pointerEvents = "none"; // Disable further clicks
    }
	</script>
</head>
<body>

    <div class="message">
        <% 
            // Retrieve the message from the request scope
            String data = (String) request.getAttribute("msg");
            if (data != null) {
                out.println(data);
            } else {
                out.println("No message available.");
            }
        %>
        <br><br>
        <a href="order.html" onclick="Changebuttonvalue(this)">Make Another Order</a><br>
        <h3>Or</h3>
        <a href="checkout.html">CheckOut</a>
    </div>

    <footer>
        <p>© 2025 V Grand. All Rights Reserved.</p>
    </footer>

</body>
</html>
