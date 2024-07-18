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
public class Dio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final float REAJUSTE = 0.05f;
        System.out.print("Digite um valor: ");
        float valor = input.nextFloat();
        float valorFinal = valor + valor * REAJUSTE;
        System.out.println("Valor com o reajuste de 5% = " + String.format("%.2f", valorFinal));
    }
}
