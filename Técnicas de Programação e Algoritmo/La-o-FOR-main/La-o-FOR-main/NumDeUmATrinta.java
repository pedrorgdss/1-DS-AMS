/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numdeumatrinta;

/**
 *
 * @author Pedro
 */
import java.util.Scanner;
public class NumDeUmATrinta {

    public static void main(String[] args) {
       
        for(int multiplo = 1; multiplo <=30; multiplo++){
        if(multiplo % 4 == 0){
            continue;
        }
        System.out.println(multiplo); 
        }
    }
}
