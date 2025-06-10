package com.xworkz.servlets;

import com.xworkz.dto.MarriageCertificateDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/marriageCertificate")
public class MarriageCertificateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        MarriageCertificateDTO dto = new MarriageCertificateDTO();
        dto.setGroomName(req.getParameter("groomName"));
        dto.setBrideName(req.getParameter("brideName"));
        dto.setLocation(req.getParameter("location"));
        dto.setAddress(req.getParameter("address"));
        dto.setReligion(req.getParameter("religion"));
        dto.setDate(req.getParameter("date"));
        dto.setWitness1(req.getParameter("witness1"));
        dto.setWitness2(req.getParameter("witness2"));
        dto.setOfficer(req.getParameter("officer"));

        req.setAttribute("marriage", dto);
        req.getRequestDispatcher("marriagesuccess.jsp").forward(req, resp);
    }
}
