/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author gamit
 */
public class CustomerController {
    
    private final CustomerModel CUSTOMER_MODEL;

    public CustomerController() {
        this.CUSTOMER_MODEL = new CustomerModel();
    }
    
    public String saveCustomer(CustomerDto customerdto) throws ClassNotFoundException, SQLException{
        String resp = CUSTOMER_MODEL.save(customerdto);
        return resp;
    }
    
    public String updateCustomer(CustomerDto customerdto) throws ClassNotFoundException, SQLException{
        String resp = CUSTOMER_MODEL.update(customerdto);
        return resp;
    }
    
    public String deleteCustomer(String custID) throws ClassNotFoundException, SQLException{
        String resp = CUSTOMER_MODEL.delete(custID);
        return resp;
    }
    
    public CustomerDto searchCustomer(String custID) throws ClassNotFoundException, SQLException{
        CustomerDto dto = CUSTOMER_MODEL.getCustomer(custID);
        return dto;
    }
    
    public List<CustomerDto> getAllCustomers() throws ClassNotFoundException, SQLException{
        List<CustomerDto> customerDtos = CUSTOMER_MODEL.getAll();
        return customerDtos;
    }
}
