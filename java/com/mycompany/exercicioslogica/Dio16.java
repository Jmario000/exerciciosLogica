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
public class Dio16 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try {
            float a = Float.parseFloat(JOptionPane.showInputDialog("Valor do lado A: "));
            float b = Float.parseFloat(JOptionPane.showInputDialog("Valor do lado B: "));
            float c = Float.parseFloat(JOptionPane.showInputDialog("Valor do lado C: "));
            StringBuilder sb = new StringBuilder();

            if (a + b < c) {
                throw new Exception("Lados inválidos!");
            } else if (a + c < b) {
                throw new Exception("Lados inválidos!");
            } else if (b + c < a) {
                throw new Exception("Lados inválidos!");
            } else {
                sb.append("Triângulo válido!").append("\n");
            }

            if (a == b && a == c && b == c) {
                sb.append("O triângulo é equilatero.");
            } else if (a == b || b == c || a == c) {
                sb.append("O triângulo é isóceles.");
            } else {
                sb.append("O triângulo é escaleno.");
            }
            JOptionPane.showMessageDialog(null, sb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
}
