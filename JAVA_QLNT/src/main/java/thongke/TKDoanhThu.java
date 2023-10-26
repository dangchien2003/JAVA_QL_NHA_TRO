/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package thongke;

import com.mycompany.java_qlnt.helper.Helper;
import com.mycompany.java_qlnt.helper.util;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class TKDoanhThu extends javax.swing.JPanel {

    /**
     * Creates new form TKDoanhThu
     */
    public TKDoanhThu() {
        initComponents();
    }
    
    Helper help = new Helper();
    util util = new util();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        thang = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nam = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doanhThuThang = new javax.swing.JTextField();
        doanhThuNam = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1303, 468));

        jLabel2.setText("Tháng");

        thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel3.setText("Năm");

        nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số tầng", "Tên phòng", "Giá phòng", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        label.setText("Tống doanh thu/năm");

        jLabel4.setText("Tổng doanh thu/tháng");

        doanhThuThang.setEditable(false);

        doanhThuNam.setEditable(false);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(label))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doanhThuNam, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doanhThuThang, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thang, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton1)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(doanhThuThang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label)
                            .addComponent(doanhThuNam, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(239, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String _thang = thang.getSelectedItem().toString();
        String _nam = nam.getSelectedItem().toString();
        if(_thang.length() == 1) {
            _thang = "0"+_thang;
        }
        // sql lấy dữ liệu thành tiền 1 tháng của từng phòng
        String sql = "select  " +
            "PhongTro.tang, " +
            "HoaDon.maPhong, " +
            "ThongTinHopDong.giaPhong, "+
            "(((soDienMoi-soDienCu)*giaDien) + (giaNuoc*HoaDon.soNguoi) + giaVeSinh + (giaXe*HoaDon.soXe) + giaPhong) as tongTien	 " +
            "from HoaDon " +
            "join PhongTro on PhongTro.maPhong = HoaDon.maPhong " +
            "join ThongTinHopDong on ThongTinHopDong.maHD = PhongTro.maHD " +
            "where ngayChot LIKE '"
                + _nam
                + "-"
                + _thang
                + "-%' " +
            "order by PhongTro.tang;";
        ResultSet data = help.select(sql);
        loadDataTable(data);
        // doanh thu theo tháng
        sql = "select  " +
            "sum((((soDienMoi-soDienCu)*giaDien) + (giaNuoc*HoaDon.soNguoi) + giaVeSinh + (giaXe*HoaDon.soXe) + giaPhong)) as doanhThuThang	 " +
            "from HoaDon " +
            "join PhongTro on PhongTro.maPhong = HoaDon.maPhong " +
            "join ThongTinHopDong on ThongTinHopDong.maHD = PhongTro.maHD " +
            "where ngayChot LIKE '"
                + _nam
                + "-"
                + _thang
                + "-%' " 
            + "group by ngayChot";
        data = help.select(sql);
        String _doanhThuThang = "";
        try {
            while (data.next()) {                
                _doanhThuThang = data.getString("doanhThuThang");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TKDoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
        doanhThuThang.setText(_doanhThuThang);
        
        sql = "select  " +
            "sum((((soDienMoi-soDienCu)*giaDien) + (giaNuoc*HoaDon.soNguoi) + giaVeSinh + (giaXe*HoaDon.soXe) + giaPhong)) as doanhThuNam	 " +
            "from HoaDon " +
            "join PhongTro on PhongTro.maPhong = HoaDon.maPhong " +
            "join ThongTinHopDong on ThongTinHopDong.maHD = PhongTro.maHD " +
            "where ngayChot LIKE '"
                + _nam
                + "-%' " ;
        data = help.select(sql);
        String _doanhThuNam = "";
        try {
            while (data.next()) {                
                _doanhThuNam = data.getString("doanhThuNam");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TKDoanhThu.class.getName()).log(Level.SEVERE, null, ex);
        }
        doanhThuNam.setText(_doanhThuNam);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loadDataTable(ResultSet data) {
        util.loadDataToTable(data, jTable1);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField doanhThuNam;
    private javax.swing.JTextField doanhThuThang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label;
    private javax.swing.JComboBox<String> nam;
    private javax.swing.JComboBox<String> thang;
    // End of variables declaration//GEN-END:variables
}