/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erlanggstudio.oop1;

/**
 *
 * @author erlanga
 */
public class Main {
    public static void main(String[] args) {
    
        /* Cara mengakses class lingkaran 1 */    
        Lingkaran lingkaran1 = new Lingkaran();
        System.out.println("Nilai radius lingkaran 1 : " +lingkaran1.radius);
        System.out.println("Nilai luas lingkaran 1 : " +lingkaran1.getLuas());
        System.out.println("Nilai keliling lingkaran 1 : " +lingkaran1.getKeliling());

        /* Cara mengakses class lingkaran 2 */    
        Lingkaran lingkaran2 = new Lingkaran(25);
        System.out.println("Nilai radius lingkaran 2 : " +lingkaran2.radius);
        System.out.println("Nilai luas lingkaran 2 : " +lingkaran2.getLuas());
        System.out.println("Nilai keliling lingkaran 2 : " +lingkaran2.getKeliling());

        /* Cara mengakses class lingkaran 3 */    
        Lingkaran lingkaran3 = new Lingkaran(125);
        System.out.println("Nilai radius lingkaran 3 : " +lingkaran3.radius);
        System.out.println("Nilai luas lingkaran 3 : " +lingkaran2.getLuas());
        System.out.println("Nilai keliling lingkaran 3 : " +lingkaran2.getKeliling());
    }
}
