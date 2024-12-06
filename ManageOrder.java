/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_dbms;

import static java.awt.GridBagConstraints.BOTH;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;


public class ManageOrder extends javax.swing.JFrame {

    /**
     * Creates new form ManageOrder
     */
    public ManageOrder() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productList = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        productPrice = new javax.swing.JTextField();
        productQuantity = new javax.swing.JTextField();
        btnaddorder = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btncheckout = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        totalPane = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFieldChange = new javax.swing.JTextField();
        txtFieldCash = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isabella\\Documents\\NetbeansProjects\\jnfvdkj\\food  stockkkk.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        productList.setBackground(new java.awt.Color(51, 51, 51));
        productList.setForeground(new java.awt.Color(255, 255, 255));
        productList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productList);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("ORDER LIST");

        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        cartTable.setBackground(new java.awt.Color(51, 51, 51));
        cartTable.setForeground(new java.awt.Color(255, 255, 255));
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Sub-Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(cartTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("PRODUCT LIST");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECTED PRODUCT:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRODUCT NAME:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PRODUCT PRICE:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PRODUCT QUANTITY:");

        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });

        productPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productPriceActionPerformed(evt);
            }
        });

        productQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productQuantityActionPerformed(evt);
            }
        });

        btnaddorder.setBackground(new java.awt.Color(0, 0, 0));
        btnaddorder.setForeground(new java.awt.Color(255, 255, 255));
        btnaddorder.setText(" ADD TO ORDER");
        btnaddorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddorderActionPerformed(evt);
            }
        });

        btnclose.setBackground(new java.awt.Color(0, 0, 0));
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(0, 0, 0));
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btncheckout.setBackground(new java.awt.Color(0, 0, 0));
        btncheckout.setForeground(new java.awt.Color(255, 255, 255));
        btncheckout.setText("CHECKOUT");
        btncheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckoutActionPerformed(evt);
            }
        });

        jButton5.setText("home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(totalPane);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TOTAL:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CASH:");

        txtFieldChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldChangeActionPerformed(evt);
            }
        });

        txtFieldCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCashActionPerformed(evt);
            }
        });

        jButton1.setText("CHANGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(1319, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productName)
                                    .addComponent(productPrice)
                                    .addComponent(productQuantity)
                                    .addComponent(btnaddorder, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(178, 178, 178)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btndelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btncheckout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnclose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(141, 141, 141)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtFieldCash, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(36, 36, 36)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(115, 115, 115)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFieldChange, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(163, 163, 163)))
                .addGap(200, 200, 200))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane3, txtFieldCash, txtFieldChange});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton5)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(3, 3, 3)
                        .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFieldCash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFieldChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btncheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddorder, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(213, 213, 213))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane3, txtFieldCash, txtFieldChange});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1480, 920));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isabella\\Documents\\NetbeansProjects\\jnfvdkj\\HOMEEE (1).png")); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1440, 840));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCashActionPerformed

    private void txtFieldChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldChangeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new home().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btncheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckoutActionPerformed
        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement updatePstmt = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/marjodb";
        String user = "root";
        String pass = "03182005Elola";

        try {
            // Establish the connection to the database
            conn = DriverManager.getConnection(url, user, pass);

            // SQL query to fetch data from orderTable
            String sql = "SELECT name, quantity FROM orderTable";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // Iterate through the ResultSet for orderTable
            while (rs.next()) {
                String itemName = rs.getString("name");
                int orderedQuantity = rs.getInt("quantity");

                // Check the current quantity in inventoryTable
                PreparedStatement checkPstmt = conn.prepareStatement("SELECT quantity FROM inventoryTable WHERE name = ?");
                checkPstmt.setString(1, itemName);
                ResultSet checkRs = checkPstmt.executeQuery();

                if (checkRs.next()) {
                    int currentQuantity = checkRs.getInt("quantity");

                    if (currentQuantity >= orderedQuantity) {
                        // Update the inventory if there's enough stock
                        updatePstmt = conn.prepareStatement("UPDATE inventoryTable SET quantity = quantity - ? WHERE name = ?");
                        updatePstmt.setInt(1, orderedQuantity);
                        updatePstmt.setString(2, itemName);
                        updatePstmt.executeUpdate();
                        transferData();
                        orderRefresh();
                        deleteAll();
                        totalPane.setText("");
                        txtFieldCash.setText("");
                        txtFieldChange.setText("");
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Not enough stock for item: " + itemName, "Insufficient Stock", JOptionPane.WARNING_MESSAGE);
                    }
                }
                checkRs.close();
                checkPstmt.close();
            }

        } catch (SQLException e) {
            // Handle any SQL exceptions
            JOptionPane.showMessageDialog(null, "Error updating inventory: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Ensure resources are closed properly
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (updatePstmt != null) updatePstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                // Handle close exceptions if necessary
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage(), "Resource Closing Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btncheckoutActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        String url = "jdbc:mysql://localhost:3306/marjodb";
        String user = "root";
        String pass = "03182005Elola";

        Connection conn = null;
        PreparedStatement deleteStmt = null;

        try {
            conn = DriverManager.getConnection(url, user, pass);

            // Get selected rows
            int[] selectedRows = cartTable.getSelectedRows();
            // Assuming the first column contains the primary key (e.g., "id")
            String deleteSql = "DELETE FROM ordertable WHERE id = ?";
            deleteStmt = conn.prepareStatement(deleteSql);

            // Loop through selected rows and delete from the database
            for (int rowIndex : selectedRows) {
                // Assuming "id" is in the first column (column index 0)
                Object idValue = cartTable.getValueAt(rowIndex, 0);
                deleteStmt.setObject(1, idValue);
                deleteStmt.executeUpdate();

                // Optionally remove the row from the JTable model:
                ((DefaultTableModel) cartTable.getModel()).removeRow(rowIndex);
            }

            display(); // Your method to reflect the changes

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Clean up resources
            try {
                if (deleteStmt != null) deleteStmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        int response = JOptionPane.showConfirmDialog(null,
            "Do you want to proceed?",
            "Confirm",
            JOptionPane.YES_NO_OPTION);

        // Handle the user's response
        if (response == JOptionPane.YES_OPTION) {
            dispose();
        } else{

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnaddorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddorderActionPerformed
        String url = "jdbc:mysql://localhost:3306/marjodb";
        String user = "root";
        String pass = "03182005Elola";

        Connection conn = null;
        PreparedStatement pstmt = null;
        PreparedStatement checkStmt = null;
        PreparedStatement orderStmt = null;
        PreparedStatement cartCheckStmt = null;

        try {
            conn = DriverManager.getConnection(url, user, pass);

            // SQL query to check if the item exists in inventory
            String checkSql = "SELECT * FROM inventoryTable WHERE name = ?";
            checkStmt = conn.prepareStatement(checkSql);

            // Replace with the actual methods to get text input from your UI components
            String inventName = productName.getText();

            checkStmt.setString(1, inventName);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                // Retrieve quantity and category from the result set
                int inventPrice = rs.getInt("price");
                int ID = rs.getInt("ID");
                int inventQuantity = Integer.parseInt(productQuantity.getText());
                String inventCategory = rs.getString("category");

                // Check if item is already in the cart
                String cartCheckSql = "SELECT * FROM ordertable WHERE name = ?";
                cartCheckStmt = conn.prepareStatement(cartCheckSql);
                cartCheckStmt.setString(1, inventName);
                ResultSet cartRs = cartCheckStmt.executeQuery();

                if (cartRs.next()) {
                    JOptionPane.showMessageDialog(null, "The item is already in the cart.");
                    display();
                    productName.setText("");
                    productPrice.setText("");
                    productQuantity.setText("");
                } else {
                    // Insert into orderTable
                    String orderSql = "INSERT INTO ordertable (name, price, quantity, category) VALUES (?, ?, ?, ?)";
                    orderStmt = conn.prepareStatement(orderSql);

                    orderStmt.setString(1, inventName);
                    orderStmt.setDouble(2, inventPrice);
                    orderStmt.setInt(3, inventQuantity); // Use the retrieved quantity
                    orderStmt.setString(4, inventCategory); // Use the retrieved category

                    int orderRowsAffected = orderStmt.executeUpdate();
                    if (orderRowsAffected > 0) {
                        // Fetch and display all orders

                        display();
                        productName.setText("");
                        productPrice.setText("");
                        productQuantity.setText("");

                    } else {
                        System.out.println("Failed to insert order. ❌");
                    }
                }
            } else {
                System.out.println("Item does not exist in inventory. Please check the name and price. 🧐");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Clean up resources
            try {
                if (orderStmt != null) orderStmt.close();
                if (cartCheckStmt != null) cartCheckStmt.close();
                if (checkStmt != null) checkStmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddorderActionPerformed

    private void productQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productQuantityActionPerformed

    private void productPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productPriceActionPerformed

    private void productListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productListMouseClicked
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://localhost:3306/marjodb";
        String user = "root";
        String pass = "03182005Elola";

        try {
            // Establish the connection to the database
            conn = DriverManager.getConnection(url, user, pass);

            // SQL query to fetch data from inventoryTable using PreparedStatement
            String sql = "SELECT * FROM inventoryTable";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // Create a DefaultTableModel to hold the data
            DefaultTableModel tblModel = new DefaultTableModel(new String[]{"ID", "Name", "Price", "Quantity", "Category"}, 0);
            productList.setModel(tblModel);

            // Check if ResultSet is empty
            if (!rs.isBeforeFirst()) {
                System.out.println("No data found.");
            } else {
                // Iterate through the ResultSet and add rows to the table model
                while (rs.next()) {
                    int ID = rs.getInt("ID");
                    String inventName = rs.getString("name");
                    int inventPrice = rs.getInt("price");
                    int inventQuantity = rs.getInt("quantity");
                    String inventCategory = rs.getString("category");

                    String price = "₱ "+inventPrice;

                    // Add data to the table model
                    tblModel.addRow(new Object[]{ID, inventName, price, inventQuantity, inventCategory});
                }
            }

            // Add a ListSelectionListener to respond to row selection
            productList.getSelectionModel().addListSelectionListener(e -> {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = productList.getSelectedRow();
                    // Check if the selected row is within the valid range
                    if (selectedRow >= 0) {
                        if (tblModel.getColumnCount() >= 5) { // Ensure there are enough columns
                            //                    String selectedID = tblModel.getValueAt(selectedRow, 0).toString();
                            String selectedName = tblModel.getValueAt(selectedRow, 1).toString();
                            String selectedPrice = tblModel.getValueAt(selectedRow, 2).toString();
                            //                    String selectedQuantity = tblModel.getValueAt(selectedRow, 3).toString();
                            //                    String selectedCategory = tblModel.getValueAt(selectedRow, 4).toString();

                            // Populate JTextFields with the selected row's data

                            productName.setText(selectedName);
                            productPrice.setText(selectedPrice);

                        }
                    }
                }
            });

        } catch (SQLException e) {
            // Handle any SQL exceptions
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Ensure resources are closed properly
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                // Handle close exceptions if necessary
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage(), "Resource Closing Error", JOptionPane.ERROR_MESSAGE);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_productListMouseClicked

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
calculateChange(txtFieldCash, totalPane, txtFieldChange);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void deleteAll(){
        String url = "jdbc:mysql://localhost:3306/marjodb";
String user = "root";
String pass = "03182005Elola";

Connection conn = null;
PreparedStatement deleteStmt = null;

try {
    conn = DriverManager.getConnection(url, user, pass);
    
    // SQL statement to delete all records from the ordertable
    String deleteSql = "DELETE FROM ordertable";
    deleteStmt = conn.prepareStatement(deleteSql);
    
    // Execute the delete statement
    int rowsAffected = deleteStmt.executeUpdate();
    System.out.println(rowsAffected + " rows deleted."); // Optional: for logging

    // Optionally clear all rows from the JTable model
    ((DefaultTableModel) cartTable.getModel()).setRowCount(0);
    
    display(); // Your method to reflect the changes
    
} catch (SQLException e) {
    e.printStackTrace();
} finally {
    // Clean up resources
    try {
        if (deleteStmt != null) deleteStmt.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    }
    // Method to transfer data from cartTable and orderTable to transferTable
    public void transferData() {
Connection conn = null;
PreparedStatement pstmt = null;
PreparedStatement insertPstmt = null;
ResultSet rs = null;

String url = "jdbc:mysql://localhost:3306/marjodb";
String user = "root";
String pass = "03182005Elola";

try {
    // Establish the connection to the database
    conn = DriverManager.getConnection(url, user, pass);

    // SQL query to fetch data from orderTable including quantity
    String sql = "SELECT name, category, ID, quantity FROM orderTable";
    pstmt = conn.prepareStatement(sql);
    rs = pstmt.executeQuery();

    // Prepare the insert statement for transferredTable
    String insertSql = "INSERT INTO transferredTable (name, category) VALUES (?, ?)";
    insertPstmt = conn.prepareStatement(insertSql);

    // Iterate through the ResultSet for orderTable
    while (rs.next()) {
        String itemName = rs.getString("name");
        String category = rs.getString("category");
        int quantity = rs.getInt("quantity"); // Get the quantity for this item

        // Insert the item into the transferredTable as many times as its quantity
        for (int i = 0; i < quantity; i++) {
            insertPstmt.setString(1, itemName);
            insertPstmt.setString(2, category);

            // Execute insert
            insertPstmt.executeUpdate();
        }
    }

} catch (SQLException e) {
    e.printStackTrace();
} finally {
    // Close resources
    try {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
        if (insertPstmt != null) insertPstmt.close();
        if (conn != null) conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void display() {
        
Connection conn = null;
PreparedStatement pstmt = null;
PreparedStatement updatePstmt = null;
ResultSet rs = null;

String url = "jdbc:mysql://localhost:3306/marjodb";
String user = "root";
String pass = "03182005Elola";

try {
    // Establish the connection to the database
    conn = DriverManager.getConnection(url, user, pass);

    // SQL query to fetch data from inventoryTable using PreparedStatement
    String sql = "SELECT * FROM orderTable";
    pstmt = conn.prepareStatement(sql);
    rs = pstmt.executeQuery();

    // Create a DefaultTableModel to hold the data
    DefaultTableModel tblModel = new DefaultTableModel(new String[]{"ID", "Name", "Price", "Quantity", "Sub-Total"}, 0);
    cartTable.setModel(tblModel);

    // Store existing IDs
    List<Integer> existingIds = new ArrayList<>();
    
    int totalSum= 0;

    // Iterate through the ResultSet and add rows to the list and table model
    while (rs.next()) {
        int ID = rs.getInt("ID");
        String inventName = rs.getString("name");
        int inventprice = rs.getInt("price");
        int inventQuantity = rs.getInt("quantity");
        int inventsubtotal = inventprice * inventQuantity;

        // Add ID to the existing ID list
        existingIds.add(ID);
        
        String inventPrice = "₱ " + inventprice;
        String inventSubtotal = "₱ " + inventsubtotal;
        
                
        // Add data to the table model
        
        tblModel.addRow(new Object[]{ID, inventName, inventPrice, inventQuantity, inventSubtotal});
    }
    
    for (int i = 0; i < tblModel.getRowCount(); i++) {
    // Extract the subtotal from the last column (index 4)
    String subtotalString = (String) tblModel.getValueAt(i, 4); // "₱ XXX"
    // Remove the "₱ " and convert to an integer
    int inventsubtotal = Integer.parseInt(subtotalString.replace("₱ ", ""));
    
    // Add to totalSum (keep the totalSum variable outside of the loop)
    totalSum += inventsubtotal;
}

// Set the totalSum in totalPane after the loop completes
totalPane.setText("₱ " + totalSum);
    

    // Adjust IDs to fill in any gaps and create updates
    for (int i = 0; i < existingIds.size(); i++) {
        int newId = i + 1;
        if (newId != existingIds.get(i)) {
            // We found a missing ID, update the database
            int oldId = existingIds.get(i);
            updatePstmt = conn.prepareStatement("UPDATE orderTable SET ID = ? WHERE ID = ?");
            updatePstmt.setInt(1, newId);
            updatePstmt.setInt(2, oldId);
            updatePstmt.executeUpdate();
            
            // Update the existing ID list and the table model
            existingIds.set(i, newId);
            tblModel.setValueAt(newId, i, 0);  // Update ID in model
        }
    }

    // Optionally, if you wanted to commit changes, you can set the connection to auto-commit false
    // conn.setAutoCommit(false);
    // conn.commit(); // Commit any changes if necessary

} catch (SQLException e) {
    // Handle any SQL exceptions
    JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
} finally {
    // Ensure resources are closed properly
    try {
        if (rs != null) rs.close();
        if (updatePstmt != null) updatePstmt.close(); // Close the update PreparedStatement
        if (pstmt != null) pstmt.close(); // Close the select PreparedStatement
        if (conn != null) conn.close();
    } catch (SQLException e) {
        // Handle close exceptions if necessary
        JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage(), "Resource Closing Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    
    
    }
        
    

    
    
    
    
    private double getCashInput(javax.swing.JTextField txtFieldCash) throws IllegalArgumentException {
    String input = txtFieldCash.getText().trim(); // Get and trim the text from txtFieldCash

    if (input.isEmpty()) {
        throw new IllegalArgumentException("Cash input cannot be empty.");
    }

    try {
        return Double.parseDouble(input); // Convert to a double
    } catch (NumberFormatException e) {
        throw new IllegalArgumentException("Invalid cash amount. Please enter a valid number.");
    }
}

private void calculateChange(JTextField txtFieldCash, JTextPane totalPane, JTextField txtFieldChange) {
    try {
        double cash = getCashInput(txtFieldCash);

        String totalText = totalPane.getText().replace("₱ ", "").trim();
        if (totalText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Total amount is missing or invalid.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        double total = Double.parseDouble(totalText);

        System.out.println("Cash: " + cash);  
        System.out.println("Total: " + total);

        double change = cash - total;

        System.out.println("Change: " + change);
        if (change < 0) {
            JOptionPane.showMessageDialog(null, "Insufficient cash! Please enter a higher amount.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        txtFieldChange.setText(String.format("₱ %.2f", change));

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    public void orderRefresh(){
        Connection conn = null;
PreparedStatement pstmt = null;
PreparedStatement updatePstmt = null;
ResultSet rs = null;

String url = "jdbc:mysql://localhost:3306/marjodb";
String user = "root";
String pass = "03182005Elola";

try {
    conn = DriverManager.getConnection(url, user, pass);

    String sql = "SELECT * FROM inventoryTable";
    pstmt = conn.prepareStatement(sql);
    rs = pstmt.executeQuery();
    DefaultTableModel tblModel = new DefaultTableModel(new String[]{"ID", "Name", "Price", "Quantity", "Category"}, 0);
    productList.setModel(tblModel);

    List<Integer> existingIds = new ArrayList<>();


    while (rs.next()) {
        int ID = rs.getInt("ID");
        String inventName = rs.getString("name");
        int inventPrice = rs.getInt("price");
        int inventQuantity = rs.getInt("quantity");
        String inventCategory = rs.getString("category");

        // Add ID to the existing ID list
        existingIds.add(ID);
        
        // Add data to the table model
        
        String stringPrice = "₱ "+ inventPrice ;
        
        tblModel.addRow(new Object[]{ID, inventName, stringPrice, inventQuantity, inventCategory});
    }

    // Adjust IDs to fill in any gaps and create updates
    for (int i = 0; i < existingIds.size(); i++) {
        int newId = i + 1;
        if (newId != existingIds.get(i)) {
            // We found a missing ID, update the database
            int oldId = existingIds.get(i);
            updatePstmt = conn.prepareStatement("UPDATE inventoryTable SET ID = ? WHERE ID = ?");
            updatePstmt.setInt(1, newId);
            updatePstmt.setInt(2, oldId);
            updatePstmt.executeUpdate();
            
            // Update the existing ID list and the table model
            existingIds.set(i, newId);
            tblModel.setValueAt(newId, i, 0);  // Update ID in model
        }
    }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
} finally {
    try {
        if (rs != null) rs.close();
        if (updatePstmt != null) updatePstmt.close(); 
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
      
        JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage(), "Resource Closing Error", JOptionPane.ERROR_MESSAGE);
    }
}
    }
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
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddorder;
    private javax.swing.JButton btncheckout;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable productList;
    private javax.swing.JTextField productName;
    private javax.swing.JTextField productPrice;
    private javax.swing.JTextField productQuantity;
    private javax.swing.JTextPane totalPane;
    private javax.swing.JTextField txtFieldCash;
    private javax.swing.JTextField txtFieldChange;
    // End of variables declaration//GEN-END:variables

   
}
