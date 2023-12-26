package com.frxxz.servlet.schedule;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ScheduleformServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("ScheduleformServlet doget method");

        super.doGet(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ScheduleformServlet dopost method");
        String scheduleformFirst = req.getParameter("scheduleform_first");
        String scheduleformSecond = req.getParameter("scheduleform_second");
        String scheduleformThird = req.getParameter("scheduleform_third");
        System.out.println(scheduleformFirst);
        System.out.println(scheduleformSecond);
        System.out.println(scheduleformThird);
    }
}
