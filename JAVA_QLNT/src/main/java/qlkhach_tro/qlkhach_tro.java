/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlkhach_tro;

import com.mycompany.java_qlnt.helper.Helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.ResultSetMetaData;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class qlkhach_tro extends javax.swing.JPanel {

    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=JAVA_QL_NHA_TRO;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "sa";
    private static final String PASSWORD = "chienkoi123";
    Connection db = null;

    ResultSet rs = null;
    Statement st = null;
    int tableID;

    public Connection getConnect() {
        Connection connect = null;

        try {
            connect = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("qlkhach_tro.qlkhach_tro.getConnect()");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connect;

    }

    private void showData() {
        try {
            db = getConnect();
            st = db.createStatement();
            rs = st.executeQuery("select * from dbo.ThongTinNguoiO");
//             Lấy thông tin về metadata (tên các cột)
            DefaultTableModel model = (DefaultTableModel) hien_thi.getModel();

            model.setRowCount(0);
            int columnCount = model.getColumnCount();
            // Thêm dữ liệu từ ResultSet vào model
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    row[i] = rs.getObject(i + 1);
                }
                model.addRow(row);
            }
            hien_thi.setModel(model);

            // Đóng kết nối và tài nguyên
            rs.close();
            db.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void resetData() {

        ma_phong.setText("");
        ho_ten.setText("");
        nam_sinh.setText("");
        sdt.setText("");
        cccd.setText("");
        bien_so_xe.setText("");
        ten_xe.setText("");
        que.setText("");
    }

    /**
     * Creates new form qlkhach_tro
     */
    public qlkhach_tro() {
        initComponents();

        showData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hien_thi = new javax.swing.JTable();
        tim_kiem = new javax.swing.JButton();
        them = new javax.swing.JButton();
        sua = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ma_phong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ho_ten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nam_sinh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sdt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cccd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bien_so_xe = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ten_xe = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        que = new javax.swing.JTextField();
        lam_moi = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ KHÁCH TRỌ");

        hien_thi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Mã phòng", "Họ tên", "Năm sinh", "SDT", "Số CCCD", "Biển số xe", "Tên xe", "Quê quán"
            }
        ));
        hien_thi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hien_thiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hien_thi);

        tim_kiem.setText("Tìm kiếm");
        tim_kiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tim_kiemActionPerformed(evt);
            }
        });

        them.setText("Thêm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        xoa.setText("Xoá");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã phòng");

        jLabel3.setText("Họ tên");

        jLabel4.setText("Năm sinh");

        jLabel5.setText("SDT");

        jLabel6.setText("Số CCCD");

        jLabel7.setText("Biển số xe");

        jLabel8.setText("Tên xe");

        jLabel9.setText("Quê quán");

        que.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queActionPerformed(evt);
            }
        });

        lam_moi.setText("Làm mới");
        lam_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lam_moiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ho_ten, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ma_phong, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nam_sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4)
                        .addComponent(tim_kiem)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                                .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lam_moi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bien_so_xe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cccd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ten_xe, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(que, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ma_phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tim_kiem)
                    .addComponent(jLabel6)
                    .addComponent(cccd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(them)
                    .addComponent(sua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ho_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(bien_so_xe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ten_xe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lam_moi)
                    .addComponent(xoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(que, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nam_sinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void queActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        if (ma_phong.getText().isEmpty() || ho_ten.getText().isEmpty() || nam_sinh.getText().isEmpty() || sdt.getText().isEmpty() || cccd.getText().isEmpty() || bien_so_xe.getText().isEmpty() || ten_xe.getText().isEmpty() || que.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ");
        } else {
            try {
                db = getConnect();
                if (db != null) {
                    String sql = "INSERT INTO dbo.ThongTinNguoiO(maPhong,hoTen,namSinh,sdt,soCCCD,bienSoXe,tenXe,queQuan) VALUES (?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = db.prepareStatement(sql);
//                    pst.setInt(1, Integer.valueOf(id_kt.getText()));

                    pst.setString(1, ma_phong.getText());
                    pst.setString(2, ho_ten.getText());
                    pst.setInt(3, Integer.valueOf(nam_sinh.getText()));
                    pst.setString(4, sdt.getText());
                    pst.setString(5, cccd.getText());
                    pst.setString(6, bien_so_xe.getText());
                    pst.setString(7, ten_xe.getText());
                    pst.setString(8, que.getText());

                    int rowsInserted = pst.executeUpdate();

                }
                db.close();
                showData();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);

            }
        }
    }//GEN-LAST:event_themActionPerformed

    private void hien_thiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hien_thiMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modal = (DefaultTableModel) hien_thi.getModel();
        int myIndex = hien_thi.getSelectedRow();
        tableID = Integer.valueOf(modal.getValueAt(myIndex, 0).toString());
        ma_phong.setText(modal.getValueAt(myIndex, 1).toString());
        ho_ten.setText(modal.getValueAt(myIndex, 2).toString());
        nam_sinh.setText(modal.getValueAt(myIndex, 3).toString());
        sdt.setText(modal.getValueAt(myIndex, 4).toString());
        cccd.setText(modal.getValueAt(myIndex, 5).toString());
        bien_so_xe.setText(modal.getValueAt(myIndex, 6).toString());
        ten_xe.setText(modal.getValueAt(myIndex, 7).toString());
        que.setText(modal.getValueAt(myIndex, 8).toString());
    }//GEN-LAST:event_hien_thiMouseClicked

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
        if (ma_phong.getText().isEmpty() || ho_ten.getText().isEmpty() || nam_sinh.getText().isEmpty() || sdt.getText().isEmpty() || cccd.getText().isEmpty() || bien_so_xe.getText().isEmpty() || ten_xe.getText().isEmpty() || que.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ");
        } else {
            try {
                db = getConnect();
                if (db != null) {
                    String sql = "UPDATE dbo.ThongTinNguoiO SET maPhong = ?, hoTen=?, namSinh=?, sdt=?,soCCCD=?, bienSoXe=?, tenXe=?, queQuan=? where idNO = ?";

                    PreparedStatement pst = db.prepareStatement(sql);
                    pst.setString(1, ma_phong.getText());
                    pst.setString(2, ho_ten.getText());
                    pst.setInt(3, Integer.valueOf(nam_sinh.getText()));
                    pst.setString(4, sdt.getText());
                    pst.setString(5, cccd.getText());
                    pst.setString(6, bien_so_xe.getText());
                    pst.setString(7, ten_xe.getText());
                    pst.setString(8, que.getText());
                    pst.setInt(9, tableID);

                    int rowsInserted = pst.executeUpdate();
                    System.out.println("sql" + sql);
                    JOptionPane.showMessageDialog(this, "Updated ThongTinNguoiO");

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
    }//GEN-LAST:event_suaActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        if (ma_phong.getText().isEmpty() || ho_ten.getText().isEmpty() || nam_sinh.getText().isEmpty() || sdt.getText().isEmpty() || cccd.getText().isEmpty() || bien_so_xe.getText().isEmpty() || ten_xe.getText().isEmpty() || que.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ");
        } else {
            try {
                db = getConnect();
                if (db != null) {
                    String sql = "Delete from dbo.ThongTinNguoiO where idNO = ?";

                    PreparedStatement pst = db.prepareStatement(sql);
                    pst.setInt(1, tableID);

                    int rowsInserted = pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Delete ThongTinNguoioiO");
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
    }//GEN-LAST:event_xoaActionPerformed

    private void tim_kiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tim_kiemActionPerformed
        // TODO add your handling code here:
        if (ma_phong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ");

        } else {
            try {
                db = getConnect();
                st = db.createStatement();
                String sql = "select * from dbo.ThongTinNguoiO where maPhong = '" + ma_phong.getText()+"'";

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
                hien_thi.setModel(model);

                // Đóng kết nối và tài nguyên
                rs.close();
                db.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tim_kiemActionPerformed

    private void lam_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lam_moiActionPerformed
        // TODO add your handling code here:
        showData();
        resetData();
    }//GEN-LAST:event_lam_moiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bien_so_xe;
    private javax.swing.JTextField cccd;
    private javax.swing.JTable hien_thi;
    private javax.swing.JTextField ho_ten;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lam_moi;
    private javax.swing.JTextField ma_phong;
    private javax.swing.JTextField nam_sinh;
    private javax.swing.JTextField que;
    private javax.swing.JTextField sdt;
    private javax.swing.JButton sua;
    private javax.swing.JTextField ten_xe;
    private javax.swing.JButton them;
    private javax.swing.JButton tim_kiem;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
