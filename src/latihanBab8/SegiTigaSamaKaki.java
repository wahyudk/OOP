/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumbab8;

/**
 *
 * @author octar
 */
public class SegiTigaSamaKaki extends BangunDatar implements Keliling{
    public double alas, tinggi;
    public double a,b,c;
    @Override 
    public double hitungluas(){
        return ((alas*tinggi)/2);
    }
    @Override
    public void tampilHasil(){
        System.out.println("Luas Segitiga = "+ hitungluas());
        System.out.println("Keliling Segitiga = "+ hitungKeliling());
    }
    @Override
    public double hitungKeliling(){
        return (a+b+c);
    }
}
