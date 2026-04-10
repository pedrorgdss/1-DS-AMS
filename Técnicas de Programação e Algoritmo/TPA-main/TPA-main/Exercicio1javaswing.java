/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1javaswing;

/**
 *
 * @author FATEC ZONA LESTE
 */

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exercicio1javaswing {

    public static void main(String[] args) {
        //publicação Scanner
        Scanner scanner = new Scanner (System.in); 
      

//solicitação

//* EXERCICIO 1
      int Idade = 0;
      Idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
      int IdadeEmDias = Idade * 365;
      JOptionPane.showMessageDialog(null, "Sua idade em dias é: " + IdadeEmDias);

    }
}
