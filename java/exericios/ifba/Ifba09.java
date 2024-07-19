/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Faça um algoritmo que calcule e apresente o valor do volume de uma lata de
 * óleo, dado seu raio e sua altura.
 *
 * @author jmario
 */
public class Ifba09 {

    public static void main(String[] args) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Qual o raio da lata?"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a altura da lata?"));
        double volumeLata = Math.PI * Math.pow(raio, 2) * altura;
        JOptionPane.showMessageDialog(null, "O volume da lata de óleo é = " + String.format("%.2f", volumeLata)+"cm³");
    }
}
