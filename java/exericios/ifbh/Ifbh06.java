/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifbh;

import javax.swing.JOptionPane;

/**
 * Ler dois números inteiros e exibir o quociente e o resto da divisão inteira
 * entre eles.
 *
 * @author jmario
 */
public class Ifbh06 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the 1th number:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the 2th number:"));
        int quotient = num1 / num2;
        int rest = num1 % num2;
        JOptionPane.showMessageDialog(null, "The division quotient is = " + quotient + "\nThe rest of division is = " + rest);
    }
}
