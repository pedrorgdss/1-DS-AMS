package com.mycompany.produtosdelimpeza;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class ProdutosDeLimpeza {

    public static void main(String[] args) throws InterruptedException {
         double[] ArraysDePreco = {5.25, 4.00, 3.70, 7.50};
        double TotalDaCompra = 0;

        System.out.println("Preços dos produtos de limpeza:");

        for (int i = 0; i < ArraysDePreco.length; i++) {
            Thread.sleep(2000); 
            System.out.printf("Produto %d: R$ %.2f\n", (i + 1), ArraysDePreco[i]);
            TotalDaCompra += ArraysDePreco  [i];
        }

        System.out.printf("\nValor total da compra: R$ %.2f\n", TotalDaCompra);
    }
}