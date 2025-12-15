<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadatabase;

/**
 *
 * @author LENOVO
 */
public class MahasiswaReguler extends MAHASISWA{
    
    public MahasiswaReguler(String nama, String nim, int sks) {
        super(nama, nim,"Reguler", sks);
    }

    
    @Override
    public double hitungBiayaKuliah() {
        return getSks() * 150000;
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadatabase;

/**
 *
 * @author LENOVO
 */
public class MahasiswaReguler extends MAHASISWA{
    
    public MahasiswaReguler(String nama, String nim, int sks) {
        super(nama, nim,"Reguler", sks);
    }

    
    @Override
    public double hitungBiayaKuliah() {
        return getSks() * 150000;
    }
}
>>>>>>> 2f1ab06585c65692d25b75373725a706d33e93e5
