/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSKU;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SWITCH_CASE {
    public static void main (String [] hady){
        Scanner in = new Scanner(System.in);
        String pilih;
        System.out.println("");
        System.out.print("Kamu pilih aku atau dia ??? ");
        pilih = in.nextLine();
        switch (pilih){
            case "kamu":
                System.out.print("\nAku pasti akan lebih baik dari dia !");
                break;
            case "dia":
                System.out.print("Lebih baik aku pergi jauh dari hidupmu");
                break;
        }
    }
}
