/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;
import java.sql.SQLException;

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
}
