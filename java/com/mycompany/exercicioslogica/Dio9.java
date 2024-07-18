/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioslogica;

import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author jmario
 */
public class Dio9 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try {
            float altura = Float.parseFloat(JOptionPane.showInputDialog("Qual a sua altura?"));
            float peso = Float.parseFloat(JOptionPane.showInputDialog("Qual o seu peso?"));
            final float IMC = peso / (float) (Math.pow(altura, 2));
            String resultado = "";
            if (IMC < 18.6) {
                resultado = "Abaixo do peso";
            } else if (IMC < 25.0) {
                resultado = "Peso ideal(parabéns)";
            } else if (IMC < 30.0) {
                resultado = "Levemente acima do peso";
            } else if (IMC < 35.0) {
                resultado = "Obesidade grau I";
            } else if (IMC < 40) {
                resultado = "Obesidade grau II(severa)";
            } else {
                resultado = "Obesidade grau III(mórbida)";
            }
            JOptionPane.showMessageDialog(null, "IMC = " + String.format("%.2f", IMC) + "\n" + resultado);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
