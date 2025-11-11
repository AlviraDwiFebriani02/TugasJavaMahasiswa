/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahmad Yusuf
 */
public class Mahasiswa {
    int id;
    String nim;
    String nama;
    
    int tahunMasuk;
    Connection con;
    
    Mahasiswa(int id, String nim, String nama, int tahunMasuk){
        this.id = id;
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        
        con = DbConnection.connect();
    }
    
    Mahasiswa(String nim, String nama, int tahunMasuk){
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
    }
    
    public Mahasiswa (String nama, String nim){
        this.nim = nim;
        this.nama = nama;
    }
    public void tambah (){
        try {
            Connection con = DbConnection.connect();
            PreparedStatement pst = con.prepareStatement(
                    "INSERT INTO mahasiswa (nim, nama) VALUES (?, ?)"
            );
            pst.setString(1, nim);
            pst.setString(2, nama);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Mahasiswa (int id){
        this.id = id;
    }
    public void hapus (){
        try {
            Connection con = (Connection) DbConnection.connect();            
            
           PreparedStatement pst = con.prepareStatement("DELETE FROM mahasiswa WHERE id=?");
            pst.setInt(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Mahasiswa (int id, String nama, String nim){
        this.id = id;
        this.nama = nama;
        this.nim = nim;
    }
    
    public void edit (){
        try {
            Connection con = DbConnection.connect();
            PreparedStatement pst = con.prepareStatement(
                "UPDATE mahasiswa SET nim=?, nama=? WHERE id=?"
            );
            pst.setString(1, nim);
            pst.setString(2, nama);
            pst.setInt(3, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diedit!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
