/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_qlnt.helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author chien
 */
public class Helper {
    private boolean checkpath(String Stringconnection) {
        File file = new File(Stringconnection);

        // Kiểm tra xem file đã tồn tại hay chưa
        if (!file.exists()) {
            try {
                // Tạo file mới nếu nó chưa tồn tại
                if (file.createNewFile()) {
                    System.out.println("File thanh cong");
                } else {
                    System.out.println("Tao file that bai");
                }
            } catch (IOException e) {
                System.out.println( e.getMessage());
                System.out.println("helper.java"); 
            }
        }
        return true;
    }
    private String getStringConnection() {
        String Stringconnection= "";
        // Đường dẫn đến file văn bản bạn muốn đọc
        String filePath = "src\\main\\java\\com\\mycompany\\java_qlnt\\helper\\StringConnection.txt";
        checkpath(filePath);

        // Sử dụng try-with-resources để đảm bảo tài nguyên được đóng tự động
        try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
            //đọc file theo dòng
            Stringconnection = br.readLine();
            if(Stringconnection == null) {
                System.out.println("File StringConnection.txt khong co du lieu - src\\main\\java\\com\\mycompany\\java_qlbh\\helper\\StringConnection.txt"); 
                //Dừng chương trình khi không có url sql
                System.exit(1);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage()); 
            System.out.println("Xem lai file StringConnection.txt   src\\main\\java\\com\\mycompany\\java_qlbh\\helper\\StringConnection.txt"); 
        }
        return Stringconnection;
    }
    
   
    private Connection getConnection() {
        String url = getStringConnection();
        try{
            Connection conn = DriverManager.getConnection(url);
            return conn;
            
        }catch(SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("KNTB - helper"); 
            return null;
        }
    }
    
    
    private int edit(String query, Statement stmt) {
        try {
            int rowsAffected = stmt.executeUpdate(query);
            return rowsAffected;
        } catch (SQLException ex) {
            return 0;
        }
    }
    
    
    public int edit(String query) {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(query);
            return rowsAffected;
        } catch (SQLException ex) {
            return 0;
        }
        
    }
    
    
    private ResultSet select(String query, Statement stmt) {
        try {
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public ResultSet select(String query) {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public Object query(String query) {
        try{
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            String headQuery = query.trim().substring(0,10);
            String[] arrSplitQuery = headQuery.split(" ");
            Object result = new Object();
            switch(arrSplitQuery[0].toUpperCase()) {
                case "SELECT" -> result = select(query, stmt);
                case "INSERT","UPDATE", "DELETE" -> result = edit(query, stmt);
            }
            return result;
        }catch(SQLException e) {
            return null;
        }
    } 
}
