package com.frxxz.servlet.common;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ReturnToHomepageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("ReturnToHomepageServlet doget method");

        //posioncalculate.jsp
        //posioncalculate.jsp
        req.getRequestDispatcher("/index.jsp").forward(req, resp);



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ReturnToHomepageServlet dopost method");
        super.doPost(req, resp);
    }

}
