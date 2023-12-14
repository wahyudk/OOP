/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9.Exception;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class throwException {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int jmlkaki;
        System.out.println("Berapa Jumlah Kaki Kerbai ???? ");
        try{
            System.out.print("Jumlah kaki : ");
            jmlkaki = input.nextInt();
            if(jmlkaki != 4 ){
                throw new NullPointerException("Terjadi Kesalahan NIHH XIXIXIXIXI"); 
            }else{
                System.out.println("Benar Jumlah Kaki Kerbau ada 4");
            }
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}
