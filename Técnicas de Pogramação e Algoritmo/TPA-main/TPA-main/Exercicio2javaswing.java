/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio2javaswing;

/**
 *
 * @author pedro
 */
import javax.swing.JOptionPane;

public class Exercicio2javaswing {

    public static void main(String[] args) {
//Declaração de variaveis        
        double Media1 = 8.9;
        double Media2 = 7;

//Operação
        double Resultado = (Media1 + Media2) / 2;

//Exibir resultado
        JOptionPane.showMessageDialog(null, "A pimeira média é: " + Resultado);

        double Media3 = 4;
        double Media4 = 5;
        double Media5 = 6;
        
        double Resultado2 = (Media3 + Media4 + Media5)/3;
        
        JOptionPane.showMessageDialog(null, "A segunda média é: " + Resultado2);
        
        double SomaDasMedias = Resultado + Resultado2;
        JOptionPane.showMessageDialog(null, "A soma das médias é: " + SomaDasMedias);
        
        double Resultado3 = SomaDasMedias/2;
        
        JOptionPane.showMessageDialog(null, "A média das médias é: " + Resultado3);
        
        
        

    }
}
