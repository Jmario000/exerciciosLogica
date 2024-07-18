/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioslogica;

import javax.swing.JOptionPane;

/**
 *
 * @author jmario
 */
public class Dio22 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a value: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another value: "));
        JOptionPane.showMessageDialog(null, "Quociente: " + (num1 / num2) + "\nResto da divisão: " + (num1 % num2));

    }
}
