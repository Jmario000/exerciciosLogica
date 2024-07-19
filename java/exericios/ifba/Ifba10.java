/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Converter um inteiro informado menor que 32 para sua representação em binário
 *
 * @author jmario
 */
public class Ifba10 {

    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número positivo menor que 32:"));
        if (number == 0) {
            JOptionPane.showMessageDialog(null, "Número em binário = " + number);
            return;
        } else if (number >= 32) {
            while (number >= 32) {
                number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo e menor que 32."));
            }
        }
        List<Integer> binarios = new ArrayList<>();

        while (number > 0) {
            int resto = number % 2;
            binarios.add(resto);
            number = number / 2;
        }
        Collections.reverse(binarios);
        String resultadoBinario = "";
        for (int aux : binarios) {
            resultadoBinario += aux;
        }
        JOptionPane.showMessageDialog(null, "Número em binários: " + resultadoBinario);
    }
}
