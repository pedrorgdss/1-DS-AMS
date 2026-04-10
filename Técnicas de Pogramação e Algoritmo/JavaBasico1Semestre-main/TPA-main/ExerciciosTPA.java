/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciostpa;

/**
 *
 * @author pedro
 */
import java.util.Scanner;
public class ExerciciosTPA {

    public static void main(String[] args) {
        
       //Eu Pedro Rodrigues Pimentel estou fazendo as atividades solicitadas pela disciplina de TPA.
        
       Scanner scanner = new Scanner (System.in);
       
       //solicitação de números
        System.out.println("Insira um número: ");
        System.out.println("Insira outro número: ");
        System.out.println("Insira um valor em graus Celsius");
        System.out.println("Digite um número positivo: ");
        
        //váriaveis
       double n1 = scanner.nextDouble();
       double n2 = scanner.nextDouble();
       double NumPraVe = scanner.nextDouble();
       int graus = scanner.nextInt();
       boolean NumPrimo = true;
       
       //operações
       double soma = n1 + n2;
       double subtr = n1 - n2;
       double multiplicacao = n1 * n2;
       double divisao = n1/n2;
       double faren = graus * 1.8 + 32; 
       double kelvin = graus + 273;
       //verificar se o número é primo
       if (NumPraVe <= 1) {
           NumPrimo = false;
       } else {
           for (int i = 2; i <= NumPraVe/2; i++) {
               if (NumPraVe % i == 0) {
                   NumPrimo = false;
                   break;
               }
           }
       }
       
       //impressão de resultados
        System.out.println("a soma desses valores é: " + soma);
        System.out.println("a subtração é : " + subtr);
        System.out.println("a multiplicação desses números é: " + multiplicacao);
        System.out.println("O primeiro valor divido pelo segundo é: " + divisao);
        System.out.println(graus + " graus Celsius em Fahrenheit é: " + faren);
        System.out.println(graus + " graus Celsius em Kelvin é : " + kelvin);
        if (NumPrimo) { 
            System.out.println(NumPraVe + " é um número primo.");
        } else {
            System.out.println(NumPraVe + " não é um número primo.");
        }
        scanner.close();
        
        
    }
}
