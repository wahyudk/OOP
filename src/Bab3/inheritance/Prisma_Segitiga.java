/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3.inheritance;

/**
 *
 * @author bangw
 */
public class Prisma_Segitiga extends Segitiga {
    double tinggiprisma, vol;
    double volumeprisma() {
        vol = (luas()*tinggiprisma);
        return vol;
    }
}
