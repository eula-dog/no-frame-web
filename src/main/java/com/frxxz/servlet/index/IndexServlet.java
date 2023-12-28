package com.frxxz.servlet.index;

import com.alibaba.fastjson.JSON;
import com.frxxz.bean.CatalogueBean;
import com.frxxz.bean.IndexQuestionBean;
import com.frxxz.service.IndexService;
import com.frxxz.servlet.BaseServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

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

    public void addQuestion(HttpServletRequest request,HttpServletResponse response) throws SQLException, IOException {

        String name = request.getParameter("name");
        String content = request.getParameter("content");

        IndexQuestionBean indexQuestionBean = new IndexQuestionBean(name,content);

        boolean flag = indexService.addQuestion(indexQuestionBean);

        if(flag){
            response.setStatus(HttpServletResponse.SC_OK);
            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            out.print("{\"success\": true, \"message\": \"请求成功\"}");
            out.flush();
        }else {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            out.print("{\"success\": false, \"message\": \"请求失败\"}");
            out.flush();
        }
    }


    public void settingIndexQuestion(HttpServletRequest request,HttpServletResponse response) throws IOException, SQLException {

        ArrayList<IndexQuestionBean> indexQuestionBeans = indexService.getIndexQuestion();

        String cataStr = JSON.toJSONString(indexQuestionBeans);

        response.getWriter().write(cataStr);
    }
}
