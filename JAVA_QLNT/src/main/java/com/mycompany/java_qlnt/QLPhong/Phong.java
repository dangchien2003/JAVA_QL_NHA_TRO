/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.java_qlnt.QLPhong;

import java.awt.Color;

/**
 *
 * @author chien
 */
public class Phong extends javax.swing.JPanel {

    /**
     * Creates new form TinhTrang
     */
    public Phong(String tenP, String tinhTrang) {
        initComponents();
        this.tenPhong = tenP;
        this.tinhTrangPhong = tinhTrang;
        setItem();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TenPhong = new javax.swing.JLabel();
        TinhTrangHienTai = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickRoom(evt);
            }
        });

        TenPhong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TenPhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TenPhong.setText("P101");

        TinhTrangHienTai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TinhTrangHienTai.setText("Đang sử dụng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TinhTrangHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(TenPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(TenPhong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TinhTrangHienTai)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clickRoom(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickRoom
        // TODO add your handling code here:
        System.out.println(tenPhong); 
        System.out.println(tinhTrangPhong); 
    }//GEN-LAST:event_clickRoom
    private String tenPhong = "";
    private String tinhTrangPhong = "";
    
    public void setItem() {
        TenPhong.setText(tenPhong);
        TinhTrangHienTai.setText(tinhTrangPhong);
        switch(tinhTrangPhong.toLowerCase()) {
            case "đang sử dụng" -> this.setBackground(new Color(255, 102, 102));
            case "phòng trống" -> this.setBackground(Color.GREEN);
            case "đang cọc" -> this.setBackground(Color.YELLOW);
            case "sắp hết hợp đồng" -> this.setBackground(Color.ORANGE);
            default->this.setBackground(Color.MAGENTA);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TenPhong;
    private javax.swing.JLabel TinhTrangHienTai;
    // End of variables declaration//GEN-END:variables
}