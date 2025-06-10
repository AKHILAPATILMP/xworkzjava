package com.xworkz.servlets;

import com.xworkz.dto.DeathCertificateDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/deathCertificate")
public class DeathCertificateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        DeathCertificateDTO dto = new DeathCertificateDTO();
        dto.setName(req.getParameter("name"));
        dto.setCause(req.getParameter("cause"));
        dto.setDate(req.getParameter("date"));
        dto.setTime(req.getParameter("time"));
        dto.setAge(req.getParameter("age"));
        dto.setCertifiedBy(req.getParameter("certifiedBy"));
        dto.setHospitalName(req.getParameter("hospitalName"));
        dto.setMannerOfDeath(req.getParameter("mannerOfDeath"));
        dto.setGender(req.getParameter("gender"));
        dto.setMarks(req.getParameter("marks"));

        req.setAttribute("death", dto);
        req.getRequestDispatcher("deathsuccess.jsp").forward(req, resp);
    }
}
