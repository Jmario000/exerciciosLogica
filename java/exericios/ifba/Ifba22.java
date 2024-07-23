/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa que leia um número e exiba o seu módulo.
 *
 * @author jmario
 */
public class Ifba22 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        JOptionPane.showMessageDialog(null, "Number module: " + Math.abs(number));
    }
}
