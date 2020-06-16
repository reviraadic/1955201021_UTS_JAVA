/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSKU;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class BANGUNDATAR1 {
    public static void main(String[] args) {
     double sisi, hasil;
String s = JOptionPane.showInputDialog(null, "masukan sisi: ");
sisi = Double.parseDouble(s);
hasil = 4*sisi;
System.out.println(hasil);
    }
}