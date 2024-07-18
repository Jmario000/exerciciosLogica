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
public class Dio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();

        System.out.println("Antecessor do número: " + (A - 1) + "\nSucessor do número: " + (A + 1));
    }
}
