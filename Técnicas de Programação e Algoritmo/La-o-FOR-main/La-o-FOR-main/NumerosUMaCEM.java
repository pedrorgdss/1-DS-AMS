/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosumacem;

/**
 *
 * @author Pedro
 */
import java.util.Scanner;
public class NumerosUMaCEM {

    public static void main(String[] args) {
        Scanner InUser = new Scanner(System.in);
        
        System.out.println("digite um numero");
        int NumPular = InUser.nextInt();
        
       
        for(int pulo = 1; pulo <= 100; pulo += NumPular){
            System.out.println(pulo);
        }
    }
}
