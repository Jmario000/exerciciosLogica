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
public class Dio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o salário mínimo: ");
        float salarioMin = input.nextFloat();
        System.out.print("Digite o seu salário: ");
        float salarioUsuario = input.nextFloat();

        float qntdSalarios = salarioUsuario / salarioMin;

        System.out.println("Você recebe: " + String.format("%.1f", qntdSalarios) + " salários mínimos");
    }
}
