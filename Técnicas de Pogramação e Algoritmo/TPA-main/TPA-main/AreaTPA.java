/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areatpa;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class AreaTPA {

    public static void main(String[] args) {
         //Algoritmo feito por Pedro Rodrigues Pimentel n olab111
        double num1 = 8.5;
        double num2 = 10;
        double num3 = 6.5;
        double lado1 = 12;
        double lado2 = 12;
        double base = 10;
        double altura = 3;
        double DiagonalMaior = 12;
        double DiagonalMenor = 3;
        double ValorDePi = 3.14;
        double Raio = 5;
        
        
        
        //Operações Matemáticas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num2 * num1;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN; //Evitar divisão por resto
        double resto = num1 % num2;
        double AreaDoQuadrado = lado1 * lado2; //a área do quadrado é lado multiplicado por lado
        double AreaDoRetangulo = base * altura; //para calcular a área do retangulo: base x altura
        double AreaDoLosango = (DiagonalMaior * DiagonalMenor) /2;
        double AreaDoTriangulo = (base * altura) /2;
        double AreaDaCircunferencia = ValorDePi * (Raio * Raio);
        double media = (num1 + num2 + num3)/3;
       
        


//Para exibir resultados:
        System.out.println("Resultados das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao : "Indefinida (Divisão por zero)" + resto));
        System.out.println("A área do quadrado é: " + AreaDoQuadrado);
        System.out.println("A área do retângulo é: " + AreaDoRetangulo);
        System.out.println("A área do losango é: " + AreaDoLosango);
        System.out.println("A área do triângulo é: " + AreaDoTriangulo);
        System.out.println("Area do circulo é: " + AreaDaCircunferencia);
        System.out.println("A média das suas notas foram: " + media);
    }

}
