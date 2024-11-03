/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Buy;


import javax.swing.JOptionPane;
import purchase.PurchaseInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Admin
 */
public class BuyInterface extends javax.swing.JFrame {

        
    public BuyInterface() {
        initComponents();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("Orange quantity fruits");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 70));

        jTextField2.setText("Banana (kg)");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 210, 70));

        jTextField3.setText("Apple quantity fruits");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 200, 60));

        jTextField4.setText("Pine Apple quantity fruits");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 60));

        jTextField5.setText("Grapes quantity fruits");
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 110, 210, 60));

        jTextField6.setText("Mango qunatity fruits");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 200, 60));

        jTextField7.setText("Papaya quantity fruits");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 200, 60));

        jRadioButton1.setText("jRadioButton1");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 20, -1));

        jRadioButton2.setText("jRadioButton2");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 20, -1));

        jRadioButton3.setText("jRadioButton3");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 20, -1));

        jRadioButton4.setText("jRadioButton4");
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, 20, -1));

        jRadioButton5.setText("jRadioButton5");
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 650, 20, 40));

        jRadioButton6.setText("jRadioButton6");
        jPanel1.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, 20, -1));

        jRadioButton7.setText("jRadioButton7");
        jPanel1.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 661, 20, 20));

        jTextField8.setEditable(false);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 450, 50));

        jTextField9.setEditable(false);
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 450, 40));

        jTextField10.setEditable(false);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 450, 40));

        jTextField11.setEditable(false);
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 450, 50));

        jTextField12.setEditable(false);
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, 450, 50));

        jTextField13.setEditable(false);
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 450, 40));

        jTextField14.setEditable(false);
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, 450, 50));

        jTextField15.setEditable(false);
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 650, 140, 40));

        jButton1.setBackground(new java.awt.Color(48, 204, 64));
        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 653, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buy/TV - 4.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel2.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLabel2.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                        
    double totalCost = 0.0;
    boolean itemSelected = false;
    boolean quantityEntered = false;
    
  
    
    try {
        
        if (jRadioButton1.isSelected()) {
            itemSelected = true;
            int quantity = Integer.parseInt(jTextField1.getText());
            if (quantity > 0) {
                quantityEntered = true;
                double cost = quantity * 0.5;
                totalCost += cost;
                jTextField8.setText("Orange x " + quantity + " = $" + cost);
            } else {
                jTextField8.setText("");
            }
        }
        if (jRadioButton2.isSelected()) {
            itemSelected = true;
            int quantity = Integer.parseInt(jTextField2.getText());
            if (quantity > 0) {
                quantityEntered = true;
                double cost = quantity * 1.0;
                totalCost += cost;
                jTextField9.setText("Banana x " + quantity + " = $" + cost);
            } else {
                jTextField9.setText("");
            }
        }
        if (jRadioButton3.isSelected()) {
            itemSelected = true;
            int quantity = Integer.parseInt(jTextField3.getText());
            if (quantity > 0) {
                quantityEntered = true;
                double cost = quantity * 2.0;
                totalCost += cost;
                jTextField10.setText("Apple x " + quantity + " = $" + cost);
            } else {
                jTextField10.setText("");
            }
        }
        if (jRadioButton4.isSelected()) {
            itemSelected = true;
            int quantity = Integer.parseInt(jTextField4.getText());
            if (quantity > 0) {
                quantityEntered = true;
                double cost = quantity * 1.5;
                totalCost += cost;
                jTextField11.setText("Pineapple x " + quantity + " = $" + cost);
            } else {
                jTextField11.setText("");
            }
        }
        if (jRadioButton5.isSelected()) {
            itemSelected = true;
            int quantity = Integer.parseInt(jTextField5.getText());
            if (quantity > 0) {
                quantityEntered = true;
                double cost = quantity * 2.0;
                totalCost += cost;
                jTextField12.setText("Grapes x " + quantity + " = $" + cost);
            } else {
                jTextField12.setText("");
            }
        }
        if (jRadioButton6.isSelected()) {
            itemSelected = true;
            int quantity = Integer.parseInt(jTextField6.getText());
            if (quantity > 0) {
                quantityEntered = true;
                double cost = quantity * 1.0;
                totalCost += cost;
                jTextField13.setText("Mango x " + quantity + " = $" + cost);
            } else {
                jTextField13.setText("");
            }
        }
        if (jRadioButton7.isSelected()) {
            itemSelected = true;
            int quantity = Integer.parseInt(jTextField7.getText());
            if (quantity > 0) {
                quantityEntered = true;
                double cost = quantity * 3.0;
                totalCost += cost;
                jTextField14.setText("Papaya x " + quantity + " = $" + cost);
            } else {
                jTextField14.setText("");
            }
        }
        

        if (!itemSelected || !quantityEntered) {
            JOptionPane.showMessageDialog(this, "Please select at least one fruit and enter a valid quantity.");
        } else {
            jTextField15.setText("$" + totalCost);
            int result = JOptionPane.showConfirmDialog(this,
                    "Total cost is = $" + totalCost + "\nAre you sure you want to purchase these items?",
                    "Confirm Purchase",
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Purchase confirmed!");
                PurchaseInterface purchase = new PurchaseInterface();
                purchase.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Purchase canceled.");
            }
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter a valid quantity.");
    }
    try {
        String url = "jdbc:mysql://localhost:3306/fruits";
            String username = "root";
            String password = "";
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
 
    

    
    String purchaseQuery = "INSERT INTO purchase(fruitname, quantity) VALUES (?, ?)";
    PreparedStatement purchaseStatement = connection.prepareStatement(purchaseQuery);
    
    
    if (jRadioButton1.isSelected()) {
        int quantity = Integer.parseInt(jTextField1.getText());
        if (quantity > 0) {
            purchaseStatement.setString(1, "Orange");
            purchaseStatement.setInt(2, quantity);
            purchaseStatement.executeUpdate();
        }
    }
    if (jRadioButton2.isSelected()) {
        int quantity = Integer.parseInt(jTextField2.getText());
        if (quantity > 0) {
            purchaseStatement.setString(1, "Banana");
            purchaseStatement.setInt(2, quantity);
            purchaseStatement.executeUpdate();
        }
    }
    if (jRadioButton3.isSelected()) {
        int quantity = Integer.parseInt(jTextField3.getText());
        if (quantity > 0) {
            purchaseStatement.setString(1, "Apple");
            purchaseStatement.setInt(2, quantity);
            purchaseStatement.executeUpdate();
        }
    }
    if (jRadioButton4.isSelected()) {
        int quantity = Integer.parseInt(jTextField4.getText());
        if (quantity > 0) {
            purchaseStatement.setString(1, "Pineapple");
            purchaseStatement.setInt(2, quantity);
            purchaseStatement.executeUpdate();
        }
    }
    if (jRadioButton5.isSelected()) {
        int quantity = Integer.parseInt(jTextField5.getText());
        if (quantity > 0) {
            purchaseStatement.setString(1, "Grapes");
            purchaseStatement.setInt(2, quantity);
            //purchaseStatement.setDouble(3, quantity * 2.0);
            purchaseStatement.executeUpdate();
        }
    }
    if (jRadioButton6.isSelected()) {
        int quantity = Integer.parseInt(jTextField6.getText());
        if (quantity > 0) {
            purchaseStatement.setString(1, "Mango");
            purchaseStatement.setInt(2, quantity);
            //purchaseStatement.setDouble(3, quantity * 1.0);
            purchaseStatement.executeUpdate();
        }
    }
    if (jRadioButton7.isSelected()) {
        int quantity = Integer.parseInt(jTextField7.getText());
        if (quantity > 0) {
            purchaseStatement.setString(1, "Papaya");
            purchaseStatement.setInt(2, quantity);
           // purchaseStatement.setDouble(3, quantity * 3.0);
            purchaseStatement.executeUpdate();
        }
    }

    
    purchaseStatement.close();
    connection.close();

    
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Error occurred: " + e.getMessage());
}
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
