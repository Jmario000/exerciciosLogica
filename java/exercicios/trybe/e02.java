/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.trybe;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Desenvolva um algoritmo que recebe dois números inteiros, executa as quatro
 * operação matemáticas básicas nestes números (soma, subtração, multiplicação e
 * divisão) e exibe os resultados no console.
 *
 * @author jmario
 */
public class e02 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int number = Integer.parseInt(JOptionPane.showInputDialog("Enter the " + (i + 1) + "th number"));
            list.add(number);
        }
        int number1 = list.get(0);
        int number2 = list.get(1);
        int soma = number1 + number2;
        int subtracao = number1 - number2;
        int mult = number1 * number2;
        int divisao = 0;

        if (number1 != 0 && number2 != 0) {
            divisao = number1 / number2;
        }
        JOptionPane.showMessageDialog(null, "Soma = " + soma + "\nSubtração = " + subtracao + "\nMultiplicação = " + mult + "\nDivisão = "
                + divisao);
    }
}
