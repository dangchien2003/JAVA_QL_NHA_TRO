/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.java_qlnt.QLHopDong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mycompany.java_qlnt.helper.Helper;

public class qlhop_dong extends javax.swing.JPanel {

    public qlhop_dong() {
        initComponents();
        showData();
    }

    private static final String DB_URL = "jdbc:sqlserver://localhost;databaseName=JAVA_QL_Nha_Tro;encrypt=true;trustServerCertificate=true";
    private static final String USER = "sa";
    private static final String PASSWORD = "chienkoi123";
    Connection db = null;
    ResultSet rs = null;
    Statement st = null;
    int tableID;
    String maHDString;

    public Connection getConnect() {
        Connection connect = null;

        try {
            connect = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("QLHopDong.qlhop_dong.getConnect()");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connect;
    }

    /*hi*/
    private void showData() {
        try {
            db = getConnect();
            st = db.createStatement();
            rs = st.executeQuery("select * from dbo.ThongTinHopDong");

            DefaultTableModel model = (DefaultTableModel) managerTable.getModel();
            model.setRowCount(0);
            int columnCount = model.getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    row[i] = rs.getObject(i + 1);
                }
                model.addRow(row);
            }
            managerTable.setModel(model);
            rs.close();
            db.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void resetData() {
        maHD.setText("");
        giaPhong.setText("");
        giaDien.setText("");
        giaNuoc.setText("");
        giaVeSinh.setText("");
        giaXe.setText("");
        thoiGianBatDau.setText("");
        thoiGianHieuLuc.setText("");
        fileTxt.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        managerTable = new javax.swing.JTable();
        searchHD = new javax.swing.JButton();
        addHD = new javax.swing.JButton();
        editHD = new javax.swing.JButton();
        deleteHD = new javax.swing.JButton();
        editnewHD = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        maHD = new javax.swing.JTextField();
        giaPhong = new javax.swing.JTextField();
        giaDien = new javax.swing.JTextField();
        giaNuoc = new javax.swing.JTextField();
        giaVeSinh = new javax.swing.JTextField();
        giaXe = new javax.swing.JTextField();
        thoiGianBatDau = new javax.swing.JTextField();
        thoiGianHieuLuc = new javax.swing.JTextField();
        fileTxt = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÍ HỢP ĐỒNG");

        managerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hợp đồng", "Giá phòng", "Giá điện", "Giá nước", "Giá vệ sinh", "Giá xe", "Thời gian bắt đầu", "Thời gian hiệu lực", "File"
            }
        ));
        managerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(managerTable);

        searchHD.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        searchHD.setText("Tìm kiếm ");
        searchHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchHDActionPerformed(evt);
            }
        });

        addHD.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        addHD.setText("Thêm hợp đồng");
        addHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHDActionPerformed(evt);
            }
        });

        editHD.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        editHD.setText("Sửa hợp đồng ");
        editHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editHDActionPerformed(evt);
            }
        });

        deleteHD.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        deleteHD.setText("Xóa hợp đồng");
        deleteHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteHDActionPerformed(evt);
            }
        });

        editnewHD.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        editnewHD.setText("Làm mới");
        editnewHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editnewHDActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã hợp đồng:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Giá phòng:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Giá điện:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Giá nước:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Giá vệ sinh:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Giá xe:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Thời gian bắt đầu:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Thời gian hiệu lực:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("File:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Danh Sách Hợp Đồng");

        maHD.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        giaPhong.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        giaDien.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        giaNuoc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        giaVeSinh.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        giaXe.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        thoiGianBatDau.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        thoiGianHieuLuc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        fileTxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addHD)
                            .addComponent(editHD))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editnewHD)
                            .addComponent(deleteHD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maHD, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchHD)
                                .addGap(193, 193, 193)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(giaPhong)
                    .addComponent(giaDien)
                    .addComponent(giaNuoc)
                    .addComponent(giaVeSinh, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(thoiGianBatDau))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(thoiGianHieuLuc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fileTxt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(giaXe, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(548, 548, 548)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchHD)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(maHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(giaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(giaXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(giaDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thoiGianBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteHD)
                    .addComponent(addHD))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(giaNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thoiGianHieuLuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editHD)
                            .addComponent(editnewHD)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(giaVeSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHDActionPerformed
        // TODO add your handling code here:
        if (maHD.getText().isEmpty() || giaPhong.getText().isEmpty() || giaDien.getText().isEmpty() || giaNuoc.getText().isEmpty() || giaVeSinh.getText().isEmpty() || giaXe.getText().isEmpty() || thoiGianBatDau.getText().isEmpty() || thoiGianHieuLuc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing input");
        } else {
            try {
                db = getConnect();
                if (db != null) {
                    String sql = "INSERT INTO dbo.ThongTinHopDong  values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement pst = db.prepareStatement(sql);
                    pst.setString(1, maHD.getText().toString() + "");
                    pst.setInt(2, Integer.valueOf(giaPhong.getText()));
                    pst.setInt(3, Integer.valueOf(giaDien.getText()));
                    pst.setInt(4, Integer.valueOf(giaNuoc.getText()));
                    pst.setInt(5, Integer.valueOf(giaVeSinh.getText()));
                    pst.setInt(6, Integer.valueOf(giaXe.getText()));
                    pst.setString(7, thoiGianBatDau.getText());
                    pst.setInt(8, Integer.valueOf(thoiGianHieuLuc.getText().trim()));
                    pst.setString(9, fileTxt.getText());

//                    pst.setString(9, file.getText());
                    int rowsInserted = pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Added HopDong");
                } else {
                    System.out.println("Failed to connect tho the database!");
                }
                db.close();
                showData();
                resetData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_addHDActionPerformed

    private void editHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editHDActionPerformed
        // TODO add your handling code here:
        if (maHD.getText().isEmpty() || giaPhong.getText().isEmpty() || giaDien.getText().isEmpty() || giaNuoc.getText().isEmpty() || giaVeSinh.getText().isEmpty() || giaXe.getText().isEmpty() || thoiGianBatDau.getText().isEmpty() || thoiGianHieuLuc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing input");
        } else {
            try {
                db = getConnect();
                if (db != null) {
                    String sql = "update dbo.ThongTinHopDong set  giaPhong = ?, giaDien = ?, giaNuoc = ?, giaVeSinh = ?, giaXe = ?, thoiGianBatDau = ?, thoiGianHieuLuc = ?  where maHD = ?";
                    PreparedStatement pst = db.prepareStatement(sql);
                    pst.setString(8, maHDString);
//                    pst.setString(1, maHD.getText().trim());
                    pst.setInt(1, Integer.valueOf(giaPhong.getText().trim()));
                    pst.setInt(2, Integer.valueOf(giaDien.getText().trim()));
                    pst.setInt(3, Integer.valueOf(giaNuoc.getText().trim()));
                    pst.setInt(4, Integer.valueOf(giaVeSinh.getText().trim()));
                    pst.setInt(5, Integer.valueOf(giaXe.getText().trim()));
                    pst.setString(6, thoiGianBatDau.getText().trim());
                    pst.setInt(7, Integer.valueOf(thoiGianHieuLuc.getText().trim()));

//                    pst.setString(9, file.getText().trim());
                    int rowsInserted = pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Update HopDong");
                } else {
                    System.out.println("Failed to connect to the database!");
                }
                db.close();
                showData();
                resetData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_editHDActionPerformed

    private void deleteHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteHDActionPerformed
        // TODO add your handling code here:
        if (maHD.getText().isEmpty() || giaPhong.getText().isEmpty() || giaDien.getText().isEmpty() || giaNuoc.getText().isEmpty() || giaVeSinh.getText().isEmpty() || giaXe.getText().isEmpty() || thoiGianBatDau.getText().isEmpty() || thoiGianHieuLuc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing input");
        } else {
            try {
                db = getConnect();
                if (db != null) {
                    String sql = "Delete from dbo.ThongTinHopDong where maHD = ?";
                    PreparedStatement pst = db.prepareStatement(sql);
                    pst.setString(1, maHDString);
                    int rowsInserted = pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Delete HopDong");
                } else {
                    System.out.println("Failed to connectto the database!");
                }
                db.close();
                showData();
                resetData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_deleteHDActionPerformed

    private void editnewHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editnewHDActionPerformed
        // TODO add your handling code here:
        showData();
        resetData();
    }//GEN-LAST:event_editnewHDActionPerformed

    private void managerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managerTableMouseClicked
        DefaultTableModel modal = (DefaultTableModel) managerTable.getModel();
        int myIndex = managerTable.getSelectedRow();
        tableID = managerTable.rowAtPoint(evt.getPoint());
        maHDString = modal.getValueAt(myIndex, 0).toString();
        maHD.setText(modal.getValueAt(myIndex, 0).toString());
        giaPhong.setText(modal.getValueAt(myIndex, 1).toString());
        giaDien.setText(modal.getValueAt(myIndex, 2).toString());
        giaNuoc.setText(modal.getValueAt(myIndex, 3).toString());
        giaVeSinh.setText(modal.getValueAt(myIndex, 4).toString());
        giaXe.setText(modal.getValueAt(myIndex, 5).toString());
        thoiGianBatDau.setText(modal.getValueAt(myIndex, 6).toString());
        thoiGianHieuLuc.setText(modal.getValueAt(myIndex, 7).toString());
        fileTxt.setText(modal.getValueAt(myIndex, 8).toString());
    }//GEN-LAST:event_managerTableMouseClicked

    private void searchHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchHDActionPerformed
      
     if (maHD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing input");
        } else {
             try {
            db = getConnect();
            st = db.createStatement();
            rs = st.executeQuery("select * from dbo.ThongTinHopDong where  maHD like '%"+maHD.getText().trim() +"%'" );

            DefaultTableModel model = (DefaultTableModel) managerTable.getModel();
            model.setRowCount(0);
            int columnCount = model.getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    row[i] = rs.getObject(i + 1);
                }
                model.addRow(row);
            }
            managerTable.setModel(model);
            rs.close();
            db.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_searchHDActionPerformed



    private void managerTableMouseClicked() {
        DefaultTableModel modal = (DefaultTableModel) managerTable.getModel();
        int myIndex = managerTable.getSelectedRow();
        tableID = Integer.valueOf(modal.getValueAt(myIndex, 0).toString());
        System.out.println("com.mycompany.java_qlnt.QLHopDong.qlhop_dong.managerTableMouseClicked() ::" + tableID);
        maHD.setText(modal.getValueAt(myIndex, 1).toString());
        giaPhong.setText(modal.getValueAt(myIndex, 2).toString());
        giaDien.setText(modal.getValueAt(myIndex, 3).toString());
        giaNuoc.setText(modal.getValueAt(myIndex, 4).toString());
        giaVeSinh.setText(modal.getValueAt(myIndex, 5).toString());
        giaXe.setText(modal.getValueAt(myIndex, 6).toString());
        thoiGianBatDau.setText(modal.getValueAt(myIndex, 7).toString());
        thoiGianHieuLuc.setText(modal.getValueAt(myIndex, 8).toString());
        fileTxt.setText(modal.getValueAt(myIndex, 9).toString());
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qlhop_dong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHD;
    private javax.swing.JButton deleteHD;
    private javax.swing.JButton editHD;
    private javax.swing.JButton editnewHD;
    private javax.swing.JTextField fileTxt;
    private javax.swing.JTextField giaDien;
    private javax.swing.JTextField giaNuoc;
    private javax.swing.JTextField giaPhong;
    private javax.swing.JTextField giaVeSinh;
    private javax.swing.JTextField giaXe;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maHD;
    private javax.swing.JTable managerTable;
    private javax.swing.JButton searchHD;
    private javax.swing.JTextField thoiGianBatDau;
    private javax.swing.JTextField thoiGianHieuLuc;
    // End of variables declaration//GEN-END:variables
}
