/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanBab6;

/**
 *
 * @author bangw
 */
public class Gaji_Reward extends Gaji_abs_reward{
    double menit;
    int waktu;
    double tunj_bonus;
    double tunj_anak;
    double gajipokok;
    double anak;
    
     @Override
    double lembur(){
        tunj_bonus = waktu /60;
        return tunj_bonus * 25000;
    }
   
    @Override
    double tunjanganAnak(){
        if (anak == 0){
            tunj_anak = 0; 
        }
        else if ( anak == 1){
         tunj_anak = gajipokok * 0.1;
    }
        else{
             tunj_anak = gajipokok * 0.2;
        }
        return tunj_anak;
    }
}
