/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;
import java.sql.*;

/**
 *
 * @author danialfaza
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
         String url = "jdbc:mysql://localhost:3306/db_penjualan?useSSL=false&serverTimezone=UTC";

        try {
            koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("Berhasil konek DB");
        } catch (SQLException ex) {
            System.out.println("Error konek: " + ex);
        }
        
        return koneksi;
    }
    
}
