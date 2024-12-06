/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package oop_dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Inventory extends javax.swing.JFrame {

    /**
     * Creates new form manageProduct
     */
    public Inventory() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        inventoryName = new javax.swing.JTextField();
        inventoryQuantity = new javax.swing.JTextField();
        inventoryPrice = new javax.swing.JTextField();
        inventoryCategory = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        inventoryID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        inventoryTable.setBackground(new java.awt.Color(51, 51, 51));
        inventoryTable.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        inventoryTable.setForeground(new java.awt.Color(255, 255, 255));
        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inventoryTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(inventoryTable);

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("FOOD STOCK");

        jLabel2.setFont(new java.awt.Font("Montserrat Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME:");

        jLabel3.setFont(new java.awt.Font("Montserrat Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("QUANTITY:");

        jLabel4.setFont(new java.awt.Font("Montserrat Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRICE:");

        jLabel5.setFont(new java.awt.Font("Montserrat Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CATEGORY:");

        btnsave.setBackground(new java.awt.Color(0, 0, 0));
        btnsave.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnclose.setBackground(new java.awt.Color(0, 0, 0));
        btnclose.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(0, 0, 0));
        btnupdate.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(0, 0, 0));
        btndelete.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("HOME");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnrefresh.setBackground(new java.awt.Color(0, 0, 0));
        btnrefresh.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnrefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnrefresh.setText("REFRESH");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnrefresh)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inventoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventoryQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventoryPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventoryCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnclose))
                    .addComponent(inventoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnclose, btndelete, btnsave, btnupdate});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(inventoryID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(inventoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(inventoryQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(inventoryPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(inventoryCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsave)
                            .addComponent(btnupdate)
                            .addComponent(btnclose)
                            .addComponent(btndelete)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnrefresh)
                .addGap(75, 75, 75))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1410, 800));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isabella\\Documents\\NetbeansProjects\\jnfvdkj\\login_.png")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 840));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
new home().setVisible(true);
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
int response = JOptionPane.showConfirmDialog(null, 
                "Do you want to proceed?", 
                "Confirm", 
                JOptionPane.YES_NO_OPTION);

        // Handle the user's response
        if (response == JOptionPane.YES_OPTION) {
            dispose();
        } else{
            
        }
 // TODO add your handling code here:
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
String url = "jdbc:mysql://localhost:3306/marjodb";
String user = "root";
String pass = "03182005Elola";

String inventName = inventoryName.getText();
String inventPriceText = inventoryPrice.getText();
String inventQuantityText = inventoryQuantity.getText();
String inventCategory = inventoryCategory.getText();

// Check if any required fields are empty
if (inventName.isEmpty() || inventPriceText.isEmpty() ||
    inventQuantityText.isEmpty() || inventCategory.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please fill in all fields before adding an item.");
    return; // Exit the method if any field is empty
}

// Parse the price and quantity only if the fields are not empty
inventPriceText = inventPriceText.replaceAll("[^\\d]", "");
int inventPrice = Integer.parseInt(inventPriceText);
int inventQuantity;
try {
    inventPrice = Integer.parseInt(inventPriceText);
    
    inventPriceText = inventPriceText.replaceAll("[^\\d]", "");
    
    inventQuantity = Integer.parseInt(inventQuantityText);
    
    
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Please enter valid numbers for price and quantity.");
    return; // Exit the method if parsing fails
}

Connection conn = null;
PreparedStatement pstmt = null;
PreparedStatement checkStmt = null;

