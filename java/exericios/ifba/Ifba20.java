/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Uma loja vende seus produtos no sistema entrada mais duas prestações, sendo a
 * entrada maior do que ou igual às duas prestações, as quais devem ser iguais,
 * inteiras e as maiores possíveis. Por exemplo, se o valor da mercadoria for R$
 * 270,00, a entrada e as duas prestações são iguais a R$ 90,00; se o valor da
 * mercadoria for R$ 302,75, a entrada é de R$ 102,75 e as duas prestações são a
 * iguais a R$ 100,00. Escreva um programa que receba o valor da mercadoria e
 * forneça o valor da entrada e das duas prestações, de acordo com as regras.
 *
 * @author jmario
 */
public class Ifba20 {

    public static void main(String[] args) {
        float produto = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor do produto?"));
        float entrada, prestacao;
        if (produto <= 0) {
            JOptionPane.showMessageDialog(null, "O valor do produto tem que ser maior que zero.");
        } else {
            prestacao = (int) produto / 3;
            entrada = produto - 2 * prestacao;
            JOptionPane.showMessageDialog(null, saidaDados(entrada, prestacao));
        }
    }

    public static float calculoPrestacao(float valor) {
        float resultado = (int) valor / 3;
        return resultado;
    }

    public static float calculoEntrada(float valor) {
        float entrada = valor - (((int) valor / 3) * 2);
        return entrada;
    }

    public static String saidaDados(float entrada, float prestacao) {
        return "O valor de entrada é = R$" + String.format("%.2f", entrada) + ", o valor da primeira prestação é = R$"
                + String.format("%.2f", prestacao) + " e o valor da segunda prestação é = R$" + String.format("%.2f", prestacao);
    }
}
