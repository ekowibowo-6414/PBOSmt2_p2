/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author hp
 */
 class hewan{
        public void suara(){
            System.out.println("Hewan Bersuara");
        }
    }
    class kuda extends hewan{
        public void suara(){
            System.out.println("Kuda Mengikik");
        }
    }
    class kucing extends hewan{
        public void suara(){
            System.out.println("Kucing Mengeong");
        }
    }
    class ayam extends hewan{
        public void suara(){
            System.out.println("Ayam Berkokok");
        }
    }
    
public class Polymorfisme {
    public static void main(String[] args) {
        hewan Hewan= new hewan();
        kuda Kuda = new kuda();
        kucing Kucing = new kucing();
        ayam Ayam = new ayam();
        
        Hewan.suara();
        
        Hewan = Kuda;
        Hewan.suara();
        
        Hewan= Kucing;
        Hewan.suara();
        
        Hewan = Ayam;
        Hewan.suara();
    }
   
}
