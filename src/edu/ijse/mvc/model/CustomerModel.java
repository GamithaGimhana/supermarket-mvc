/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.CustomerDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author gamit
 */
public class CustomerModel {
    
    public String save(CustomerDto dto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement statement = connection.prepareCall(sql);
        
        statement.setString(1, dto.getCustID());
        statement.setString(2, dto.getCustTitle());
        statement.setString(3, dto.getCustName());
        statement.setString(4, dto.getDOB());
        statement.setDouble(5, dto.getSalary());
        statement.setString(6, dto.getCustAddress());
        statement.setString(7, dto.getCity());
        statement.setString(8, dto.getProvince());
        statement.setString(9, dto.getPostalCode());
        
        int result = statement.executeUpdate();
        return result > 0 ? "Success Build" : "Fail Build";
    }
    
    public String update(CustomerDto dto) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "update Customer set CustTitle = ?, CustName = ?, DOB = ?, salary = ?, CustAddress = ?, City = ?, Province = ?, PostalCode = ? where CustID = ?";
        
        PreparedStatement statement = connection.prepareCall(sql);
        
        statement.setString(9, dto.getCustID());
        statement.setString(1, dto.getCustTitle());
        statement.setString(2, dto.getCustName());
        statement.setString(3, dto.getDOB());
        statement.setDouble(4, dto.getSalary());
        statement.setString(5, dto.getCustAddress());
        statement.setString(6, dto.getCity());
        statement.setString(7, dto.getProvince());
        statement.setString(8, dto.getPostalCode());
        
        int result = statement.executeUpdate();
        return result > 0 ? "Success Build" : "Fail Build";
    }
    
    public String delete(String custID) throws ClassNotFoundException, SQLException{
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "delete from Customer where CustID = ?";
        
        PreparedStatement statement = connection.prepareCall(sql);
        
        statement.setString(1, custID);
        
        int result = statement.executeUpdate();
        return result > 0 ? "Success Build" : "Fail Build";
    }
    
}
