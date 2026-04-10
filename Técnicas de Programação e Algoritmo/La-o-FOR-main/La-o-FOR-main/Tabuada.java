/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

/**
 *
 * @author Pedro
 */
import java.util.Scanner;
public class Tabuada {

    public static void main(String[] args) {
       Scanner InUser = new Scanner(System.in);
       
        System.out.println("Digite um número para saber a tabuada: ");
        double NumTabu = InUser.nextDouble();
        
        //OPERAÇÃO DA TABUADA 1 AO 10
        
        for (int tabuada = 1; tabuada <= 10; tabuada++){
            System.out.println(NumTabu + " X " + tabuada + " = " + NumTabu*tabuada);
        
    }}
}
