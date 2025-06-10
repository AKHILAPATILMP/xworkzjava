package com.xworkz.servlets;

import com.xworkz.dto.BirthCertificateDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/general")
public class BirthCertificateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        BirthCertificateDTO dto = new BirthCertificateDTO();
        dto.setBirthId(req.getParameter("birthId"));
        dto.setHospitalName(req.getParameter("hospitalName"));
        dto.setFatherName(req.getParameter("fatherName"));
        dto.setMotherName(req.getParameter("motherName"));
        dto.setBirthDateTime(req.getParameter("birthDateTime"));
        dto.setDoctorName(req.getParameter("doctorName"));
        dto.setNurseName(req.getParameter("nurseName"));
        dto.setHospitalType(req.getParameter("hospitalType"));

        req.setAttribute("birth", dto);
        req.getRequestDispatcher("birthsuccess.jsp").forward(req, resp);
    }
}
