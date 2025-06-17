package com.xworkz.repo;

import com.xworkz.dto.TourismDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TourismRepositoryImp implements TourismRepository{
    @Override
    public String save(TourismDTO tourismDTO) {

        //load and register
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/toursdb";
            String username="root";
            String password="2002";

            //create a connection
            Connection connection = DriverManager.getConnection(url,username,password);

            //prepare the statement
            String sql = "insert into toursdb values( 0,'"+tourismDTO.getApplicantName()+"','"+tourismDTO.getDestination()+"','"+tourismDTO.getTravelDate() +"', '"+tourismDTO.getReturnDate()+"','"+tourismDTO.getGuideName()+"')";
            Statement statement = connection.createStatement();

            //Execute the statement

            statement.executeUpdate(sql);
            System.out.println(connection);
            return "true";

        }
        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }

}


