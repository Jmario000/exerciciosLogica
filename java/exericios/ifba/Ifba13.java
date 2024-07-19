/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Um circuito elétrico é composto de duas resistências R1 e R2 em paralelo, e
 * ambas em sequência de uma resistência R3. Faça um algoritmo para calcular a
 * resistência equivalente desse circuito.
 *
 * @author jmario
 */
public class Ifba13 {

    public static void main(String[] args) {
        float r1 = Float.parseFloat(JOptionPane.showInputDialog("R1 value:"));
        float r2 = Float.parseFloat(JOptionPane.showInputDialog("R2 value:"));
        float r3 = Float.parseFloat(JOptionPane.showInputDialog("R3 value:"));
        float resistenciaEquivalente = ((r1 * r2) / (r1 + r2)) + r3;
        JOptionPane.showMessageDialog(null, "Equivalent Resistance = " + String.format("%.1f", resistenciaEquivalente) + "Ω");
    }
}
