/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperatorJava;

/**
 *
 * @author hp
 */
public class OperatorPembanding {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 3;
        int d = 9;
        int e = 8;
        int f = 2;
        boolean aa,bb,cc,dd,ee,ff;
        aa= a==b;
        bb = b>c;
        cc = c < d;
        dd = d >= e;
        ee = e <= f;
        ff = b!=a;
        System.out.println("Apakah "+a+"=="+b+" Jawabannya adalah "+ aa);
        System.out.println("Apakah "+b+">"+c+" Jawabannya adalah "+ bb);
        System.out.println("Apakah "+c+"<"+d+" Jawabannya adalah "+ cc);
        System.out.println("Apakah "+d+">="+e+" Jawabannya adalah "+ dd);
        System.out.println("Apakah "+e+"<="+b+" Jawabannya adalah "+ ee);
        System.out.println("Apakah "+b+"!="+a+" Jawabannya adalah "+ ff);
        
    }
    
}
