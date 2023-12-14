/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectBab6;

/**
 *
 * @author bangw
 */
public class Mobil extends Kendaraan {
    private int jumlahPintu;

    // Constructor
    public Mobil(String merk, String model, int jumlahPintu) {
        super(merk, model);
        this.jumlahPintu = jumlahPintu;
    }

    // Implementasi method start
    @Override
    public void start() {
        System.out.println("Mobil dinyalakan");
    }

    // Implementasi method stop
    @Override
    public void stop() {
        System.out.println("Mobil dimatikan");
    }

    // Additional method
    public void bukaPintu() {
        System.out.println("Pintu mobil dibuka");
    }
}
