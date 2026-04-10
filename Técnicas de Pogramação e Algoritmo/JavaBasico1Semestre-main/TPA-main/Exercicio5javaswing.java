/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio5javaswing;

/**
 *
 * @author pedro
 */
import javax.swing.JOptionPane;
public class Exercicio5javaswing {

    public static void main(String[] args) {
       double salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário mínimo:"));
        double salarioUsuario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do usuário:"));

        double quantidadeSalarios = salarioUsuario / salarioMinimo;

        JOptionPane.showMessageDialog(null, "O usuário ganha " + quantidadeSalarios + " salários mínimos.");
    }
}
