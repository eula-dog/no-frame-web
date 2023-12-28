package com.frxxz.servlet.index;

import com.alibaba.fastjson.JSON;
import com.frxxz.bean.CatalogueBean;
import com.frxxz.service.IndexService;
import com.frxxz.servlet.BaseServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class IndexServlet extends BaseServlet {
    private IndexService indexService = new IndexService();

    public void settingIndexCatalogue(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {

        int id =Integer.parseInt(req.getParameter("id"));

        ArrayList<CatalogueBean> catalogueBeans = indexService.getAllIndexCatalogue(id);

        String cataStr = JSON.toJSONString(catalogueBeans);

        resp.getWriter().write(cataStr);
    }


    public void jumpToAddIndexQuestionPage(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pages/index/index_question_add.jsp").forward(request,response);
    }
}
