/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author hp
 */
public class Sepeda {
    int Kecepatan;
    int Gir;
    
    void ubahGir(int pertambahanGir){
        Gir = Gir + pertambahanGir;
        System.out.println("Gir :" + Gir);
    }
    void tambahKecepatan(int pertambahanKecepatan){
        Kecepatan = Kecepatan + pertambahanKecepatan;
        System.out.println("Kecepatan :" + Kecepatan);
    }
    
}
