package com.pack1;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addToCart")
public class AddToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String[] selectedItems = req.getParameterValues("selectedItems");

        if (selectedItems != null) {
            // Process selected items
            ArrayList<Integer> selectedItemIds = new ArrayList<>();
            for (String id : selectedItems) {
                selectedItemIds.add(Integer.parseInt(id));
            }

            // Example: Add selected items to session or database
            req.getSession().setAttribute("cartItems", selectedItemIds);
            req.setAttribute("msg", "Selected items added to cart successfully!");
        } else {
            req.setAttribute("msg", "No items selected.");
        }

        // Redirect or forward to a confirmation page
        RequestDispatcher rd = req.getRequestDispatcher("confirmation.jsp");
        rd.forward(req, res);
    }
}
