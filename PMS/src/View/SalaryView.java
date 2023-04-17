/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.EmployeeDAO;
import Dao.SalaryDAO;
import Models.Employee;
import Models.Salary;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pazo
 */
public class SalaryView extends javax.swing.JInternalFrame {

    /**
     * Creates new form SalaryView
     */
    public SalaryView() {
        initComponents();
        populateSalaryList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void fillTable(){
    SalaryDAO gDao = new SalaryDAO();
    List<Salary> sal = gDao.findAllSalary();
    Object[] row = new Object[5];
    DefaultTableModel model = (DefaultTableModel)salarytable.getModel();
    for(Salary salary :sal){
        row[0] =  salary.getSalaryId();
        row[1] =  salary.getTA();
        row[2] = salary.getWA();
        row[3] = salary.getBS();
        row[4] = salary.getEmployeeId();
        model.addRow(row);
    }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        salaryid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Viewbutton = new javax.swing.JButton();
        SaveSalaryButton = new javax.swing.JButton();
        UpdateSalaryButton = new javax.swing.JButton();
        WA = new javax.swing.JTextField();
        DeleteSalrybutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salarytable = new javax.swing.JTable();
        BS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TA = new javax.swing.JTextField();
        empid = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Salary View");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Employee Name");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Work Allowance");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Salry ID");

        Viewbutton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Viewbutton.setText("View");
        Viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewbuttonActionPerformed(evt);
            }
        });

        SaveSalaryButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        SaveSalaryButton.setText("Save");
        SaveSalaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveSalaryButtonActionPerformed(evt);
            }
        });

        UpdateSalaryButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        UpdateSalaryButton.setText("Update");
        UpdateSalaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSalaryButtonActionPerformed(evt);
            }
        });

        WA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        DeleteSalrybutton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        DeleteSalrybutton.setText("Delete");
        DeleteSalrybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSalrybuttonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Tax");

        salarytable.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        salarytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Salary ID", "TA", "WA", "BS", "Employee Name"
            }
        ));
        salarytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salarytableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(salarytable);

        BS.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("BS");

        TA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salaryid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(WA, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BS)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SaveSalaryButton)
                                        .addGap(7, 7, 7)
                                        .addComponent(UpdateSalaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DeleteSalrybutton)
                                        .addGap(18, 18, 18)
                                        .addComponent(Viewbutton))
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(empid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(TA)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(salaryid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empid, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveSalaryButton)
                    .addComponent(UpdateSalaryButton)
                    .addComponent(DeleteSalrybutton)
                    .addComponent(Viewbutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addComponent(TA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(258, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewbuttonActionPerformed
        // TODO add your handling code here:
        fillTable();
    }//GEN-LAST:event_ViewbuttonActionPerformed

    private void SaveSalaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveSalaryButtonActionPerformed
        // TODO add your handling code here:

        Salary d = new Salary(Integer.parseInt(salaryid.getText()), Integer.parseInt(BS.getText()),Integer.parseInt(TA.getText()),Integer.parseInt(WA.getText()),netCalcualtion(Integer.parseInt(BS.getText()), Integer.parseInt(WA.getText()), Integer.parseInt(TA.getText())),empid.getSelectedItem().toString());
        SalaryDAO Ddao = new SalaryDAO();
        Ddao.SaveSalary(d);
        String msg = Ddao.SaveSalary(d);
        JOptionPane.showMessageDialog(null,d.getEmployeeId()+ " " + msg);
        salaryid.setText("");
        TA.setText("");
        WA.setText("");
        BS.setText("");
        //fillTable();
    }//GEN-LAST:event_SaveSalaryButtonActionPerformed

    private void UpdateSalaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSalaryButtonActionPerformed
        // TODO add your handling code here:
        Salary d = new Salary();
        SalaryDAO Ddao = new SalaryDAO();
        d.setSalaryId(Integer.parseInt(salaryid.getText()));
        d.setEmployeeId(empid.getSelectedItem().toString());
        d.setWA(Integer.parseInt(WA.getText()));
       d.setTA(Integer.parseInt(TA.getText()));
       d.setBS(Integer.parseInt(BS.getText()));
       String msg = Ddao.UpdateSalary(d);
        JOptionPane.showMessageDialog(null,d.getSalaryId()+ " " + msg);
        salaryid.setText("");
        TA.setText("");
        WA.setText("");
        BS.setText("");
        fillTable();
    }//GEN-LAST:event_UpdateSalaryButtonActionPerformed

    private void DeleteSalrybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSalrybuttonActionPerformed
        // TODO add your handling code here:
       Salary d = new Salary();
        SalaryDAO Ddao = new SalaryDAO();
        d.setSalaryId(Integer.parseInt(salaryid.getText()));
        d.setEmployeeId(empid.getSelectedItem().toString());
        d.setWA(Integer.parseInt(WA.getText()));
       d.setTA(Integer.parseInt(TA.getText()));
       d.setBS(Integer.parseInt(BS.getText()));
       String msg = Ddao.DeleteSalary(d);
        JOptionPane.showMessageDialog(null,d.getSalaryId()+ " " + msg);
        salaryid.setText("");
        TA.setText("");
        WA.setText("");
        BS.setText("");
        fillTable();
    }//GEN-LAST:event_DeleteSalrybuttonActionPerformed
private void populateSalaryList(){
        EmployeeDAO Emplo = new EmployeeDAO();
        List<Employee> emps = Emplo.findAllEmployees();
        for (Employee Emp : emps) {
            empid.addItem(Emp.getName());
//            empid.setSelectedItem(Emp.getEmployeeId());
            
        }
    }
private int netCalcualtion(int bs, int allowance, int deduction){
        bs= Integer.parseInt(BS.getText());
        allowance= Integer.parseInt(WA.getText());
        deduction= Integer.parseInt(TA.getText());
        int Netpay = (bs+allowance)-deduction;
         return Netpay;
}
    private void salarytableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salarytableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) salarytable.getModel();
        int rowSelect = salarytable.getSelectedRow();
        salaryid.setText(model.getValueAt(rowSelect, 0).toString());
        TA.setText(model.getValueAt(rowSelect, 1).toString());
        WA.setText(model.getValueAt(rowSelect, 2).toString());
        BS.setText(model.getValueAt(rowSelect, 3).toString());

    }//GEN-LAST:event_salarytableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BS;
    private javax.swing.JButton DeleteSalrybutton;
    private javax.swing.JButton SaveSalaryButton;
    private javax.swing.JTextField TA;
    private javax.swing.JButton UpdateSalaryButton;
    private javax.swing.JButton Viewbutton;
    private javax.swing.JTextField WA;
    private javax.swing.JComboBox<String> empid;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField salaryid;
    private javax.swing.JTable salarytable;
    // End of variables declaration//GEN-END:variables
}
