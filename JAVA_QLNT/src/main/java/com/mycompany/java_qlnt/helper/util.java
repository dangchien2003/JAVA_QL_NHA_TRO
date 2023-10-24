/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_qlnt.helper;

import com.mycompany.java_qlnt.QLPhong.ActionRoom.Action;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chien
 */
public class util {
    public void loadDataToTable(ResultSet data, JTable table) {
        // lấy số cột của table
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        int columnCount = model.getColumnCount();
        try {
            while (data.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = data.getObject(i);
                }
                model.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Action.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
