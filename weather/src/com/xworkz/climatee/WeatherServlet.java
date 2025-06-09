package com.weather;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/weather")
public class WeatherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get form data
        String location = request.getParameter("location");
        String capturedBy = request.getParameter("capturedBy");
        String temp = request.getParameter("temp");
        String recordedDate = request.getParameter("recordedDate");

        // Create DTO object
        com.weather.WeatherDTO dto = new com.weather.WeatherDTO(location, capturedBy, temp, recordedDate);

        // Pass DTO to JSP
        request.setAttribute("weather", dto);

        // Forward to result page
        request.getRequestDispatcher("WeatherResult.jsp").forward(request, response);
    }
}
