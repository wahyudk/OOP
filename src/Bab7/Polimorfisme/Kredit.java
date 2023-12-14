/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Polimorfisme;

/**
 *
 * @author bangw
 */
public class Kredit {
    void cekKartuKredit(String norek, String input) {
        if (norek.equals(input)) {
            System.out.println("Pembayaran Kredit succes");
        } else {
            System.out.println("Pembayaran Gagal, kata sandisalah");
        }
    }
}
