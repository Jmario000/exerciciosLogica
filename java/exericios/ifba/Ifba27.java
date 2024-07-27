/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa que leia 3 números e calcule a média ponderada entre
 * eles. Considere que o maior número recebe peso 5 e os outros dois recebem
 * peso 2,5
 *
 * @author jmario
 */
public class Ifba27 {

    public static void main(String[] args) {

        float num1 = Float.parseFloat(JOptionPane.showInputDialog("1th number:"));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("2th number:"));
        float num3 = Float.parseFloat(JOptionPane.showInputDialog("3th number:"));
        float max1 = Math.max(num3, Math.max(num1, num2));
        float mediaPonderada = 0f;

        if (max1 == num1) {
            mediaPonderada = calculoMediaPonderada(num1, num2, num3);
        } else if (max1 == num2) {
            mediaPonderada = calculoMediaPonderada(num2, num1, num3);
        } else {
            mediaPonderada = calculoMediaPonderada(num3, num2, num1);
        }

        JOptionPane.showMessageDialog(null, "Média ponderada = " + String.format("%.3f", mediaPonderada));
    }

    protected static float calculoMediaPonderada(float valor1, float valor2, float valor3) {
        return (valor1 * 5f + valor2 * 2.5f + valor3 * 2.5f) / (10f);
    }
}
