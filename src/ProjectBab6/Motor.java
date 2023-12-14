/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectBab6;

/**
 *
 * @author bangw
 */
public class Motor extends Kendaraan {
    private boolean kickStart;

    // Constructor
    public Motor(String merk, String model, boolean kickStart) {
        super(merk, model);
        this.kickStart = kickStart;
    }

    // Implementasi method start
    @Override
    public void start() {
        System.out.println("Motor dinyalakan");
    }

    // Implementasi method stop
    @Override
    public void stop() {
        System.out.println("Motor dimatikan");
    }

    // Additional method
    public void kickStart() {
        System.out.println("Motor Dinyalakan");
    }
}
