/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPratikum.Bab4;

/**
 *
 * @author Edwar Arliman Gea
 */
public class Penilaian {
    public String NIM,nama,kode_mk;
    private int NP1,NP2,NP3,NilaiPrak,UTS,UAS;
    public double nilaiProses(){
        return ((NP1*0.1)+(NP2*0.2)+(NP3*0.3)+(NilaiPrak*0.4));
    }
    public double nilaiAkhir(){
        return (nilaiProses()*0.6)+ (UAS * 0.3);
    }
    public double tampilNA(){
        return nilaiAkhir();
    }
    public double nilaiKeaktifan(){
        return 0;
    }
    public int getNP1(){
        return NP1;
    }
    public void setNP1(int NP1){
        this.NP1 = NP1;
    }
    public int getNP2(){
        return NP2;
    }
    public void setNP2(int NP2){
        this.NP2 = NP2;
    }
    public int getNP3(){
        return NP3;
    }
    public void setNP3(int NP3){
        this.NP3 = NP3;
    }
    public int getNilaiPrak(){
        return NilaiPrak;
    }
    public void setNilaiPrak(int NilaiPrak){
        this.NilaiPrak = NilaiPrak;
    }
    public int getUTS(){
        return UTS;
    }
    public void setUTS(int UTS){
        this.UTS = UTS;
    }
     public int getUAS(){
        return UAS;
    }
    public void seUAS(int UAS){
        this.UAS = UAS;
    }
}
