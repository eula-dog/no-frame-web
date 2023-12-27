package com.frxxz.servlet.html;

import com.frxxz.servlet.BaseServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HtmlServlet extends BaseServlet {

    public void jumpHtml(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ///pages/poe/posioncalculate.jsp
        //html_index.jsp
        //html_index.jsp
        request.getRequestDispatcher("/pages/html/html_index.jsp").forward(request,response);
    }
}
