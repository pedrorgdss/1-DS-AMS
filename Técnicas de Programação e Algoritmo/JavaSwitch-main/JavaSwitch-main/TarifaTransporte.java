/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarifatransporte;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class TarifaTransporte {

    public static void main(String[] args) {
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
}
