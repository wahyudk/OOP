/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPratikum.Bab4;

/**
 *
 * @author Edwar Arliman Gea
 */
public class KeaktifanMahasiswa extends Penilaian {
    int nilai_keaktifan;
    public KeaktifanMahasiswa() {
        this.nilai_keaktifan = 0;
    }
    @Override
    public double nilaiKeaktifan() {
        return ((nilai_keaktifan * 0.1) + nilaiakhir());
    }
    private double nilaiakhir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
