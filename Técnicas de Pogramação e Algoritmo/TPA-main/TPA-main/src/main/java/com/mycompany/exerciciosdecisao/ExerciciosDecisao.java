/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exerciciosdecisao;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class ExerciciosDecisao {

    public static void main(String[] args) {

        //PROGRAMA QUE IDENTIFICA SE VOCÊ É MAIOR OU MENOR DE IDADE
        double idade = 0;
        idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade: "));

        //operação para calcular se é menor de idade
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade");
        }
        if (idade < 18) {
            JOptionPane.showMessageDialog(null, "Você é menor de idade ");

        }

        //PROGRAMA QUE IDENTIFICA SE O NÚMERO É NEGATIVO OU POSITIVO
        int num = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("digite um número "));

        //operação para ver se o numero é positivo ou negativo
        if (num > 0) {
            JOptionPane.showMessageDialog(null, num + " é positivo");
        }
        if (num < 0) {
            JOptionPane.showMessageDialog(null, num + " é negativo");
        }

        //PROGRAMA QUE CALCULA MÉDIA E FALA SE FOI APROVADO OU NÃO
        double n1 = 0, n2 = 0, n3 = 0;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite sua primeira nota: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite sua segunda nota: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("digite sua terceira nota: "));

        //operação:
        double nota = (n1 + n2 + n3) / 3;
        if (nota >= 7) {
            JOptionPane.showMessageDialog(null, "sua média é " + nota + " e você foi APROVADO");
        } else {
            JOptionPane.showMessageDialog(null, "sua média é " + nota + " e você foi REPROVADO");
        }

        //PROGRAMA QUE COMPARA NÚMEROS
        double num1 = 0, num2 = 0;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("digite um número "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("digite outro número "));

        //operação
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Os números são IGUAIS.");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são DIFERENTES.");
        }

        //PROGRAMA QUE POR MEIO DA SUA IDADE, IDENTIFICA SE VOCE PAGA ENTRADA INFANTIL OU INTEIRA/NORMAL
        double idadeE = 0;
        idadeE = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade para sabermos se paga a entrada infantil ou normal "));

        //Condição
        if (idadeE <= 12) {
            JOptionPane.showMessageDialog(null, "Entrada infantil.");
        } else {
            JOptionPane.showMessageDialog(null, "Entrada normal.");
        }

        //PROGRAMA QUE VE SE O NÚMERO É PERMITIDO
        double numero = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("tente acertar o número PROIBIDO "));

        //Operação
        if (numero != 211) {
            JOptionPane.showMessageDialog(null, "Número normal");
        } else {
            JOptionPane.showMessageDialog(null, "Número proibido!");
        }

    }
}
