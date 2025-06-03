package com.xworkz.rcb;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/theft")
public class TheftServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("name", req.getParameter("name"));
        req.setAttribute("mobile", req.getParameter("mobile"));
        req.setAttribute("age", req.getParameter("age"));
        req.setAttribute("address", req.getParameter("address"));
        req.setAttribute("location", req.getParameter("location"));
        req.setAttribute("item", req.getParameter("item"));
        req.setAttribute("lostOn", req.getParameter("lostOn"));

        RequestDispatcher dispatcher = req.getRequestDispatcher("TheftResult.jsp");
        dispatcher.forward(req, resp);
    }
}
