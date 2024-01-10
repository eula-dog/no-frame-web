package com.frxxz.servlet.schedule;

import com.alibaba.fastjson.JSON;
import com.frxxz.bean.CommentBean;
import com.frxxz.bean.ScheduleBean;
import com.frxxz.service.schedule.ScheduleService;
import com.frxxz.servlet.BaseServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ScheduleServlet extends BaseServlet {

    protected ScheduleService scheduleService = new ScheduleService();

    public void goToScheduleAddPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pages/schedule/schedule_add.jsp").forward(request,response);
    }


    public void addSchedule(HttpServletRequest request,HttpServletResponse response) throws SQLException {
        String schedule = request.getParameter("schedule");
        String detail = request.getParameter("detail");
        String dateTime = request.getParameter("dateTime");
        System.out.println(dateTime);
        ScheduleBean scheduleBean = new ScheduleBean(schedule,detail,dateTime);
        Boolean flag = scheduleService.addSchedule(scheduleBean);
    }

    public void selectSchedule(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException {

        String startTime = request.getParameter("");
        String status = request.getParameter("status");
        String keyWord = request.getParameter("keyword");
        Map<String,String> queryMap = new HashMap<>();
        queryMap.put("startTime",startTime);
        ArrayList<ScheduleBean> scheduleBeans = scheduleService.selectSchedules(queryMap);

        String resStr = JSON.toJSONString(scheduleBeans);

        response.getWriter().write(resStr);
    }
}
