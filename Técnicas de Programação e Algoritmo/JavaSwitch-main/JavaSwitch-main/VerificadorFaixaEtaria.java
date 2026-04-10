/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificadorfaixaetaria;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class VerificadorFaixaEtaria {

    public static void main(String[] args) {
       try {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        
        int faixaEtaria = 0;
        
        // Determinar a faixa etária sem usar &&
        if (idade >= 0) {
            if (idade <= 12) {
                faixaEtaria = 1;
            }
        }
        if (idade >= 13) {
            if (idade <= 17) {
                faixaEtaria = 2;
            }
        }
        if (idade >= 18) {
            if (idade <= 59) {
                faixaEtaria = 3;
            }
        }
        if (idade >= 60) {
            faixaEtaria = 4;
        }
        
        // Usar switch para exibir a faixa correspondente
        switch (faixaEtaria) {
            case 1 -> System.out.println("Criança (0-12 anos)");
            case 2 -> System.out.println("Adolescente (13-17 anos)");
            case 3 -> System.out.println("Adulto (18-59 anos)");
            case 4 -> System.out.println("Idoso (60+ anos)");
            default -> System.out.println("Idade inválida! Digite uma idade positiva.");
        }
        
    } catch (Exception e) {
        System.out.println("Valor de entrada inválido, use novamente nosso algoritmo!");
    } finally {
        System.out.println("Classificação de faixa etária finalizada.");
        
       
    }

    }
}
