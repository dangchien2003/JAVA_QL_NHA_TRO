/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_qlnt;
import com.mycompany.java_qlnt.authen.DangNhap;
import com.mycompany.java_qlnt.helper.Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author chien
 */


public class Main {
    void test() {
        Helper helper = new Helper();
//        Object rs = helper.query("insert into test(test) values (2)");
        Object rs = helper.query("select * from test");
        if( rs== null){
            System.out.print("null"); 
        }else {
            try {
                ResultSet result = (ResultSet)rs;
                while(result.next()) {
                    try {
                        int cotSoNguyen = result.getInt("test");
                        System.out.println(cotSoNguyen); 
                    } catch (SQLException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}

    
    
    public static void main(String[] args) {
        DangNhap mainform = new DangNhap();
        mainform.main(args);
    }
}
