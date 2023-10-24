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

public class qlhopdong extends javax.swing.JFrame {

    
    public qlhopdong() {
        initComponents();
        showData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        thoiGianBatDau = new javax.swing.JTextField();
        thoiGianHieuLuc = new javax.swing.JTextField();
        file = new javax.swing.JTextField();
        javax.swing.JButton searchnt_qlhd = new javax.swing.JButton();
        javax.swing.JButton addnt_qlhd = new javax.swing.JButton();
        javax.swing.JButton editnt_qlhd = new javax.swing.JButton();
        javax.swing.JButton deletent_qlhd = new javax.swing.JButton();
        giaDien = new javax.swing.JTextField();
        giaNuoc = new javax.swing.JTextField();
        giaVeSinh = new javax.swing.JTextField();
        giaXe = new javax.swing.JTextField();
        java.awt.Label label6 = new java.awt.Label();
        java.awt.Label label2 = new java.awt.Label();
        java.awt.Label label7 = new java.awt.Label();
        java.awt.Label label8 = new java.awt.Label();
        java.awt.Label label9 = new java.awt.Label();
        java.awt.Label label10 = new java.awt.Label();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        managerTable = new javax.swing.JTable();
        java.awt.Label label1 = new java.awt.Label();
        java.awt.Label label4 = new java.awt.Label();
        java.awt.Label label5 = new java.awt.Label();
        maHD = new javax.swing.JTextField();
        giaPhong = new javax.swing.JTextField();
        java.awt.Label label11 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        thoiGianHieuLuc.setMaximumSize(new java.awt.Dimension(7483647, 7483647));

        searchnt_qlhd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchnt_qlhd.setText("Tìm kiếm");
        searchnt_qlhd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchnt_qlhdActionPerformed(evt);
            }
        });

        addnt_qlhd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addnt_qlhd.setText("Thêm hợp đồng");
        addnt_qlhd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnt_qlhdActionPerformed(evt);
            }
        });

        editnt_qlhd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        editnt_qlhd.setText("Sửa hợp đồng");
        editnt_qlhd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editnt_qlhdActionPerformed(evt);
            }
        });

        deletent_qlhd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deletent_qlhd.setText("Xóa hợp đồng");
        deletent_qlhd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletent_qlhdActionPerformed(evt);
            }
        });

        giaDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaDienActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label6.setText("Giá nước:");

        label2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label2.setText("Mã HĐ:");

        label7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label7.setText("Giá  vệ sinh:");

        label8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label8.setText("Thời gian bắt đầu:");

        label9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label9.setText("Giá xe:");

        label10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label10.setText("File:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÍ  HỢP ĐỒNG");

        managerTable.setBackground(new java.awt.Color(242, 242, 242));
        managerTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        managerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã hợp đồng", "Giá phòng", "Giá điện", "Giá nước", "Giá vệ sinh", "Giá xe", "Thời gian bắt đầu", "Thời gian hiệu lực", "File"
            }
        ));
        managerTable.setMaximumSize(new java.awt.Dimension(3676, 3676));
        jScrollPane2.setViewportView(managerTable);

        label1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        label1.setText("DANH SÁCH HỢP ĐỒNG");

        label4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label4.setText("Giá phòng:");

        label5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label5.setText("Giá điện:");

        label11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label11.setText("Thời gian hiệu lực:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addnt_qlhd)
                            .addComponent(editnt_qlhd)
                            .addComponent(deletent_qlhd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchnt_qlhd)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maHD, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(giaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(giaNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(giaDien, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(giaVeSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(giaXe, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(thoiGianHieuLuc, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(thoiGianBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 81, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(giaXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(giaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(searchnt_qlhd)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addnt_qlhd))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(editnt_qlhd))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(thoiGianHieuLuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(thoiGianBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(giaDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(giaNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(deletent_qlhd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(giaVeSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giaDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaDienActionPerformed

    }//GEN-LAST:event_giaDienActionPerformed

    private static final String DB_URL = "jdbc:sqlserver://localhost;databaseName=JAVA_QL_NHA_TRO;encrypt=true;trustServerCertificate=true";
    private static final String USER = "sa";
    private static final String PASSWORD = "nguyen0412";
    Connection db = null;

    ResultSet rs = null;
    Statement st = null;
    int tableID;

    public Connection getConnect() {
        Connection connect = null;

        try {
            connect = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("nt_qlhd.tong.getConnect()");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connect;

    }
    
    private void showData() {
        try {
            db = getConnect();
            st = db.createStatement();
            rs = st.executeQuery("select * from dbo.ThongTinHopDong");
//             Lấy thông tin về metadata (tên các cột)
            DefaultTableModel model = new DefaultTableModel();

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Thêm tên các cột vào model
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                model.addColumn(metaData.getColumnLabel(columnIndex));
            }
            // Thêm dữ liệu từ ResultSet vào model
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    row[i] = rs.getObject(i + 1);
                }
                model.addRow(row);
            }
            managerTable.setModel(model);

            // Đóng kết nối và tài nguyên
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
        file.setText("");
    }
    
    private void searchnt_qlhdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchnt_qlhdActionPerformed
        if (maHD.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing input");

        } else {
            try {
                db = getConnect();
                st = db.createStatement();
                String sql = "select * from dbo.ThongTinHoaDon where maHD = "+Integer.valueOf(maHD.getText());

                rs = st.executeQuery(sql);
                DefaultTableModel model = new DefaultTableModel();

                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();

                // Thêm tên các cột vào model
                for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                    model.addColumn(metaData.getColumnLabel(columnIndex));
                }
                // Thêm dữ liệu từ ResultSet vào model
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 0; i < columnCount; i++) {
                        row[i] = rs.getObject(i + 1);
                    }
                    model.addRow(row);
                }
                managerTable.setModel(model);

                // Đóng kết nối và tài nguyên
                rs.close();
                db.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_searchnt_qlhdActionPerformed

    private void addnt_qlhdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnt_qlhdActionPerformed
        if (maHD.getText().isEmpty() || giaPhong.getText().isEmpty() || giaDien.getText().isEmpty() || giaNuoc.getText().isEmpty() || giaVeSinh.getText().isEmpty() || giaXe.getText().isEmpty() || thoiGianBatDau.getText().isEmpty() || thoiGianHieuLuc.getText().isEmpty() || file.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing input");

        } else {
            try {
                db = getConnect();
                if (db != null) {
                    String sql = "INSERT INTO dbo.ThongTinHopDong (maHD, giaPhong, giaDien, giaNuoc, giaVeSinh, giaXe, thoiGianBatDau, thoiGianHieuLuc, file) VALUES (?,?,?,?,?,?,?,?,?)";

                    PreparedStatement pst = db.prepareStatement(sql);
                    pst.setString(1, maHD.getText());
                    pst.setInt(2, Integer.valueOf(giaPhong.getText()));
                    pst.setInt(3, Integer.valueOf(giaDien.getText()));
                    pst.setInt(4, Integer.valueOf(giaNuoc.getText()));
                    pst.setInt(5, Integer.valueOf(giaVeSinh.getText()));
                    pst.setInt(6, Integer.valueOf(giaXe.getText()));
                    pst.setInt(7, Integer.valueOf(thoiGianBatDau.getText()));
                    pst.setInt(8, Integer.valueOf(thoiGianHieuLuc.getText()));
                    pst.setInt(9, Integer.valueOf(file.getText()));
                    int rowsInserted = pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Added HopDong");
                } else {
                    System.out.println("Failed to connect to the database.");

                }
                db.close();
                showData();
                resetData();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_addnt_qlhdActionPerformed

    private void editnt_qlhdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editnt_qlhdActionPerformed
        if (maHD.getText().isEmpty() || giaPhong.getText().isEmpty() || giaDien.getText().isEmpty() || giaNuoc.getText().isEmpty() || giaVeSinh.getText().isEmpty() || giaXe.getText().isEmpty() || thoiGianBatDau.getText().isEmpty() || thoiGianHieuLuc.getText().isEmpty() || file.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing input");
        } 
        else {
            try {
                db = getConnect();
                if (db != null) {
                    String sql = "update  dbo.ThongTinHoaDon set maHD = ?,giaPhong = ?,giaDien = ?,giaNuoc = ?, giaVeSinh = ?,giaXe = ?,thoiGianBatDau = ?,thoiGianHieuLuc = ?,file = ? Where maHD = ? ";
                    
                    PreparedStatement pst = db.prepareStatement(sql);
                    pst.setInt(10, tableID);
                    pst.setInt(1, Integer.valueOf(maHD.getText().trim()));
                    pst.setInt(2, Integer.valueOf(giaPhong.getText().trim()));
                    pst.setInt(3, Integer.valueOf(giaDien.getText().trim()));
                    pst.setInt(4, Integer.valueOf(giaNuoc.getText().trim()));
                    pst.setInt(5, Integer.valueOf(giaVeSinh.getText().trim()));
                    pst.setInt(6, Integer.valueOf(giaXe.getText().trim()));
                    pst.setInt(7, Integer.valueOf(thoiGianBatDau.getText().trim()));
                    pst.setString(8, thoiGianHieuLuc.getText().trim());
                    pst.setInt(9, Integer.valueOf(file.getText().trim()));
                    System.out.println("sql"+sql);
                    int rowsInserted = pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Updated HopDong");
                } else {
                    System.out.println("Failed to connect to the database.");

                }
                db.close();
                showData();
                resetData();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);

            }
        }
    }//GEN-LAST:event_editnt_qlhdActionPerformed

    private void deletent_qlhdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletent_qlhdActionPerformed

        if (maHD.getText().isEmpty() || giaPhong.getText().isEmpty() || giaDien.getText().isEmpty() || giaNuoc.getText().isEmpty() || giaVeSinh.getText().isEmpty() || giaXe.getText().isEmpty() || thoiGianBatDau.getText().isEmpty() || thoiGianHieuLuc.getText().isEmpty() || file.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing input");

        } else {
            try {
                db = getConnect();
                if (db != null) {
                    String sql = "Delete from dbo.ThongTinHoaDon where maHD = ?";

                    PreparedStatement pst = db.prepareStatement(sql);
                    pst.setInt(1, tableID);

                    int rowsInserted = pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Delete HopDong");
                } else {
                    System.out.println("Failed to connect to the database.");

                }
                db.close();
                showData();
                resetData();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);

            }
        }
    }//GEN-LAST:event_deletent_qlhdActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void managerTableMouseClicked() {                                          
        DefaultTableModel modal = (DefaultTableModel) managerTable.getModel();
        int myIndex = managerTable.getSelectedRow();
        tableID = Integer.parseInt(modal.getValueAt(myIndex, 0).toString());
        maHD.setText(modal.getValueAt(myIndex, 1).toString());
        giaPhong.setText(modal.getValueAt(myIndex, 2).toString());
        giaDien.setText(modal.getValueAt(myIndex, 3).toString());
        giaNuoc.setText(modal.getValueAt(myIndex, 4).toString());
        giaVeSinh.setText(modal.getValueAt(myIndex, 5).toString());
        giaXe.setText(modal.getValueAt(myIndex,6).toString());
        thoiGianBatDau.setText(modal.getValueAt(myIndex, 7).toString());
        thoiGianHieuLuc.setText(modal.getValueAt(myIndex, 8).toString());
        file.setText(modal.getValueAt(myIndex, 9).toString());
    }  
    
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qlhopdong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField file;
    private javax.swing.JTextField giaDien;
    private javax.swing.JTextField giaNuoc;
    private javax.swing.JTextField giaPhong;
    private javax.swing.JTextField giaVeSinh;
    private javax.swing.JTextField giaXe;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField maHD;
    private javax.swing.JTable managerTable;
    private javax.swing.JTextField thoiGianBatDau;
    private javax.swing.JTextField thoiGianHieuLuc;
    // End of variables declaration//GEN-END:variables
}