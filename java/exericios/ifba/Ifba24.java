/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa que leia três números e mostre o maior entre eles.
 *
 * @author jmario
 */
public class Ifba24 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the 1th number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the 2th number"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the 3th number"));
        int maior = (int) Math.max(num3, Math.max(num1, num2));
        JOptionPane.showMessageDialog(null, "Max number: " + maior);
    }
}
