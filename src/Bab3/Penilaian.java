/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPratikum.Bab3;

/**
 *
 * @author Edwar Arliman Gea
 */
public class Penilaian {
    String NIM, nama, kode_mk;
    int NP1,NP2,NP3,NilaiPrak,UTS,UAS;
    
    double nilaiproses(){
        return ((NP1 * 0.1)+ (NP2 * 0.2)+ (NP3 * 0.1)+ (UTS*0.2)+ (NilaiPrak * 0.4));
    }
    
    double nilaiakhir (){
        return (nilaiproses()*0.6)+(UAS*0.3);
    }
    
    double tampiLNA(){
        return nilaiakhir();
    }
    
    double nilaiKeaktifan(){
        return 0;
    }
}
