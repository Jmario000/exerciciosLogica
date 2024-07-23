/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa que leia um número e exiba se ele é positivo ou negativo.
 *
 * @author jmario
 */
public class Ifba21 {

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        if (number < 0) {
            JOptionPane.showMessageDialog(null, "It's a negative number");
        } else if (number > 0) {
            JOptionPane.showMessageDialog(null, "It's a postive number");
        } else {
            JOptionPane.showMessageDialog(null, "Elemento neutro.");
        }
    }
}
