/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlkhach_tro;
import com.mycompany.java_qlnt.QLHoaDon.*;
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
 * test 1
 *
 * @author admin
 */
public class qlkhachtro extends javax.swing.JPanel {
    /**
     * Creates new form QuanLiHoaDon
     */
    public qlkhachtro() {
        initComponents();
        showData();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        IdRoomTF = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NumberElectricOldTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NumberElectricNewTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NumberWaterOldTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NumberWaterNewTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NumberCarTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NumberPeopleTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ExpiresTF = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        EditBtn1 = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManagerTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 480));

        jLabel2.setText("Mã phòng:");

        SearchBtn.setText("Tìm kiếm");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Họ tên");

        jLabel4.setText("Năm sinh");

        jLabel5.setText("SDT");

        jLabel6.setText("Số CCCD");

        jLabel7.setText("Biển số xe");

        jLabel8.setText("Tên xe");

        jLabel9.setText("Quê quán");

        AddBtn.setText("Thêm ");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setText("Sửa");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        EditBtn1.setText("Làm Mới");
        EditBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtn1ActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Xóa");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ManagerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phòng", "Họ tên ", "Năm sinh", "SDT", "Số CCCD", "Biển số xe", "Tên xe ", "Quê quán"
            }
        ));
        ManagerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManagerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ManagerTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ KHÁCH TRỌ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(EditBtn)
                        .addGap(53, 53, 53)
                        .addComponent(EditBtn1)
                        .addGap(81, 81, 81)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(703, 703, 703)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NumberElectricNewTF, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addComponent(NumberElectricOldTF))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ExpiresTF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(NumberPeopleTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(NumberWaterOldTF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NumberWaterNewTF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NumberCarTF, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(IdRoomTF, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(32, 32, 32))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(IdRoomTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchBtn)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(NumberElectricOldTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(NumberElectricNewTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(NumberWaterOldTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(NumberWaterNewTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumberCarTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumberPeopleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExpiresTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EditBtn)
                        .addComponent(AddBtn))
                    .addComponent(DeleteBtn)
                    .addComponent(EditBtn1))
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents
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
            System.out.println("qlkhach_tro.qlkhachtro.getConnect()");

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
            ManagerTable.setModel(model);

            // Đóng kết nối và tài nguyên
            rs.close();
            db.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void resetData() {
         IdRoomTF.setText("");
        NumberElectricOldTF.setText("");
        NumberElectricNewTF.setText("");
        NumberWaterOldTF.setText("");
        NumberWaterNewTF.setText("");

        NumberCarTF.setText("");
        NumberPeopleTF.setText("");
        ExpiresTF.setText("");
       
    }

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        if (IdRoomTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing input");

        } else {
            try {
                db = getConnect();
                st = db.createStatement();
                String sql = "select * from dbo.ThongTinNguoiO where maPhong = "+Integer.valueOf(IdRoomTF.getText());

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
                ManagerTable.setModel(model);

                // Đóng kết nối và tài nguyên
                rs.close();
                db.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        if (IdRoomTF.getText().isEmpty() || NumberElectricOldTF.getText().isEmpty() || NumberElectricNewTF.getText().isEmpty() || NumberWaterOldTF.getText().isEmpty() || NumberWaterNewTF.getText().isEmpty() || NumberCarTF.getText().isEmpty() || NumberPeopleTF.getText().isEmpty() || ExpiresTF.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Missing input");

        } else {
            try {
                db = getConnect();
                if (db != null) {
                    String sql = "INSERT INTO dbo.HoaDon (maPhong,soDienCu,soDienMoi,soNuocCu,soNuocMoi,soXe,soNguoi,ngayChot,tongTien) VALUES (?, ?,?,?,?,?,?,?,?)";

                    PreparedStatement pst = db.prepareStatement(sql);
                    pst.setString(1, IdRoomTF.getText());
                    pst.setInt(2, Integer.valueOf(NumberElectricOldTF.getText()));
                    pst.setInt(3, Integer.valueOf(NumberElectricNewTF.getText()));
                    pst.setInt(4, Integer.valueOf(NumberWaterOldTF.getText()));
                    pst.setInt(5, Integer.valueOf(NumberWaterNewTF.getText()));
                    pst.setInt(6, Integer.valueOf(NumberCarTF.getText()));
                    pst.setInt(7, Integer.valueOf(NumberPeopleTF.getText()));

                    pst.setString(8, ExpiresTF.getText());
                  

                    int rowsInserted = pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "SUCCES!");
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
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        if (IdRoomTF.getText().isEmpty() || NumberElectricOldTF.getText().isEmpty() || NumberElectricNewTF.getText().isEmpty() || NumberWaterOldTF.getText().isEmpty() || NumberWaterNewTF.getText().isEmpty() || NumberCarTF.getText().isEmpty() || NumberPeopleTF.getText().isEmpty() || ExpiresTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing input");

        } else {
            try {
                db = getConnect();
                if (db != null) {
                    String sql = "UPDATE dbo.ThongTinNguoiO SET maPhong = ?, hoTen=?, namSinh=?, sdt=?,soCCCD=?, bienSoXe=?, tenXe=?, queQuan=?";
                    
      
                    PreparedStatement pst = db.prepareStatement(sql);
                 /*   pst.setInt(9, tableID);*/
                    pst.setString(1, IdRoomTF.getText());
                    pst.setString(2, NumberElectricOldTF.getText());
                    pst.setInt(3, Integer.valueOf(NumberElectricNewTF.getText().trim()));
                    pst.setString(4, NumberWaterOldTF.getText());
                    pst.setString(5, NumberWaterNewTF.getText());
                    pst.setString(6, NumberCarTF.getText());
                    pst.setString(7, NumberPeopleTF.getText());
                    pst.setString(8, ExpiresTF.getText().trim());
                   
                    System.out.println("sql"+sql);
                    int rowsInserted = pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Success!");
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
    }//GEN-LAST:event_EditBtnActionPerformed

    private void EditBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtn1ActionPerformed
        showData();
        resetData();
    }//GEN-LAST:event_EditBtn1ActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if (IdRoomTF.getText().isEmpty() || NumberElectricOldTF.getText().isEmpty() || NumberElectricNewTF.getText().isEmpty() || NumberWaterOldTF.getText().isEmpty() || NumberWaterNewTF.getText().isEmpty() || NumberCarTF.getText().isEmpty() || NumberPeopleTF.getText().isEmpty() || ExpiresTF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing input");

        } else {
            try {
                db = getConnect();
                if (db != null) {
                    String sql = "Delete from dbo.ThongTinNguoiO where maPhong = ?";

                    PreparedStatement pst = db.prepareStatement(sql);
                    pst.setInt(1, tableID);

                    int rowsInserted = pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Success");
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
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ManagerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManagerTableMouseClicked
        DefaultTableModel modal = (DefaultTableModel) ManagerTable.getModel();
        int myIndex = ManagerTable.getSelectedRow();
      /*  tableID = Integer.valueOf(modal.getValueAt(myIndex, 0).toString());*/
        IdRoomTF.setText(modal.getValueAt(myIndex, 0).toString());
        NumberElectricOldTF.setText(modal.getValueAt(myIndex, 1).toString());
        NumberElectricNewTF.setText(modal.getValueAt(myIndex, 2).toString());
        NumberWaterOldTF.setText(modal.getValueAt(myIndex, 3).toString());
        NumberWaterNewTF.setText(modal.getValueAt(myIndex, 4).toString());

        NumberCarTF.setText(modal.getValueAt(myIndex, 5).toString());
        NumberPeopleTF.setText(modal.getValueAt(myIndex, 6).toString());
        ExpiresTF.setText(modal.getValueAt(myIndex, 7).toString());
       

    }//GEN-LAST:event_ManagerTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton EditBtn1;
    private javax.swing.JTextField ExpiresTF;
    private javax.swing.JTextField IdRoomTF;
    private javax.swing.JTable ManagerTable;
    private javax.swing.JTextField NumberCarTF;
    private javax.swing.JTextField NumberElectricNewTF;
    private javax.swing.JTextField NumberElectricOldTF;
    private javax.swing.JTextField NumberPeopleTF;
    private javax.swing.JTextField NumberWaterNewTF;
    private javax.swing.JTextField NumberWaterOldTF;
    private javax.swing.JButton SearchBtn;
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
    // End of variables declaration//GEN-END:variables
}
