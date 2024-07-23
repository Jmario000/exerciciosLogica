/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa que permute o valor de duas variáveis inteiras.
 *
 * @author jmario
 */
public class Ifba18 {

    public static void main(String[] args) {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number:"));
        int temp = number1;
        number1 = number2;
        number2 = temp;
        JOptionPane.showMessageDialog(null, "Valores após a permutação:\nNumber 1 = " + number1 + "\nNumber 2 =  " + number2);
    }
}
