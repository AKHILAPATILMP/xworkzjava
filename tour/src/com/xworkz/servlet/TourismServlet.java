package com.xworkz.servlet;

import com.xworkz.dto.TourismDTO;
import com.xworkz.service.TourismService;
import com.xworkz.service.TourismServiceImp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/tourism")
public class TourismServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("applicantName");
        String destination = req.getParameter("destination");
        String travel = req.getParameter("travelDate");
        String returnDate = req.getParameter("returnDate");
        String guide = req.getParameter("guideName");

        TourismDTO dto = new TourismDTO(name, destination, travel, returnDate, guide);
        TourismService service = new TourismServiceImp();
        String result = service.validateAndSave(dto);

        req.setAttribute("tourism", dto);
        req.setAttribute("result", result);
        req.getRequestDispatcher("TourismSuccess.jsp").forward(req, resp);
    }
}
