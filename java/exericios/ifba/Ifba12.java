/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Faça um algoritmo que transforme uma velocidade fornecida em m/s pelo usuário
 * para Km/h. Para tal, multiplique o valor em m/s por 3,6.
 *
 * @author jmario
 */
public class Ifba12 {

    public static void main(String[] args) {
        float metroSeg = Float.parseFloat(JOptionPane.showInputDialog("Digite uma velocidade em m/s"));
        float kmHora = metroSeg * 3.6f;
        JOptionPane.showMessageDialog(null, "Valor em Km/h = " + String.format("%.2f", kmHora));
    }
}
