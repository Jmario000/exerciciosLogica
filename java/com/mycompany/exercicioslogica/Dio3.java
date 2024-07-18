/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioslogica;

import java.util.Scanner;

/**
 *
 * @author jmario
 */
public class Dio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();
        int c = 0;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println("Resultado do cálculo = " + c);
    }
}
