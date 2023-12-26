package com.frxxz.servlet.schedule;

import com.alibaba.fastjson.JSON;
import com.frxxz.bean.DescriptionBean;
import com.frxxz.service.DescriptionService;
import com.frxxz.servlet.BaseServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;

public class DescriptionServlet extends BaseServlet {

    private DescriptionService descriptionService = new DescriptionService();

    public void getOneDescription(HttpServletRequest req, HttpServletResponse resp) throws IOException, SQLException {
        System.out.println("getOneDescription ...");

        String id = req.getParameter("id");

        System.out.println(id);

        DescriptionBean descriptionBean = descriptionService.getOneDescription(Integer.parseInt(id));

        String descriptionStr = JSON.toJSONString(descriptionBean);

        resp.getWriter().write(descriptionStr);
    }
}
