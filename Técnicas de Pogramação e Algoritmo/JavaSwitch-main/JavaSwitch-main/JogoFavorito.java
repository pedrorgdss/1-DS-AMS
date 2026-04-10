/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogofavorito;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class JogoFavorito {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do seu jogo: ");
        int JogoCerto = scanner.nextInt();

        //verificar se a fruta com switch case
        switch (JogoCerto) { //nos parenteses coloca oq ele vai analisar
            case 1:
                System.out.println("É Minecraft ");
                break;
            case 2:
                System.out.println("É FIFA");
                break;
            case 3:
                System.out.println("É Fortnite");
                break;
            case 4:
                System.out.println("É Call of Duty");
                break;
            case 5:
                System.out.println("É The Sims");
                break;
//default é para qundo o programa verificar as cases e nao bater com o número digitado, vai exibir uma mensagem para reiniciar
            default:
                System.out.print("JOGO NÃO ENCONTRADO");

        }
    }
}
