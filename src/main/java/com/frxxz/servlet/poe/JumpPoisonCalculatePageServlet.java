package com.frxxz.servlet.poe;


import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class JumpPoisonCalculatePageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("JumpPoisonCalculatePageServlet doget method");

        //posioncalculate.jsp
        //posioncalculate.jsp
        req.getRequestDispatcher("/pages/poe/posioncalculate.jsp").forward(req, resp);



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("JumpPoisonCalculatePageServlet dopost method");
        super.doPost(req, resp);
    }
}
