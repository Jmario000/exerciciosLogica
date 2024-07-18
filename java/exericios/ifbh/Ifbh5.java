/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifbh;

import javax.swing.JOptionPane;

/**
 *Ler um número inteiro e exibir o seu sucessor.
 * @author jmario
 */
public class Ifbh5 {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an Integer number: "));
        JOptionPane.showMessageDialog(null, "Successor of the number: " + (num + 1));
    }
}
