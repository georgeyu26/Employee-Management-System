/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JPanel;
import java.util.*;
//import Main.*;

/**
 *
 * @author ymali
 */
public class AddEmp extends javax.swing.JPanel {
    /**
     * Creates new form AddEmp
     */
    public AddEmp() {
        initComponents();
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        FullOrPartTime = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        addButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jTextField8 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jTextField10 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 0, 0));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Panels/Images/icons8_Contacts_48px.png"))); // NOI18N
        jLabel1.setText("Add Employee");
        add(jLabel1);
        jLabel1.setBounds(51, 44, 169, 48);

        addButton.setBackground(new java.awt.Color(55, 50, 50));
        addButton.setAlignmentX(0.0F);
        addButton.setAlignmentY(0.0F);
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main/Panels/Images/icons8_Import_24px.png"))); // NOI18N
        jLabel4.setText("Add");

        javax.swing.GroupLayout addButtonLayout = new javax.swing.GroupLayout(addButton);
        addButton.setLayout(addButtonLayout);
        addButtonLayout.setHorizontalGroup(
            addButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addButtonLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        addButtonLayout.setVerticalGroup(
            addButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(addButton);
        addButton.setBounds(591, 408, 89, 46);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("NOTE: Only fill out the section below if the employee is part time.");
        add(jLabel15);
        jLabel15.setBounds(335, 212, 345, 16);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NOTE: Only fill out the yearly salary section if the employee is full time.");
        add(jLabel13);
        jLabel13.setBounds(307, 121, 373, 16);
        add(jSeparator7);
        jSeparator7.setBounds(494, 169, 70, 11);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Work Location:");
        add(jLabel7);
        jLabel7.setBounds(141, 303, 92, 20);

        jTextField7.setBackground(new java.awt.Color(255, 0, 0));
        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setBorder(null);
        add(jTextField7);
        jTextField7.setBounds(494, 143, 67, 20);
        add(jSeparator5);
        jSeparator5.setBounds(237, 329, 70, 11);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Yearly Salary:");
        add(jLabel9);
        jLabel9.setBounds(410, 143, 80, 20);

        jTextField5.setBackground(new java.awt.Color(255, 0, 0));
        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        add(jTextField5);
        jTextField5.setBounds(237, 303, 67, 20);

        jRadioButton1.setBackground(new java.awt.Color(255, 0, 0));
        FullOrPartTime.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Full Time");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1);
        jRadioButton1.setBounds(227, 94, 75, 25);

        jRadioButton2.setBackground(new java.awt.Color(255, 0, 0));
        FullOrPartTime.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Part Time");
        add(jRadioButton2);
        jRadioButton2.setBounds(227, 121, 77, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Deduction Rate:");
        add(jLabel8);
        jLabel8.setBounds(51, 381, 97, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:");
        add(jLabel3);
        jLabel3.setBounds(164, 164, 69, 20);
        add(jSeparator2);
        jSeparator2.setBounds(237, 190, 70, 11);
        add(jSeparator8);
        jSeparator8.setBounds(494, 265, 70, 11);

        jTextField8.setBackground(new java.awt.Color(255, 0, 0));
        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setBorder(null);
        add(jTextField8);
        jTextField8.setBounds(494, 239, 67, 20);
        add(jSeparator6);
        jSeparator6.setBounds(176, 407, 90, 11);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hourly Wage:");
        add(jLabel10);
        jLabel10.setBounds(407, 239, 83, 20);

        jTextField6.setBackground(new java.awt.Color(255, 0, 0));
        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        add(jTextField6);
        jTextField6.setBounds(180, 380, 79, 20);
        add(jSeparator9);
        jSeparator9.setBounds(494, 308, 70, 11);

        jTextField2.setBackground(new java.awt.Color(255, 0, 0));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        add(jTextField2);
        jTextField2.setBounds(237, 167, 67, 16);

        jTextField9.setBackground(new java.awt.Color(255, 0, 0));
        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setBorder(null);
        add(jTextField9);
        jTextField9.setBounds(494, 282, 67, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hours Per Week:");
        add(jLabel11);
        jLabel11.setBounds(388, 282, 102, 20);
        add(jSeparator10);
        jSeparator10.setBounds(494, 356, 70, 11);

        jTextField10.setBackground(new java.awt.Color(255, 0, 0));
        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setBorder(null);
        add(jTextField10);
        jTextField10.setBounds(494, 330, 67, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name:");
        add(jLabel5);
        jLabel5.setBounds(165, 212, 68, 20);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Weeks Per Year:");
        add(jLabel12);
        jLabel12.setBounds(392, 330, 98, 20);
        add(jSeparator3);
        jSeparator3.setBounds(237, 238, 70, 11);

        jTextField3.setBackground(new java.awt.Color(255, 0, 0));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        add(jTextField3);
        jTextField3.setBounds(237, 212, 67, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sex:");
        add(jLabel6);
        jLabel6.setBounds(210, 260, 23, 20);
        add(jSeparator4);
        jSeparator4.setBounds(237, 286, 70, 11);

        jTextField4.setBackground(new java.awt.Color(255, 0, 0));
        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);
        add(jTextField4);
        jTextField4.setBounds(237, 260, 67, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Number:");
        add(jLabel2);
        jLabel2.setBounds(374, 381, 116, 20);
        add(jSeparator1);
        jSeparator1.setBounds(494, 408, 70, 11);

        jTextField1.setBackground(new java.awt.Color(255, 0, 0));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        add(jTextField1);
        jTextField1.setBounds(494, 382, 67, 20);
    }// </editor-fold>                        

    
    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        String fN, lN, workLoc, sex;
        double deductRate;
        int empNum, yearlySalary, hourlyWage, hoursPerWeek, weeksPerYear;
        fN = jTextField2.getText();
        lN = jTextField3.getText();
        workLoc = jTextField5.getText();
        sex = jTextField4.getText();
        empNum = Integer.parseInt(jTextField1.getText());
        deductRate = Double.parseDouble(jTextField6.getText());
            if (jRadioButton1.isSelected() == true){
                yearlySalary = Integer.parseInt(jTextField7.getText());
                FullTimeEmployee theEmployee = new FullTimeEmployee(empNum, fN, lN , sex, workLoc, deductRate, yearlySalary);
            HomePage.theHashTable.addEmployee(theEmployee);
            }
            if (jRadioButton2.isSelected() == true){
                hourlyWage = Integer.parseInt(jTextField7.getText());
                hoursPerWeek = Integer.parseInt(jTextField7.getText());
                weeksPerYear = Integer.parseInt(jTextField7.getText());
                PartTimeEmployee theEmployee = new PartTimeEmployee(empNum, fN, lN , sex, workLoc, deductRate, hourlyWage, hoursPerWeek, weeksPerYear);
                HomePage.theHashTable.addEmployee(theEmployee);
            }
        HomePage.theHashTable.displayContents();
    }                                      

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {                                       
        setColour(addButton); 
    }                                      

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        resetColour(addButton);
    }                                     

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           
public void setColour(JPanel panel){
        panel.setBackground(new java.awt.Color(70,70,70));
    }
    public void resetColour(JPanel panel){
        panel.setBackground(new java.awt.Color(55,50,50));
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup FullOrPartTime;
    private javax.swing.JPanel addButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration                   
}

