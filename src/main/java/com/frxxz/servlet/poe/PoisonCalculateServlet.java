package com.frxxz.servlet.poe;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

public class PoisonCalculateServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("PoisonCalculateServlet doget method");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("PoisonCalculateServlet dopost method");
        String lightdamagesmall = req.getParameter("lightdamagesmall");
        System.out.println(lightdamagesmall);
    }
}
