package com.xworkz.rcb;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/missing")
public class MissingPersonServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setAttribute("missingPersonName", req.getParameter("missingPersonName"));
        req.setAttribute("complainteeMobile", req.getParameter("complainteeMobile"));
        req.setAttribute("missingPersonAge", req.getParameter("missingPersonAge"));
        req.setAttribute("address", req.getParameter("address"));
        req.setAttribute("location", req.getParameter("location"));
        req.setAttribute("marks", req.getParameter("marks"));
        req.setAttribute("gender", req.getParameter("gender"));
        req.setAttribute("languageKnown", req.getParameter("languageKnown"));

        RequestDispatcher dispatcher = req.getRequestDispatcher("MissingPersonResult.jsp");
        dispatcher.forward(req, resp);
    }
}
