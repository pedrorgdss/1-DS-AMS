package com.mycompany.saborsuco;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class SaborSuco {

    public static void main(String[] args) throws InterruptedException {
        Scanner InUser = new Scanner(System.in);
        String[] SaboresDeSuco = new String[3];
 
        System.out.println("Insira 3 sabores de suco que você mais gosta");

        for (int i = 0; i < SaboresDeSuco.length; i++) {
            System.out.printf("Digite o sabor %d: ", (i + 1));
            SaboresDeSuco[i] = InUser.nextLine();
        }

        System.out.println("Sabores inseridos: ");
        for (int i = 0; i < SaboresDeSuco.length; i++) {
            Thread.sleep(1000); // Timer de 2 segundos
            System.out.printf("%d. %s\n", (i + 1), SaboresDeSuco[i]);
        }

        InUser.close();
    }
}