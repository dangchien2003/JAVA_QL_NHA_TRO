/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.java_qlnt.QLPhong;

import com.mycompany.java_qlnt.helper.Helper;
import java.awt.Color;
import java.awt.FlowLayout;
import java.sql.ResultSet;
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
    }// </editor-fold>//GEN-END:initComponents

    
    private void showListRoom() {
        System.out.println("TinhTrangPhong");
        ResultSet DSPhong = GetRoom();
        ListPhong listPhong = new ListPhong(DSPhong);
        ShowList(listPhong);
    }
    
    private ResultSet GetRoom () {
        String sql = "select maPhong, tinhTrang from PhongTro";
        Helper helper = new Helper();
        ResultSet DSPhong = helper.select(sql);
        return DSPhong;
    }
    
     private void ShowList(JPanel childpanel) {
        this.setLayout(new FlowLayout());
        this.add(childpanel);
        this.validate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
