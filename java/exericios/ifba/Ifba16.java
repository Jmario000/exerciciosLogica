/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa para gerar o invertido de um número com três algarismos
 * (exemplo: o invertido de 498 é 894).
 *
 * @author jmario
 */
public class Ifba16 {

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number with three algarisms"));
        JOptionPane.showMessageDialog(null, "Inverted Number: " + invertedNumber(number));
    }

    private static String invertedNumber(int number) {
        String numberString = String.valueOf(number);
        String numeroInvertido = new StringBuilder(numberString).reverse().toString();
        return numeroInvertido;
    }
}
