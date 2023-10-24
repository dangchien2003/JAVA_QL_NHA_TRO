/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.java_qlnt.QLPhong.ActionRoom;

import com.mycompany.java_qlnt.helper.Helper;
import com.mycompany.java_qlnt.helper.util;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author chien
 */
public class ActionRoom extends javax.swing.JPanel {
    private final Helper help = new Helper();
    private final util util = new util();
    private final JOptionPane toast = new JOptionPane();
    /**
     * Creates new form ActionRoom
     */
    public ActionRoom() {
        initComponents();
        loadAllRoom();
        addEvent();
    }

    private void loadAllRoom() {
        String sql = "select maPhong, tang, tinhTrang from PhongTro order by tang";
        ResultSet data = help.select(sql);
        util.loadDataToTable(data, jTable1);
    }
    
    private void addEvent() {
        tang.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Xử lý sự kiện khi giá trị của Spinner thay đổi
                int newValue = (int) tang.getValue();
                // Cập nhật dữ liệu liên quan dựa trên giá trị mới (newValue)
                if(newValue < 0) {
                    tang.setValue(0);
                }
            }
        });
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
        maphong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tang = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        tinhTrang = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("Mã phòng:");

        jLabel2.setText("Tầng:");

        tang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tang_change(evt);
            }
        });

        jLabel3.setText("Tình trạng:");

        tinhTrang.setEditable(false);
        tinhTrang.setBackground(new java.awt.Color(219, 220, 221));
        tinhTrang.setOpaque(true);

        jButton4.setBackground(new java.awt.Color(51, 255, 255));
        jButton4.setText("Làm sạch");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_click(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 102));
        jButton3.setText("Tìm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_click(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 255, 153));
        jButton2.setText("Lưu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_click(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Xoá");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_click(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Tầng", "Tình trạng"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1table_click(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maphong, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tang, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(maphong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tang_change(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tang_change
        // TODO add your handling code here:
        if(Integer.parseInt(tang.getValue().toString()) < 0) {
            tang.setValue(0);
        }
    }//GEN-LAST:event_tang_change

    private void clear_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_click
        // TODO add your handling code here:
        maphong.setText("");
        tang.setValue(0);
        tinhTrang.setText("");
        loadAllRoom();
    }//GEN-LAST:event_clear_click

    private void find_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_click
        // TODO add your handling code here:
        int _tang = (int) tang.getValue();
        String _maPhong = maphong.getText();
        String sql = "";
        if(_tang > 0 && !"".equals(_maPhong.trim())) {
            sql = "select maPhong, tang, tinhTrang from PhongTro where maPhong = '"
            + _maPhong
            + "', tang = "
            + _tang;
        }else if( !"".equals(_maPhong.trim())) {
            sql = "select maPhong, tang, tinhTrang from PhongTro where maPhong = '"
            + _maPhong
            + "'";
        }else if(_tang > 0) {
            sql = "select maPhong, tang, tinhTrang from PhongTro where tang = "+ _tang;
        }else {
            return;
        }
        ResultSet data = help.select(sql);
        util.loadDataToTable(data, jTable1);
    }//GEN-LAST:event_find_click

    private void save_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_click
        // TODO add your handling code here:
        int _tang = (int) tang.getValue();
        String _maPhong = maphong.getText();
        String sql = "";
        if(_tang > 0 && !"".equals(_maPhong.trim())) {
            sql = "MERGE INTO PhongTro AS target " +
            "USING (SELECT '"
            + _maPhong
            + "' AS maPhong, "
            + _tang
            + " AS tang) AS source " +
            "ON target.maPhong = source.maPhong " +
            "WHEN MATCHED THEN " +
            "    UPDATE SET target.tang = source.tang " +
            "WHEN NOT MATCHED THEN " +
            "    INSERT (maPhong, tang, tinhTrang) VALUES (source.maPhong, source.tang, N'Phòng trống');";
            System.out.println(sql);
        }else {
            toast.showMessageDialog(null,"Nhập đủ thông tin","Thông báo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int rows = help.edit(sql);
        if(rows == 1) {
            toast.showMessageDialog(null, "Lưu thành công","Thông báo", JOptionPane.INFORMATION_MESSAGE);
            loadAllRoom();
        }else {
            toast.showMessageDialog(null, "Lưu thất bại","Thông báo", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_save_click

    private void delete_click(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_click
        // TODO add your handling code here:
        String _maPhong = maphong.getText();
        String sql = "delete PhongTro where maPhong = '"+_maPhong+"'";
        int rows = help.edit(sql);
        if(rows == 1) {
            toast.showMessageDialog(null, "Xoá thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            loadAllRoom();
        }else {
            toast.showMessageDialog(null, "Xoá thất bại", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_delete_click

    private void jTable1table_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1table_click
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        maphong.setText(jTable1.getValueAt(selectedRow, 0).toString());
        tang.setValue(jTable1.getValueAt( selectedRow, 1));
        tinhTrang.setText(jTable1.getValueAt(selectedRow, 2).toString());
    }//GEN-LAST:event_jTable1table_click


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField maphong;
    private javax.swing.JSpinner tang;
    private javax.swing.JTextField tinhTrang;
    // End of variables declaration//GEN-END:variables
}
