/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifbh;

import javax.swing.JOptionPane;

/**
 * Dado que a fórmula para conversão de Fahrenheit para Celsius é C = 5/9 (F –
 * 32), leu um valor de temperatura em Fahrenheit e exibi-lo em Celsius
 *
 * @author jmario
 */
public class Ifbh08 {

    public static void main(String[] args) {
        float temperaturaFah = Float.parseFloat(JOptionPane.showInputDialog("Qual a temperatura?"));
        float convercaoCelsius = 5f / 9f * (temperaturaFah - 32);
        JOptionPane.showMessageDialog(null, "A temperatura em Celsius é: " + String.format("%.1f", convercaoCelsius) + "°");
    }
}
