/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escolhafruta;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
public class EscolhaFruta {

    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da sua fruta: ");
        int NumFruta = scanner.nextInt();

        //verificar se a fruta com switch case
        switch (NumFruta) { //nos parenteses coloca oq ele vai analisar
            case 1:
                System.out.println("Delicia, é Maçã ");
                break;
            case 2:
                System.out.println("Ehhhh, Banana ");
                break;
            case 3:
                System.out.println("A melhor, Laranjaa");
                break;
//default é para qundo o programa verificar as cases e nao bater com o número digitado, vai exibir uma mensagem para reiniciar
            default:
                System.out.print("FRUTA INVÁLIDA");

        }
    }
}
