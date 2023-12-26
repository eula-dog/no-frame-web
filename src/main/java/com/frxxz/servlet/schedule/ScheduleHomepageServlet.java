package com.frxxz.servlet.schedule;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ScheduleHomepageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("ScheduleHomepageServlet doget method");

        //posioncalculate.jsp
        //posioncalculate.jsp
        req.getRequestDispatcher("/pages/schedule/schedule_homepage.jsp").forward(req, resp);



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ScheduleHomepageServlet dopost method");
        String scheduleformFirst = req.getParameter("scheduleform_first");
        String scheduleformSecond = req.getParameter("scheduleform_second");
        String scheduleformThird = req.getParameter("scheduleform_third");
        System.out.println(scheduleformFirst);
        System.out.println(scheduleformSecond);
        System.out.println(scheduleformThird);
    }
}
