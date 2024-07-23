/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa que leia um número e imprima se este número é ou não par.
 *
 * @author jmario
 */
public class Ifba23 {

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        if (number % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par.");
        } else {
            JOptionPane.showMessageDialog(null, "Seu número é ímpar.");
        }
    }
}
