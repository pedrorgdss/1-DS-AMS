/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.servicobancario;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class ServicoBancario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double SeuSaldo = 1000;
            
            
            System.out.println("Escolha uma opção a seguir: ");
            System.out.println("1 - consultar saldo");
            System.out.println("2 - sacar dinheiro");
            System.out.println("3 - depositar dinheiro");
            System.out.println("4 - encerrar atendimento");
            
            int OpcaoNoBanco = scanner.nextInt();
            
            switch (OpcaoNoBanco) {
                case 1 -> 
                    System.out.println("SEU SALDO ATUAL É DE: R$ " + SeuSaldo);
                
                case 2 -> {
                    System.out.println("Qual o valor do saque? ");
                    double ValorDoSaque = scanner.nextDouble();
                    if (ValorDoSaque > SeuSaldo) {
                        System.out.println("Saque indisponível - Saldo insuficiente!");
                    } else {
                        SeuSaldo -= ValorDoSaque;
                        System.out.println("Saque realizado! Seu novo saldo é de: R$ " + SeuSaldo);
                    }
                }
                
                case 3 -> {
                    System.out.println("Qual o valor do depósito? ");
                    double ValorDoDeposito = scanner.nextDouble();
                    SeuSaldo += ValorDoDeposito;
                    System.out.println("Depósito realizado! Seu novo saldo é de: R$ " + SeuSaldo);
                }
                
                case 4 -> 
                    System.out.println("Atendimento encerrado.");
                
                default -> 
                    System.out.println("Opção inválida!");
            }
            
        } catch (Exception e) {
            System.out.println("Valor de entrada inválido, use novamente nosso algoritmo!");
    }}
}
