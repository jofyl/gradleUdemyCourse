package com.joseph.gradle;

import java.io.IOException;
// import jakarta.servlet.ServletConfig;
// import jakarta.servlet.ServletContext;
// import jakarta.servlet.ServletException;
// import jakarta.servlet.annotation.WebServlet;
// import jakarta.servlet.http.HttpServlet;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/coupon")
public class CouponServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            response.getWriter().print("SUPERSALE");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            String coupon = request.getParameter("coupon");
            request.setAttribute("discount", "Discount for coupon " + coupon + " is 50%");
            request.getRequestDispatcher("response.jsp").forward(request, response);
     }
}