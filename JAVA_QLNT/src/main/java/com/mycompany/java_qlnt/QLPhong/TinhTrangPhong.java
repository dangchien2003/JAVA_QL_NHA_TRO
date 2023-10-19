/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.java_qlnt.QLPhong;

import com.mycompany.java_qlnt.helper.Helper;
import java.awt.Color;
import java.awt.FlowLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author chien
 */
public class TinhTrangPhong extends javax.swing.JPanel {

    /**
     * Creates new form TinhTrangPhong
     */
    public TinhTrangPhong() {
        initComponents();
        jPanel1.removeAll();
        showListRoom();
        
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

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void showListRoom() {
        System.out.println("TinhTrangPhong");
        ResultSet DSPhong = GetRoom();
        ArrayList<Tang> listTang = new ArrayList<>();
        int tmp = 1;
        Tang tang = new Tang();
        Phong phong;
        try {
            while (DSPhong.next()) {
                String maPhong = DSPhong.getString("maPhong");
                String tinhTrang = DSPhong.getString("tinhTrang");
                int tangHT = DSPhong.getInt("tang");
                int soNguoi = DSPhong.getInt("soNguoiO");
                // sang tầng khác
                if(tangHT != tmp) {
                    listTang.add(tang);
                    ++tmp;
                    tang = new Tang();
                }
                // vẫn ở tầng
                phong = new Phong(maPhong, tinhTrang, soNguoi);
                tang.addPhong(phong);
            }
            listTang.add(tang);
            for (int i = 0; i < listTang.size(); i++) {
                listTang.get(i).Show();
                addPanel(listTang.get(i));
            }
            jPanel1.validate();
            
        } catch (SQLException ex) {
            Logger.getLogger(TinhTrangPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private ResultSet GetRoom () {
        String sql = "select maPhong, tinhTrang, tang, soNguoiO from PhongTro order by tang";
        Helper helper = new Helper();
        ResultSet DSPhong = helper.select(sql);
        return DSPhong;
    }
    
     private void addPanel(JPanel childpanel) {
        jPanel1.add(childpanel);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
