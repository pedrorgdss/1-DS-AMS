package com.mycompany.switchcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        exercicio1();  
        exercicio2();  
        exercicio3();
    }

    // EXERCÍCIO 1
    public static void exercicio1() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha seu transporte: ");
            System.out.println("1 - ônibus urbano");
            System.out.println("2 - metrô");
            System.out.println("3 - trem intermunicipal");
            System.out.println("4 - ônibus rodoviário");
            int QualTransporte = scanner.nextInt();

            System.out.println("Selecione a quantidade que você vai querer");
            int quantaspassagens = scanner.nextInt();

            double totaldaspassagens = switch (QualTransporte) {
                case 1 -> quantaspassagens * 4.40;
                case 2 -> quantaspassagens * 5.00;
                case 3 -> quantaspassagens * 6.50;
                case 4 -> quantaspassagens * 12.00;
                default -> -1;
            };

            if (totaldaspassagens == -1) {
                System.out.println("Opção inválida!");
            } else {
                System.out.println("Valor total da compra: R$ " + totaldaspassagens);
            }

        } catch (Exception e) {
            System.out.println("Valor de entrada inválido, use novamente nosso algoritmo!");
        }
    }

    // EXERCÍCIO 2 - CORRIGIDO
    public static void exercicio2() {
        try {
            double SeuSaldo = 1000;
            Scanner scanner = new Scanner(System.in);
            
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
        }
    }

    
   // EXERCÍCIO 3
public static void exercicio3() {
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