/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioslogica;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author jmario
 */
public class Dio12 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float value = Float.parseFloat(JOptionPane.showInputDialog("How much is the product?"));
        String[] options = {"1 - À vista dinheiro/pix", "2 - À vista cŕedito", "3 - Parcelado em duas vezes", "4 - Parcelado em três vezes ou mais"};
        String escolha = (String) JOptionPane.showInputDialog(null, "Select an option:", "Options", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        switch (escolha) {
            case "1 - À vista dinheiro/pix":
                float valorTotal = value - (value * 0.15f);
                JOptionPane.showMessageDialog(null, "Value to be paid: $" + String.format("%.2f", valorTotal));
                break;
            case "2 - À vista cŕedito":
                valorTotal = value - (value * 0.10f);
                JOptionPane.showMessageDialog(null, "Value to be paid: $" + String.format("%.2f", valorTotal));
                break;
            case "3 - Parcelado em duas vezes":
                JOptionPane.showMessageDialog(null, "Amount to be paid: $" + value);
                break;
            case "4 - Parcelado em três vezes ou mais":
                valorTotal = value + (value * 0.10f);
                JOptionPane.showMessageDialog(null, "Amount to be paid: $" + String.format("%.2f", valorTotal));
                break;
        }
    }
}
