package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa que leia 3 valores e escreva a soma dos 2 maiores.
 *
 * @author jmario
 */
public class Ifba26 {

    public static void main(String[] args) {
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("1th number:"));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("2th number:"));
        float num3 = Float.parseFloat(JOptionPane.showInputDialog("3th number:"));
        float max1 = Math.max(num3, Math.max(num1, num2));
        float max2 = 0;

        if (max1 == num1) {
            max2 = Math.max(num2, num3);
        } else if (max1 == num2) {
            max2 = Math.max(num1, num3);
        } else {
            max2 = Math.max(num1, num2);
        }

        JOptionPane.showMessageDialog(null, max1 + "+" + max2 + " = " + (max1 + max2));
    }
}
