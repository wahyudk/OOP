/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPratikum.Bab2;

/**
 *
 * @author Edwar Arliman Gea
 */
public class Data_Matkul {
    String kode_mk;
    String nama_mk;
    String dosen_pengampu;
    int jml_sks;
    
    // Konstruktor untuk menginisialisasi nilai
    public Data_Matkul() {
        this.kode_mk = "12345";
        this.nama_mk = "OOP";
        this.dosen_pengampu = "YOA";
        this.jml_sks = 12;
    }
    
    public static void main(String[] args) {
        Data_Matkul matkul = new Data_Matkul();
        System.out.println("Kode MK: " + matkul.kode_mk);
        System.out.println("Nama MK: " + matkul.nama_mk);
        System.out.println("Dosen Pengampu: " + matkul.dosen_pengampu);
        System.out.println("Jumlah SKS: " + matkul.jml_sks);
    }
}
