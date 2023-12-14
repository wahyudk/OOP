/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9.Exception;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Lat_Exception {
    public static void main (String[]args){
        try{
            int a,b,hasil;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("===PROGRAM PEMBAGIAN===");
            System.out.println("Masukan Angka 1 = ");
            a = Integer.parseInt(keyboard.next());
            System.out.println("Masukan Angka ke 2 = ");
            b = Integer.parseInt(keyboard.next());
            hasil = a/b;
            System.out.println(Integer.toString(hasil));
        }catch(ArithmeticException C){
            JOptionPane.showMessageDialog(null, "Nilai Pembagi Tidak boleh di bagi 0!!!","Warning",2);
        }catch(NumberFormatException d){
            JOptionPane.showMessageDialog(null, "Input yang anda masukan huruf bukan angka!!!","Warning",2);
        }finally{
        System.out.println("Terima kasih sudah menjalankan Program");
        }
    }
}
