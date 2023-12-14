/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Polimorfisme;

/**
 *
 * @author bangw
 */
public class Emoney implements dapatDiscan {
    @Override
    public void scanQris() {
        System.out.println("Pembayaran Lewat QRcode :91257237523752375");
        System.out.println("Pembayaran Berhasil!!!!!!!!!!!");
    }
}
