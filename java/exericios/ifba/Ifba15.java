/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Num dia de sol, você deseja medir a altura de um prédio, porém, a trena não é
 * suficientemente longa. Assumindo que seja possível medir sua sombra e a do
 * prédio no chão, e que você lembre da sua altura, faça um programa para ler os
 * dados necessários e calcular a altura do prédio.
 *
 * @author jmario
 */
public class Ifba15 {

    public static void main(String[] args) {
        float alturaPessoa, sombraPredio, sombraPessoa, alturaPredio;
        alturaPessoa = Float.parseFloat(JOptionPane.showInputDialog("Qual a altura da pessoa?"));
        sombraPessoa = Float.parseFloat(JOptionPane.showInputDialog("Qual o comprimento da sombra da pessoa?"));
        sombraPredio = Float.parseFloat(JOptionPane.showInputDialog("Qual o comprimento da sombra do prédio?"));
        alturaPredio = (alturaPessoa * sombraPredio) / sombraPessoa;
        JOptionPane.showMessageDialog(null, "Altura do prédio = " + String.format("%.2f", alturaPredio) + "m");
    }
}
