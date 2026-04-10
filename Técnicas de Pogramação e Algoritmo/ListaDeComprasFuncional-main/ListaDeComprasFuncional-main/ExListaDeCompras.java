/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exlistadecompras;

/**
 *
 * @author Pedro
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ExListaDeCompras {

    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        int opcao;
        
        System.out.println("=== LISTA DE COMPRAS ===");
        
        // DO-WHILE principal
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Ver lista");
            System.out.println("3 - Remover item");
            System.out.println("4 - Limpar lista");
            System.out.println("5 - Sair");
            System.out.printf("Opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer
            
            // SWITCH CASE para as opções
            switch (opcao) {
                case 1:
                    // WHILE para adicionar vários itens
                    char continuar;
                    do {
                        System.out.printf("Digite o item para adicionar: ");
                        String item = scanner.nextLine();
                        lista.add(item);
                        System.out.printf("Item '%s' adicionado!\n", item);
                        
                        System.out.printf("Adicionar outro item? (s/n): ");
                        continuar = scanner.nextLine().charAt(0);
                    } while (continuar == 's' || continuar == 'S');
                    break;
                    
                case 2:
                    // FOR para mostrar a lista
                    System.out.println("\n--- SUA LISTA ---");
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia!");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.printf("%d - %s\n", i + 1, lista.get(i));
                        }
                    }
                    break;
                    
                case 3:
                    // IF ELSE para remover item
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia! Não há o que remover.");
                    } else {
                        System.out.println("\n--- REMOVER ITEM ---");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.printf("%d - %s\n", i + 1, lista.get(i));
                        }
                        System.out.printf("Digite o número do item para remover: ");
                        int numero = scanner.nextInt();
                        scanner.nextLine();
                        
                        if (numero >= 1 && numero <= lista.size()) {
                            String itemRemovido = lista.remove(numero - 1);
                            System.out.printf("Item '%s' removido!\n", itemRemovido);
                        } else {
                            System.out.println("Número inválido!");
                        }
                    }
                    break;
                    
                case 4:
                    // IF ELSE para limpar lista
                    if (lista.isEmpty()) {
                        System.out.println("Lista já está vazia!");
                    } else {
                        lista.clear();
                        System.out.println("Lista limpa!");
                    }
                    break;
                    
                case 5:
                    System.out.println("Saindo... Até logo!");
                    break;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while (opcao != 5); // DO-WHILE continua até escolher sair
        
        scanner.close();
    }
    }
