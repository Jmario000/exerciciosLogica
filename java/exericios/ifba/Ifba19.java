/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa que calcule a raiz de uma equação do primeiro grau.
 *
 * @author jmario
 */
public class Ifba19 {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "O valor de A não pode ser zero");
        } else {
            double x = (double) -(b / a);
            JOptionPane.showMessageDialog(null, "Raiz da equação = " + String.format("%.1f", x));
        }
    }
}
