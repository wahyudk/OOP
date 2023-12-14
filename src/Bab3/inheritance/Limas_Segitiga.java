/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab3.inheritance;

/**
 *
 * @author bangw
 */
public class Limas_Segitiga extends Segitiga {
    double tinggilimas, vol;
    double volumelimas() {
        vol = ((0.333*luas())* tinggilimas);
        return vol;
    }  
}
