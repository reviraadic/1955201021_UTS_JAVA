/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSKU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author user
 */
public class BANGUNDATAR2 {
    public static void main(String[] args) {
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
            String a ="";
            int hitungLuas=0;
            System.out.println("<<<<Luas Persegi>>>>");
            System.out.println("Masukkan nilai sisi : ");
        try {
            a = data.readLine();
            int angka = Integer.parseInt(a);
            hitungLuas =angka*angka;
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error");
        }
            System.out.println("Luas persegi dengan sisi " + a + " adalah " + hitungLuas);
}
}