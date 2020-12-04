/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119011.reihanwiyanda.no1;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda   
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class UTSIF110119011REIHANWIYANDANo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Age umur = new Age(2020);
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Tahun Lahir Anda : ");
        umur.setYearBirth(sc.nextInt());
        
        System.out.println();
        
        System.out.println("===Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda\t : " + umur.getYearBirth());
        System.out.println("Hari ini Tahun\t\t : " + umur.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + umur.hitungUmur() + " Tahun");
        System.out.println("Tandanya Kamu " + umur.tandanyaKamu(umur.hitungUmur()));
        
        
    }
    
}