try {
    // Establish the connection to the database
    conn = DriverManager.getConnection(url, user, pass);
    
    // SQL query to check if the item exists
    String checkSql = "SELECT COUNT(*) FROM inventoryTable WHERE name = ?";
    checkStmt = conn.prepareStatement(checkSql);
    checkStmt.setString(1, inventName);
    ResultSet rs = checkStmt.executeQuery();

    if (rs.next() && rs.getInt(1) > 0) {
        // Item already exists
        JOptionPane.showMessageDialog(null, "An item is already exists.");
        return;
    }

    // SQL query to insert data into inventoryTable
    String sql = "INSERT INTO inventoryTable (name, price, quantity, category) VALUES (?, ?, ?, ?)";
    pstmt = conn.prepareStatement(sql);
    
    // Set the values for the prepared statement
    pstmt.setString(1, inventName);
    pstmt.setInt(2, inventPrice);
    pstmt.setInt(3, inventQuantity);
    pstmt.setString(4, inventCategory);

    // Execute the insert statement
    int rowsAffected = pstmt.executeUpdate();
    if (rowsAffected > 0) {
        
        JOptionPane.showMessageDialog(null, "Item added successfully!");

        inventoryID.setText("");
        inventoryName.setText("");
        inventoryQuantity.setText("");
        inventoryPrice.setText("");
        inventoryCategory.setText("");
        
    } else {
        JOptionPane.showMessageDialog(null, "Failed to add item.");
    }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
} finally {
    // Clean up JDBC resources
    try {
        if (pstmt != null) pstmt.close();
        if (checkStmt != null) checkStmt.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        // Handle cleanup exceptions if necessary
    }
}
// TODO add your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
String url = "jdbc:mysql://localhost:3306/marjodb";
String user = "root";
String pass = "03182005Elola";
String idString = inventoryID.getText(); 
int id = Integer.parseInt(idString); 

Connection conn = null;
PreparedStatement pstmt = null;

try {
    conn = DriverManager.getConnection(url, user, pass);

    String sql = "DELETE FROM inventoryTable WHERE id = ?";
    pstmt = conn.prepareStatement(sql);
    pstmt.setInt(1, id); 

    int rowsAffected = pstmt.executeUpdate();
    if (rowsAffected > 0) {
        
        JOptionPane.showMessageDialog(null, "Item deleted successfully!");

        inventoryID.setText("");
        inventoryName.setText("");
        inventoryQuantity.setText("");
        inventoryPrice.setText("");
        inventoryCategory.setText("");
        
    } else {
        JOptionPane.showMessageDialog(null, "No item found with that ID.");
    }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Please enter a valid ID.");
} finally {
    try {
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
    }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void inventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryTableMouseClicked
Connection conn = null;
PreparedStatement pstmt = null;
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
    inventoryTable.setModel(tblModel);


    if (!rs.isBeforeFirst()) {
        System.out.println("No data found.");
    } else {
       
        while (rs.next()) {
            int ID = rs.getInt("ID");
            String inventName = rs.getString("name");
            int inventPrice = rs.getInt("price");
            int inventQuantity = rs.getInt("quantity");
            String inventCategory = rs.getString("category");
            
            String price = "₱ "+ inventPrice;
            tblModel.addRow(new Object[]{ID, inventName, price, inventQuantity, inventCategory});
        }
    }

    // Add a ListSelectionListener to respond to row selection
    inventoryTable.getSelectionModel().addListSelectionListener(e -> {
        // Check if the selection is adjusting to avoid multiple events
        if (!e.getValueIsAdjusting()) {
            int selectedRow = inventoryTable.getSelectedRow();
           
            if (selectedRow >= 0) {
                if (tblModel.getColumnCount() >= 5) {
                    String id = tblModel.getValueAt(selectedRow, 0).toString();
                    String name = tblModel.getValueAt(selectedRow, 1).toString();
                    String price = tblModel.getValueAt(selectedRow, 2).toString();
                    String quantity = tblModel.getValueAt(selectedRow, 3).toString();
                    String category = tblModel.getValueAt(selectedRow, 4).toString();

                    
                    inventoryID.setText(id);
                    inventoryName.setText(name);
                    inventoryPrice.setText(price);
                    inventoryQuantity.setText(quantity);
                    inventoryCategory.setText(category);

                  
                    refresh();
                }
            }
        }
    });

} catch (SQLException e) {
 
    JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
} finally {
    try {
        if (rs != null) rs.close();
        if (pstmt != null) pstmt.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage(), "Resource Closing Error", JOptionPane.ERROR_MESSAGE);
    }
}
          // TODO add your handling code here:
    }//GEN-LAST:event_inventoryTableMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

