/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.contandomeias;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class ContandoMeias {

    public static void main(String[] args) throws InterruptedException {
        Scanner InUser = new Scanner(System.in);

        int[] QuantasMeias = {2, 4, 1, 3, 5};
        int ValorTotalDasMeias = 0;

        for (int i = 0; i < QuantasMeias.length; i++) {
              Thread.sleep(2000);
            System.out.printf("Gaveta %d: %d meias\n", (i + 1), QuantasMeias[i]);
            ValorTotalDasMeias += QuantasMeias[i];

        }
        System.out.printf("\nTotal de meias: %d\n", ValorTotalDasMeias);
    }

}
