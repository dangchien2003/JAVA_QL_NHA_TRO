/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.java_qlnt.QLPhong;


import java.awt.Dimension;
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
public class Tang extends javax.swing.JPanel {
    /**
     * Creates new form ListPhong
     */
    public Tang() {
        System.out.println("Tang"); 
        initComponents();
        jPanel1.removeAll();
    }
    private final ArrayList<Phong> listRoom = new ArrayList<>();
//    private ResultSet listRoom;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void addPhong(Phong phong) {
        listRoom.add(phong);
    }
    
    private void addTang() {
        
        for (int i = 0; i < listRoom.size(); i++) {
            jPanel1.add(listRoom.get(i));
        }
    }
    
    public void Show() {
        jPanel1.setLayout(new FlowLayout());
        addTang();
        jPanel1.setPreferredSize(new Dimension(1157, 110));
        jPanel1.validate();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
