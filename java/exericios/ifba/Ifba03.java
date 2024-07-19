/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 *Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma.
 * @author jmario
 */
public class Ifba03 {

    public static void main(String[] args) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Qual é o raio da circunferencia?"));
        double area = Math.PI * Math.pow(raio, 2);
        double perimeter = 2 * Math.PI * raio;
        JOptionPane.showMessageDialog(null, "Circunference area: " + String.format("%.2f", area) + "\nCircunference perimeter: " + String.format("%.2f", perimeter));
    }
}
