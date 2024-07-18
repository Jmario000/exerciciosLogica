/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicioslogica;

import java.util.Scanner;

/**
 *
 * @author jmario
 */
public class Dio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Valor de A: ");
        float a = input.nextFloat();
        System.out.print("Valor de B: ");
        float b = input.nextFloat();
        System.out.print("Valor de C: ");
        float c = input.nextFloat();
        float soma = a + b;
        System.out.print("Soma de A + B = " + soma);

        if (soma < c) {
            System.out.println("\nValor de C é maior que a soma.");
        } else if (soma > c) {
            System.out.println("\nA soma é maior que o valor de C.");
        } else {
            System.out.println("\nO valor da soma é igual ao de C.");
        }
    }
}
