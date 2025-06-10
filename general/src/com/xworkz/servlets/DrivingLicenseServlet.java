package com.xworkz.servlets;

import com.xworkz.dto.DrivingLicenseDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/drivingLicense")
public class DrivingLicenseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        DrivingLicenseDTO dto = new DrivingLicenseDTO();
        dto.setName(req.getParameter("name"));
        dto.setAddress(req.getParameter("address"));
        dto.setMobile(req.getParameter("mobile"));
        dto.setAppliedDate(req.getParameter("appliedDate"));
        dto.setVehicleType(req.getParameter("vehicleType"));

        req.setAttribute("dl", dto);
        req.getRequestDispatcher("drivingsuccess.jsp").forward(req, resp);
    }
}