String url = "jdbc:mysql://localhost:3306/marjodb";
String user = "root";
String pass = "03182005Elola";

String idString = inventoryID.getText(); 
int id = Integer.parseInt(idString); 

String newName = inventoryName.getText(); 
String newPriceStr = inventoryPrice.getText(); 
int newQuantity = Integer.parseInt(inventoryQuantity.getText()); 
String newCategory = inventoryCategory.getText();

Connection conn = null;
PreparedStatement pstmt = null;
PreparedStatement checkPstmt = null;

try {
    // Establish the connection to the database
    conn = DriverManager.getConnection(url, user, pass);
    String checkSql = "SELECT COUNT(*) FROM inventoryTable WHERE name = ? AND id <> ?";
    checkPstmt = conn.prepareStatement(checkSql);
    checkPstmt.setString(1, newName);
    checkPstmt.setInt(2, id); 

    ResultSet rs = checkPstmt.executeQuery();
    rs.next();
    int nameCount = rs.getInt(1);
    
    if (nameCount > 0) {
        // If the name already exists, show a message
        JOptionPane.showMessageDialog(null, "The name is already existed.");
        return; // Exit the method
    }
    String sql = "UPDATE inventoryTable SET name = ?, price = ?, quantity = ?, category = ? WHERE id = ?";
    pstmt = conn.prepareStatement(sql);
    
    String cleanPriceStr = newPriceStr.replaceAll("[^\\d.]", "");
    double newPrice = Double.parseDouble(cleanPriceStr);
    
    pstmt.setString(1, newName); 
    pstmt.setDouble(2, newPrice);
    pstmt.setInt(3, newQuantity);
    pstmt.setString(4, newCategory); 
    pstmt.setInt(5, id); 
    int rowsAffected = pstmt.executeUpdate();
    if (rowsAffected > 0) {

        JOptionPane.showMessageDialog(null, "Item updated successfully!");
        
        inventoryID.setText("");
        inventoryName.setText("");
        inventoryQuantity.setText("");
        inventoryPrice.setText("");
        inventoryCategory.setText("");
        
    } else {
        JOptionPane.showMessageDialog(null, "No item found with that ID.");
    }

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage());
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "Please enter valid values.");
} finally {
    // Clean up JDBC resources
    try {
        if (pstmt != null) pstmt.close();
        if (checkPstmt != null) checkPstmt.close();
        if (conn != null) conn.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
    }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void inventoryTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryTableMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoryTableMousePressed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
refresh();    }//GEN-LAST:event_btnrefreshActionPerformed

    
    public void refresh(){
// Your existing code...
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
    inventoryTable.setModel(tblModel);

    List<Integer> existingIds = new ArrayList<>();

    while (rs.next()) {
        int ID = rs.getInt("ID");
        String inventName = rs.getString("name");
        int inventPrice = rs.getInt("price");
        int inventQuantity = rs.getInt("quantity");
        String inventCategory = rs.getString("category");
        
        
        String stringPrice = "₱ "+inventPrice;

        // Add ID to the existing ID list
        existingIds.add(ID);
        
        tblModel.addRow(new Object[]{ID, inventName, stringPrice, inventQuantity, inventCategory});
    }
    for (int i = 0; i < existingIds.size(); i++) {
        int newId = i + 1;
        if (newId != existingIds.get(i)) {
            // We found a missing ID, update the database
            int oldId = existingIds.get(i);
            updatePstmt = conn.prepareStatement("UPDATE inventoryTable SET ID = ? WHERE ID = ?");
            updatePstmt.setInt(1, newId);
            updatePstmt.setInt(2, oldId);
            updatePstmt.executeUpdate();
            existingIds.set(i, newId);
            tblModel.setValueAt(newId, i, 0); 
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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inventory().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTextField inventoryCategory;
    private javax.swing.JTextField inventoryID;
    private javax.swing.JTextField inventoryName;
    private javax.swing.JTextField inventoryPrice;
    private javax.swing.JTextField inventoryQuantity;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}