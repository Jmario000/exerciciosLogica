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
public class Dio14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Valor A: ");
        float value1 = input.nextFloat();
        System.out.print("Valor B: ");
        float value2 = input.nextFloat();
        float temp;
        temp = value1;
        value1 = value2;
        value2 = temp;
        System.out.print("Valor de A: " + value1 + "\nValor de B: " + value2);

    }
}
