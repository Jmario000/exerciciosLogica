/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifbh;

import javax.swing.JOptionPane;

/**
 * Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o
 * seu perímetro
 *
 * @author jmario
 */
public class Ifbh1 {

    public static void main(String[] args) {
        float base = Float.parseFloat(JOptionPane.showInputDialog("Enter the base of the rectangle:"));
        float height = Float.parseFloat(JOptionPane.showInputDialog("Enter the height of the rectangle:"));
        float area = base * height;
        float perimeter = 2 * base + 2 * height;
        JOptionPane.showMessageDialog(null, "Area of the rectangle: " + area + "\nPerimeter of the rectangle: " + String.format("%.1f", perimeter));
    }
}
