/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2tpa;

/**
 *
 * @author pedro
 */
import java.util.Scanner;
public class Exercicio2TPA {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        
        //Solicitaçaõ de números e caracteres
        System.out.println("Insira um número: ");
        double n1 = scanner.nextDouble();
        
        System.out.println("Insira outro número: ");
        double n2 = scanner.nextDouble();
        
        System.out.println("Insira um valor em graus Celsius: ");
        double graus = scanner.nextDouble();
        
        System.out.print("Digite um número inteiro positivo para verificar se é primo: ");
        int NumPraVe = scanner.nextInt();
        
        System.out.println("Digite sua primeira nota : ");
        double nt1 = scanner.nextDouble();
        
        System.out.println("Digite sua segunda nota : ");
        double nt2 = scanner.nextDouble();
        
        System.out.println("Digite sua terceira nota : ");
        double nt3 = scanner.nextDouble();
        
        System.out.println("Digite sua quarta nota : ");
        double nt4 = scanner.nextDouble();
        
        System.out.println("De qual número vc quer saber a tabuada? ");
        int NumPraMulti = scanner.nextInt();
        
        scanner.nextLine(); // Limpar o buffer
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite sua data de nascimento: ");
        double dataDN = scanner.nextDouble();
        
        scanner.nextLine(); // Limpar o buffer
        
        System.out.println("Digite o curso que você faz: ");
        String CursoQueVcFaz = scanner.nextLine();
        
        System.out.println("Digite sua série: ");
        String SuaSerie = scanner.nextLine();
        
        System.out.println("Sua altura: ");
        double Altura = scanner.nextDouble();
        
        System.out.println("Digite seu peso: ");
        double Peso = scanner.nextDouble();
        
        //operações
        double soma = n1 + n2;
        double subtr = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1/n2;
        double faren = graus * 1.8 + 32; 
        double kelvin = graus + 273;
        
        //verificar se o número é primo
        boolean NumPrimo = true;
        if (NumPraVe <= 1) {
            NumPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(NumPraVe); i++) {
                if (NumPraVe % i == 0) {
                    NumPrimo = false;
                    break;
                }
            }
        }
       
        //Calcular média
        double media = (nt1 + nt2 + nt3 + nt4)/4;
        
        //tabuada
        int tabuada1 = NumPraMulti * 1;
        int tabuada2 = NumPraMulti * 2;
        int tabuada3 = NumPraMulti * 3;
        int tabuada4 = NumPraMulti * 4;
        int tabuada5 = NumPraMulti * 5;
        int tabuada6 = NumPraMulti * 6;
        int tabuada7 = NumPraMulti * 7;
        int tabuada8 = NumPraMulti * 8;
        int tabuada9 = NumPraMulti * 9;
        int tabuada10 = NumPraMulti * 10;
       
        //impressão de resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("A soma desses valores é: " + soma);
        System.out.println("A subtração é: " + subtr);
        System.out.println("A multiplicação desses números é: " + multiplicacao);
        System.out.println("O primeiro valor divido pelo segundo é: " + divisao);
        System.out.println(graus + " graus Celsius em Fahrenheit é: " + faren);
        System.out.println(graus + " graus Celsius em Kelvin é: " + kelvin);
        
        if (NumPrimo) { 
            System.out.println(NumPraVe + " é um número primo.");
        } else {
            System.out.println(NumPraVe + " não é um número primo.");
        }
        
        System.out.println("Sua média é: " + media);
        //Impressão da tabuada
        System.out.println("\nTabuada do " + NumPraMulti + ":");
        System.out.println(NumPraMulti + " x 1 = " + tabuada1);
        System.out.println(NumPraMulti + " x 2 = " + tabuada2);
        System.out.println(NumPraMulti + " x 3 = " + tabuada3);
        System.out.println(NumPraMulti + " x 4 = " + tabuada4);
        System.out.println(NumPraMulti + " x 5 = " + tabuada5);
        System.out.println(NumPraMulti + " x 6 = " + tabuada6);
        System.out.println(NumPraMulti + " x 7 = " + tabuada7);
        System.out.println(NumPraMulti + " x 8 = " + tabuada8);
        System.out.println(NumPraMulti + " x 9 = " + tabuada9);
        System.out.println(NumPraMulti + " x 10 = " + tabuada10);
        
        System.out.println("\n--- Dados Pessoais ---");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataDN);
        System.out.println("Curso: " + CursoQueVcFaz);
        System.out.println("Série: " + SuaSerie);
        System.out.println("Altura: " + Altura);
        System.out.println("Peso: " + Peso);
        
        scanner.close();
    }
}