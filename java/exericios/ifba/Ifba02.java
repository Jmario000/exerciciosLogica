/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo.
 *
 * @author jmario
 */
public class Ifba02 {

    public static void main(String[] args) {
        float side = Float.parseFloat(JOptionPane.showInputDialog("Enter the value of the side of the square:"));
        float area = side * side;
        float perimeter = side * 4;
        JOptionPane.showMessageDialog(null, "Area of the square: " + area + "\nPerimeter of the square: " + perimeter);
    }
}
