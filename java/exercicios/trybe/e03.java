/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.trybe;

import javax.swing.JOptionPane;

/**
 * Você foi jantar em um restaurante chique, em uma cidade turística. O prato
 * que você pediu custou R$100,00. Porém o restaurante possui uma taxa de 10%
 * sobre o valor da conta por ser um lugar turístico. Crie uma solução para
 * calcular o valor final da conta sendo que você também quis dar 5% de gorjeta
 * para a pessoa que lhe atendeu.
 *
 * @author jmario
 */
public class e03 {

    public static void main(String[] args) {
        final float TAXA = 10f;
        final float GORJETA = 5f;
        final float PEDIDO = 100f;
        float valorComTaxa = PEDIDO * TAXA / 100 + PEDIDO;
        float valorFinal = valorComTaxa * GORJETA / 100 + valorComTaxa;
        JOptionPane.showMessageDialog(null, "Valor total: $" + String.format("%.2f", valorFinal));
    }
}
