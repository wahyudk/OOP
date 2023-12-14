/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectBab6;

/**
 *
 * @author bangw
 */
public abstract class Kendaraan {

    private String merk;
    private String model;

    // Constructor
    public Kendaraan(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    // Abstract method
    public abstract void start();

    // Abstract method
    public abstract void stop();

     //method
    public void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
    }
}
