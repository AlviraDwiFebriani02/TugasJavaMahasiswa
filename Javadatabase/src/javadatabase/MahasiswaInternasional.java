/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadatabase;

/**
 *
 * @author LENOVO
 */
public class MahasiswaInternasional extends MAHASISWA{
    public MahasiswaInternasional(String nama, String nim, int sks) {
        super(nama, nim, "Internasional", sks);
    }
    
    @Override
    public double hitungBiayaKuliah() {
        return getSks() * 300000 + 5000000;
    }
}

