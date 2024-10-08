/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.ijse.mvc.view;

import edu.ijse.mvc.controller.CustomerController;
import edu.ijse.mvc.dto.CustomerDto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gamit
 */
public class CustomerPanel extends javax.swing.JPanel {

    private final CustomerController CUSTOMER_CONTROLLER;
    
    /**
     * Creates new form CustomerPanel
     */
    public CustomerPanel() {
        CUSTOMER_CONTROLLER = new CustomerController();
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCustomerForm = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();
        lblCustTitle = new javax.swing.JLabel();
        lblCustDob = new javax.swing.JLabel();
        lblCustAddress = new javax.swing.JLabel();
        lblCustCity = new javax.swing.JLabel();
        lblCustZip = new javax.swing.JLabel();
        lblCustId = new javax.swing.JLabel();
        txtCustTitle = new javax.swing.JTextField();
        lblCustName = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        txtCustDob = new javax.swing.JTextField();
        txtCustAddress = new javax.swing.JTextField();
        txtCustCity = new javax.swing.JTextField();
        txtCustZip = new javax.swing.JTextField();
        lblCustProvince = new javax.swing.JLabel();
        txtCustProvince = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblCustSalary = new javax.swing.JLabel();
        txtCustSalary = new javax.swing.JTextField();
        txtCustId = new javax.swing.JTextField();

        panelCustomerForm.setBackground(new java.awt.Color(204, 204, 204));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.GreyInline"));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Customer Form");
        lblTitle.setToolTipText("");

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblCustomer);

        lblCustTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCustTitle.setText("Customer Title");

        lblCustDob.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCustDob.setText("Customer DOB");

        lblCustAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCustAddress.setText("Address");

        lblCustCity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCustCity.setText("City");

        lblCustZip.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCustZip.setText("Postal Code");

        lblCustId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCustId.setText("Customer Id");

        lblCustName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCustName.setText("Customer Name");

        lblCustProvince.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCustProvince.setText("Province");

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblCustSalary.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCustSalary.setText("Salary");

        javax.swing.GroupLayout panelCustomerFormLayout = new javax.swing.GroupLayout(panelCustomerForm);
        panelCustomerForm.setLayout(panelCustomerFormLayout);
        panelCustomerFormLayout.setHorizontalGroup(
            panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustomerFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCustomerFormLayout.createSequentialGroup()
                        .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCustAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustZip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lblCustDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCustomerFormLayout.createSequentialGroup()
                                .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCustZip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCustCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCustProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCustProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 136, Short.MAX_VALUE))
                            .addGroup(panelCustomerFormLayout.createSequentialGroup()
                                .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCustId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCustDob, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCustTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCustName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblCustSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCustomerFormLayout.createSequentialGroup()
                                        .addComponent(txtCustSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panelCustomerFormLayout.createSequentialGroup()
                                        .addComponent(txtCustName)
                                        .addContainerGap())))
                            .addGroup(panelCustomerFormLayout.createSequentialGroup()
                                .addComponent(txtCustAddress)
                                .addContainerGap())))
                    .addGroup(panelCustomerFormLayout.createSequentialGroup()
                        .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCustomerFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addContainerGap())
        );
        panelCustomerFormLayout.setVerticalGroup(
            panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustomerFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustId)
                    .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustName)
                    .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustDob)
                    .addComponent(txtCustDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustSalary)
                    .addComponent(txtCustSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustAddress)
                    .addComponent(txtCustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustCity)
                    .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCustCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCustProvince)
                        .addComponent(txtCustProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustZip)
                    .addComponent(txtCustZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(panelCustomerFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCustomerForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCustomerForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        saveCustomer();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        updateCustomer();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        deleteCustomer();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        // TODO add your handling code here:
        searchCustomer();
    }//GEN-LAST:event_tblCustomerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblCustAddress;
    private javax.swing.JLabel lblCustCity;
    private javax.swing.JLabel lblCustDob;
    private javax.swing.JLabel lblCustId;
    private javax.swing.JLabel lblCustName;
    private javax.swing.JLabel lblCustProvince;
    private javax.swing.JLabel lblCustSalary;
    private javax.swing.JLabel lblCustTitle;
    private javax.swing.JLabel lblCustZip;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelCustomerForm;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtCustAddress;
    private javax.swing.JTextField txtCustCity;
    private javax.swing.JTextField txtCustDob;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtCustProvince;
    private javax.swing.JTextField txtCustSalary;
    private javax.swing.JTextField txtCustTitle;
    private javax.swing.JTextField txtCustZip;
    // End of variables declaration//GEN-END:variables

    private void saveCustomer(){
        CustomerDto customerDto = new CustomerDto(
            txtCustId.getText(),
            txtCustTitle.getText(),
            txtCustName.getText(),
            txtCustDob.getText(),
            Double.parseDouble(txtCustSalary.getText()),
            txtCustAddress.getText(),
            txtCustCity.getText(),
            txtCustProvince.getText(),
            txtCustZip.getText());
        
        try {
            String resp = CUSTOMER_CONTROLLER.saveCustomer(customerDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }   
    }
    
    private void updateCustomer(){
        CustomerDto customerDto = new CustomerDto(
            txtCustId.getText(),
            txtCustTitle.getText(),
            txtCustName.getText(),
            txtCustDob.getText(),
            Double.parseDouble(txtCustSalary.getText()),
            txtCustAddress.getText(),
            txtCustCity.getText(),
            txtCustProvince.getText(),
            txtCustZip.getText());
        
        try {
            String resp = CUSTOMER_CONTROLLER.updateCustomer(customerDto);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }   
    }
    
    private void deleteCustomer(){
        String custID = txtCustId.getText();
        
        try {
            String resp = CUSTOMER_CONTROLLER.deleteCustomer(custID);
            JOptionPane.showMessageDialog(this, resp);
            loadTable();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }   
    }
    
    private void searchCustomer(){
        String custID = (String) tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 0);
        System.out.println(custID);
        
        try {

            CustomerDto customerDto = CUSTOMER_CONTROLLER.searchCustomer(custID);
            if (customerDto != null) {
                txtCustId.setText(customerDto.getCustID());
                txtCustTitle.setText(customerDto.getCustTitle());
                txtCustName.setText(customerDto.getCustName());
                txtCustDob.setText(customerDto.getDOB());
                txtCustSalary.setText(Double.toString(customerDto.getSalary()));
                txtCustAddress.setText(customerDto.getCustAddress());
                txtCustCity.setText(customerDto.getCity());
                txtCustProvince.setText(customerDto.getProvince());
                txtCustZip.setText(customerDto.getPostalCode());
                
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void clearForm() {
        txtCustId.setText("");
        txtCustTitle.setText("");
        txtCustName.setText("");
        txtCustDob.setText("");
        txtCustSalary.setText("");
        txtCustAddress.setText("");
        txtCustCity.setText("");
        txtCustProvince.setText("");
        txtCustZip.setText("");
    }

    private void loadTable() {
        String columns[] = {"Customer Id", "Customer Title", "Cutomer Name", "DOB", "Salary", "Address", "Province", "Postal Code"};
        DefaultTableModel dtm = new DefaultTableModel(columns, 0){
           
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        tblCustomer.setModel(dtm);
        try {
            List<CustomerDto> customerDtos = CUSTOMER_CONTROLLER.getAllCustomers();
            for (CustomerDto dto : customerDtos) {
                Object [] rowData = {dto.getCustID(), dto.getCustTitle(), dto.getCustName(), dto.getDOB(), dto.getSalary(), dto.getCustAddress(), dto.getCity(), dto.getProvince(), dto.getPostalCode()};
                dtm.addRow(rowData);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
