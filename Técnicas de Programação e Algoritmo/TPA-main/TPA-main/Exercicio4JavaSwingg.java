/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4javaswingg;

/**
 *
 * @author pedro
 */
import javax.swing.JOptionPane;
public class Exercicio4JavaSwingg {

    public static void main(String[] args) {
           double ipi = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do IPI:"));

        // Dados da peça 1
        String cod1 = JOptionPane.showInputDialog("Digite o código da peça 1:");
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário da peça 1:"));
        int quant1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da peça 1:"));

        // Dados da peça 2
        String cod2 = JOptionPane.showInputDialog("Digite o código da peça 2:");
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário da peça 2:"));
        int quant2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da peça 2:"));

        // Cálculo
        double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        // Resultado
        JOptionPane.showMessageDialog(null, String.format("Total a pagar (com IPI): R$ %.2f", total));      
    }
}
