/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioslogica;

import static java.lang.Boolean.*;
import java.util.Scanner;

/**
 *
 * @author jmario
 */
public class Dio7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("2 + 2 = 4? (s/n) ");
        boolean valor1 = input.hasNext("s");
        input.next();
        System.out.print("O céu é azul? (s/n) ");
        boolean valor2 = input.hasNext("s");

        if (valor1 == TRUE && valor2 == TRUE) {
            System.out.println("Ambos os valores são verdadeiros.");
        } else if (valor1 == FALSE && valor2 == FALSE) {
            System.out.println("Ambos os valores são falsos.");
        } else {
            System.out.println("Um dos valores é falso.");
        }
    }
}
