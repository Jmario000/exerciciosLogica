/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.trybe;

import javax.swing.JOptionPane;

/**
 * Crie um programa para uma loja de ração, onde ao informar o preço do produto
 * sejam exibidas as formas de pagamento disponíveis. Pagamento à vista possui
 * 10% de desconto e parcelado em 4x possui juros de 15%.
 *
 * @author jmario
 */
public class e05 {

    public static void main(String[] args) {
        float value = Float.parseFloat(JOptionPane.showInputDialog("How much is the product?"));
        float preco_a_vista = value - (value * 0.1f);
        float parcelado = ((value * 0.15f) + value) / 4f;
        JOptionPane.showMessageDialog(null, "-Preço do produto: R$" + Math.round(value) + "\n-À vista: R$ " + Math.round(preco_a_vista)
                + "\n-4x de: R$" + Math.round(parcelado));
    }
}
