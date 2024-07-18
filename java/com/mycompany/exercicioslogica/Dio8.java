/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioslogica;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jmario
 */
public class Dio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valores = new int[3];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = input.nextInt();
        }
        Arrays.sort(valores);
        System.out.print("Valores em ordem decrescente: ");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.print(valores[i] + "|");
        }
    }
}
