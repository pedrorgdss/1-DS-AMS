/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projecttipiei;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ProjectTipiei {

    public static void main(String[] args) {
        //Algoritmo feito por Pedro Rodrigues Pimentel n olab111
        double num1 = 34.9;
        double num2 = 22.13;
        
        //Operações Matemáticas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num2 * num1;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN; //Evitar divisão por resto
        double resto = num1 % num2;
        //Para exibir resultados:
        System.out.println("Resultados das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao : "Indefinida (Divisão por zero)" + resto));
    }
}
