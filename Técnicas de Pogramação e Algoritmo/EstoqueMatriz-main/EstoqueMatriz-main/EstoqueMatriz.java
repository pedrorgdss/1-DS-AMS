/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.estoquematriz;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class EstoqueMatriz {

    public static void main(String[] args) {
        Scanner InUser = new Scanner(System.in);

        String[][] Estoque = new String[3][4];

        double somaGeral = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Produto " + (i + 1));

            System.out.print("Nome do produto: ");
            String Nome = InUser.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = InUser.nextInt();
            InUser.nextLine(); // limpar o ENTER automaticamente

            //pra caLcular o preço
            System.out.print("Preço: ");
            double preco = InUser.nextDouble();
            InUser.nextLine(); // limpar o ENTER
            double total = quantidade * preco;

            somaGeral = somaGeral + total;

            //pra colocar nas colunas usamos ""funçoes"" da matriz como aqueles do array tipo .add ou lowercase
            Estoque[i][0] = Nome;
            Estoque[i][1] = String.valueOf(quantidade);
            Estoque[i][2] = String.valueOf(preco);
            Estoque[i][3] = String.valueOf(total);
        }

//mostrr em formato de tabela
        System.out.printf("| %-15s | %-12s | %-10s | %-12s |%n", "Produto", "Quantidade", "Preço", "Total");
        for (int i = 0; i < 3; i++) {
            System.out.printf("| %-15s | %-12s | %-10s | %-12s |%n",
                    Estoque[i][0],
                    Estoque[i][1],
                    Estoque[i][2],
                    Estoque[i][3]);

        }
        System.out.println("\nTotal geral da compra: " + somaGeral);

    }
}
