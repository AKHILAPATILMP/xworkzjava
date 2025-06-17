package com.xworkz.servlets;

import com.xworkz.dto.BirthCertificateDTO;
import com.xworkz.repository.BirthRepository;
import com.xworkz.repository.BirthRepositoryImp;
import com.xworkz.service.BirthService;
import com.xworkz.service.BirthServiceImp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet("/general")
public class BirthCertificateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        String birthId=req.getParameter("birthId");
       String hospitalName=req.getParameter("hospitalName");
      String fatherName=  req.getParameter("fatherName");
      String motherName=  req.getParameter("motherName");
       String birthDateTime=req.getParameter("birthDateTime");
     String doctorName=   req.getParameter("doctorName");
       String nurseName= req.getParameter("nurseName");
        String hospitalType= req.getParameter("hospitalType");


        BirthCertificateDTO dto = new BirthCertificateDTO(birthId,hospitalName,fatherName,motherName,birthDateTime,doctorName,nurseName,hospitalType );
        System.out.println("Birthid="+birthId + "hospitalname="+hospitalName + "fathername="+fatherName +"mothername="+motherName + "birthDateTime="+birthDateTime +"doctorname="+doctorName +"nursename="+nurseName + "hospitaltype="+hospitalType);

        BirthService birthService=new BirthServiceImp();
        String result=birthService.validate(dto);
        System.out.println(result);

        BirthRepository birthRepository = new BirthRepositoryImp();
        String output = birthRepository.save(dto);
        System.out.println(output);

        req.setAttribute("dto", dto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("birthsuccess.jsp");
        dispatcher.forward(req, resp);

    }
}
