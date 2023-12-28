package com.frxxz.servlet.catalogue;

import com.frxxz.bean.CatalogueBean;
import com.frxxz.service.catalogue.CatalogueService;
import com.frxxz.servlet.BaseServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class CatalogueServlet extends BaseServlet {

    private CatalogueService catalogueService = new CatalogueService();

    public void addCatalogue(HttpServletRequest request , HttpServletResponse response) throws SQLException, IOException {
        String name = request.getParameter("name");
        int type = Integer.parseInt(request.getParameter("type"));
        String href = request.getParameter("href");
        String strLevel = request.getParameter("level");
        Integer level = (strLevel==null||strLevel=="")?99999:Integer.parseInt(strLevel);
        CatalogueBean catalogueBean = new CatalogueBean(name,type,level,href);
        boolean flag = catalogueService.addCatalogue(catalogueBean);
        System.out.println(flag);
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.print("{\"success\": true, \"message\": \"请求成功\"}");
        out.flush();
    }
}
