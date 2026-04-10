/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cronometro;

/**
 *
 * @author Pedro
 */
import java.util.Scanner;
    public class Cronometro {

    public static void main(String[] args) {
        Scanner InUser = new Scanner(System.in);
        
        System.out.println("digite o numero final");
        int NumFinal = InUser.nextInt();
        
        for(int numinicial = 0; numinicial <=NumFinal; numinicial++){
            System.out.println(numinicial);
        }
    }
}
