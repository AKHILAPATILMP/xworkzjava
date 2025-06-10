package com.xworkz.servlets;

import com.xworkz.dto.PassportApplicationDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/passportApplication")
public class PassportApplicationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PassportApplicationDTO dto = new PassportApplicationDTO();
        dto.setApplicantName(req.getParameter("applicantName"));
        dto.setAadharNo(req.getParameter("aadharNo"));
        dto.setAddress(req.getParameter("address"));
        dto.setPanNo(req.getParameter("panNo"));
        dto.setCountry(req.getParameter("country"));
        dto.setState(req.getParameter("state"));
        dto.setCity(req.getParameter("city"));
        dto.setPinCode(req.getParameter("pinCode"));
        dto.setPassportType(req.getParameter("passportType"));
        dto.setPaymentRefNo(req.getParameter("paymentRefNo"));

        req.setAttribute("passport", dto);
        req.getRequestDispatcher("passportsuccess.jsp").forward(req, resp);
    }
}
