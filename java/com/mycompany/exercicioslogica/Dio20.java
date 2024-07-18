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
public class Dio20 {

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        String aux = "";
        for (int i = 0; i <= 10; i++) {
            int mult = number * i;
            aux += number + " * " + i + " = " + mult + "\n";
        }
        JOptionPane.showMessageDialog(null, "Tabuada de " + number + ": \n" + aux);
    }
}
