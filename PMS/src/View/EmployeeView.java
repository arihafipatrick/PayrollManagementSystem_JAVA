/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.DepartmentDAO;
import Dao.EmployeeDAO;
import Models.Department;
import Models.Employee;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pazo
 */
public class EmployeeView extends javax.swing.JInternalFrame {

    /**
     * Creates new form EmployeeView
     */
    public EmployeeView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeleteEmployeebutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        emptable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Empname = new javax.swing.JTextField();
        Viewbutton = new javax.swing.JButton();
        SaveEmployeeButton = new javax.swing.JButton();
        UpdateEmployeeButton = new javax.swing.JButton();
        DOB = new com.toedter.calendar.JDateChooser();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        empid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Employee View");

        DeleteEmployeebutton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        DeleteEmployeebutton.setText("Delete");
        DeleteEmployeebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEmployeebuttonActionPerformed(evt);
            }
        });

        emptable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        emptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "DOB", "Email", "Address"
            }
        ));
        emptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(emptable);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Employee Name");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("DOB");

        Empname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        Viewbutton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Viewbutton.setText("View");
        Viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewbuttonActionPerformed(evt);
            }
        });

        SaveEmployeeButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        SaveEmployeeButton.setText("Save");
        SaveEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveEmployeeButtonActionPerformed(evt);
            }
        });

        UpdateEmployeeButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        UpdateEmployeeButton.setText("Update");
        UpdateEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEmployeeButtonActionPerformed(evt);
            }
        });

        DOB.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        address.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Address");

        email.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Employee ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(empid)
                            .addComponent(address)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DOB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Empname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SaveEmployeeButton)
                                        .addGap(7, 7, 7)
                                        .addComponent(UpdateEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DeleteEmployeebutton)
                                        .addGap(18, 18, 18)
                                        .addComponent(Viewbutton))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Empname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveEmployeeButton)
                    .addComponent(UpdateEmployeeButton)
                    .addComponent(DeleteEmployeebutton)
                    .addComponent(Viewbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void fillTable(){
    EmployeeDAO gDao = new EmployeeDAO();
    List<Employee> emp = gDao.findAllEmployees();
    Object[] row = new Object[5];
    DefaultTableModel model = (DefaultTableModel)emptable.getModel();
    for(Employee emplo :emp){
        row[0] =  emplo.getEmployeeId();
        row[1] =  emplo.getName();
        row[2] = emplo.getDOB();
        row[3] = emplo.getEmail();
        row[4] = emplo.getAddress();
        model.addRow(row);
    }
    }
    private void DeleteEmployeebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEmployeebuttonActionPerformed
        // TODO add your handling code here:
        Employee d = new Employee();
        EmployeeDAO Ddao = new EmployeeDAO();
        d.setEmployeeId(Integer.parseInt(empid.getText()));
        d.setName(Empname.getText());
        d.setDOB(DOB.getDate());
        d.setEmail(email.getText());
        d.setAddress(address.getText());
        String msg = Ddao.DeleteEmployee(d);
        JOptionPane.showMessageDialog(null,d.getName()+ " " + msg);
        Empname.setText("");
        email.setText("");
        DOB.setDate(null);
        address.setText("");
        fillTable();
    }//GEN-LAST:event_DeleteEmployeebuttonActionPerformed

    private void emptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) emptable.getModel();
        int rowSelect = emptable.getSelectedRow();
        empid.setText(model.getValueAt(rowSelect, 0).toString());
        Empname.setText(model.getValueAt(rowSelect, 1).toString());
        DOB.setDate(null);
        email.setText(model.getValueAt(rowSelect, 3).toString());
        address.setText(model.getValueAt(rowSelect, 4).toString());
        
    }//GEN-LAST:event_emptableMouseClicked

    private void ViewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewbuttonActionPerformed
        // TODO add your handling code here:
        fillTable();
    }//GEN-LAST:event_ViewbuttonActionPerformed

    private void SaveEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveEmployeeButtonActionPerformed
        // TODO add your handling code here:

        Employee d = new Employee(Integer.parseInt(empid.getText()),Empname.getText(), DOB.getDate(), address.getText(), email.getText());
        EmployeeDAO Ddao = new EmployeeDAO();
        Ddao.SaveEmployee(d);
        String msg = Ddao.SaveEmployee(d);
        JOptionPane.showMessageDialog(null,d.getName()+ " " + msg);
        Empname.setText("");
        email.setText("");
        DOB.setDate(null);
        address.setText("");
        //fillTable();
    }//GEN-LAST:event_SaveEmployeeButtonActionPerformed

    private void UpdateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEmployeeButtonActionPerformed
        // TODO add your handling code here:
         Employee d = new Employee();
        EmployeeDAO Ddao = new EmployeeDAO();
        d.setEmployeeId(Integer.parseInt(empid.getText()));
        d.setName(Empname.getText());
        d.setDOB(DOB.getDate());
        d.setEmail(email.getText());
        d.setAddress(address.getText());
        String msg = Ddao.UpdateEmployee(d);
        JOptionPane.showMessageDialog(null,d.getName()+ " " + msg);
        Empname.setText("");
        email.setText("");
        DOB.setDate(null);
        address.setText("");
        fillTable();
    }//GEN-LAST:event_UpdateEmployeeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JButton DeleteEmployeebutton;
    private javax.swing.JTextField Empname;
    private javax.swing.JButton SaveEmployeeButton;
    private javax.swing.JButton UpdateEmployeeButton;
    private javax.swing.JButton Viewbutton;
    private javax.swing.JTextField address;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empid;
    private javax.swing.JTable emptable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}