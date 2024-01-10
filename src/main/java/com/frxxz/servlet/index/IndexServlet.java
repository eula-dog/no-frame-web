package com.frxxz.servlet.index;

import com.alibaba.fastjson.JSON;
import com.frxxz.bean.CatalogueBean;
import com.frxxz.bean.CommentBean;
import com.frxxz.bean.IndexQuestionBean;
import com.frxxz.service.IndexService;
import com.frxxz.servlet.BaseServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

        Date currentDateTime = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateFormat = simpleDateFormat.format(currentDateTime);
        IndexQuestionBean indexQuestionBean = new IndexQuestionBean(name,content,dateFormat);

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


    public void selectCommentsByQuestionId(HttpServletRequest request,HttpServletResponse response) throws SQLException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        ArrayList<CommentBean> commentBeans = indexService.selectCommentsByQuestionId(id);

        String resStr = JSON.toJSONString(commentBeans);

        response.getWriter().write(resStr);

    }


    public void addIndexQuestionComment(HttpServletRequest request,HttpServletResponse response) throws SQLException, IOException {
        System.out.println("addIndexQuestionComment");

        String questionId = request.getParameter("questionId");
        String comment = request.getParameter("comment");
        String time = request.getParameter("time");

        CommentBean commentBean = new CommentBean(Integer.parseInt(questionId),comment,time);

        System.out.println(commentBean);

        Boolean flag = indexService.addCommentByQuestionId(commentBean);

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



    public void goToConceptIndex(HttpServletRequest request,HttpServletResponse response) throws Exception {
       //response.sendRedirect("http://localhost:8080/frxxz/concept?action=goToConceptIndex");

        request.getRequestDispatcher("/pages/concept/concept_index.jsp").forward(request,response);
    }

    //goToScheduleIndex
    public void goToScheduleIndex(HttpServletRequest request,HttpServletResponse response) throws Exception {
        //response.sendRedirect("http://localhost:8080/frxxz/concept?action=goToConceptIndex");
        request.getRequestDispatcher("/pages/schedule/schedule_index.jsp").forward(request,response);
    }
}
