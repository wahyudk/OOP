/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectBab6;

/**
 *
 * @author bangw
 */
public class MainClass {
      public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", "Supra", 2);
        mobil.displayInfo();
        mobil.start();
        mobil.bukaPintu();
        mobil.stop();
        System.out.println();

        Motor motor = new Motor("Honda", "Scoopy", true);
        motor.displayInfo();
        motor.start();
        motor.stop();   
    }
}
