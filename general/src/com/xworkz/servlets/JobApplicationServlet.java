package com.xworkz.servlets;

import com.xworkz.dto.JobApplicationDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/jobApplication")
public class JobApplicationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        JobApplicationDTO dto = new JobApplicationDTO();
        dto.setName(req.getParameter("name"));
        dto.setEmail(req.getParameter("email"));
        dto.setEducation(req.getParameter("education"));
        dto.setSkills(req.getParameter("skills"));
        dto.setExpectedSalary(req.getParameter("expectedSalary"));
        dto.setExperience(req.getParameter("experience"));

        req.setAttribute("job", dto);
        req.getRequestDispatcher("jobsuccess.jsp").forward(req, resp);
    }
}
