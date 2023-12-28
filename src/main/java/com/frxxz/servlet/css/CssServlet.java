package com.frxxz.servlet.css;

import com.frxxz.servlet.BaseServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CssServlet extends BaseServlet {
    public void jumpCss(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pages/css/css_index.jsp").forward(request,response);
    }
}
