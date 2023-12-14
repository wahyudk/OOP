/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9.Exception;

/**
 *
 * @author Lenovo
 */
public class login {
    private String username,password;
    public String nama;
    public login(){
        nama ="Muhammad Wahyu Setia Mukti";
        username = "wahyu";
        password = "2218110";
    }
    public String getusername(){
        return username;
    }
    public void setusername(){
        this.username = username;
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        this.password = password;
    }
    boolean Ceklogin(String username,String password){
        if(username.equals(getusername()) && password.equals(getpassword())){
            return true;
        }
        return false;
    } 
    
}
