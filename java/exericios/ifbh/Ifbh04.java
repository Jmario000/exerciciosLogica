/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifbh;

import javax.swing.JOptionPane;

/**
 *Dado os três lados de um triângulo determinar o perímetro do mesmo.
 * @author jmario
 */
public class Ifbh04 {

    public static void main(String[] args) {
        double lados[] = new double[3], perimeter = 0;
        for (int i = 0; i < lados.length; i++) {
            lados[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado " + (i + 1)));
            perimeter += lados[i];
        }
        JOptionPane.showMessageDialog(null, "The perimeter of the triangle is: " + perimeter);
    }
}
