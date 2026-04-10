/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3javaswing;

/**
 *
 * @author pedro
 */
import javax.swing.JOptionPane;
public class Exercicio3javaswing {

    public static void main(String[] args) {
        
        double Saldo = 0;
        Saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite seu saldo: "));
        
        //operação
        
        double SaldoReajustado = Saldo * 1.01;
        
        JOptionPane.showMessageDialog(null, "Seu saldo com o reajuste de 1% é igual a " + SaldoReajustado);
        
    }
}
