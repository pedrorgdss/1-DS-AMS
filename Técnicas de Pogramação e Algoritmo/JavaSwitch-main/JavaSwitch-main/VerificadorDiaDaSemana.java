/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.verificadordiadasemana;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class VerificadorDiaDaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o dia: ");
        int Dia = scanner.nextInt();

        //verificar se a fruta com switch case
        switch (Dia) { //nos parenteses coloca oq ele vai analisar
            case 1:
                System.out.println("Domingo ");
                break;
            case 2:
                System.out.println("Segunda-Feira ");
                break;
            case 3:
                System.out.println("Terça-Feira ");
                break;
            case 4:
                System.out.println("Quarta-Feira ");
                break;
            case 5:
                System.out.println("Quinta-Feira ");
                break;
            case 6:
                System.out.println("Sexta-Feira ");
                break;
            case 7:
                System.out.println("Sábado ");
                break;
//default é para qundo o programa verificar as cases e nao bater com o número digitado, vai exibir uma mensagem para reiniciar
            default:
                System.out.print("DIA INVÁLIDO");
        }

    }
}
