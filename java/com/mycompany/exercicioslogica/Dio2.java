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
public class Dio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int num = input.nextInt();

        if (num > 0 && num % 2 == 0) {
            System.out.println("O número digitado é positivo e par.");
        } else if (num < 0 && num % 2 == 0) {
            System.out.println("O número digitado é negativo e par.");
        } else if (num > 0 && num % 2 != 0) {
            System.out.println("O número digitado é positivo e ímpar.");
        } else if (num % 2 != 0) {
            System.out.println("O número digitado é negativo e ímpar.");
        } else {
            System.out.println("O número digitado foi o zero.");
        }
    }
}
