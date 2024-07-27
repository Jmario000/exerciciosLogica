package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa que calcula o desconto previdenciário de um funcionário.
 * Dado um salário, o programa deve retornar o valor do desconto proporcional ao
 * mesmo. O cálculo segue a regra: o desconto é de 11% do valor do salário,
 * entretanto, o valor máximo de desconto é 334,29, o que seja menor.
 *
 * @author jmario
 */
public class Ifba29 {

    public static void main(String[] args) {
        final float DESCONTO = 0.11f;
        float salario = Float.parseFloat(JOptionPane.showInputDialog("Qual o salário?"));
        float calculoDesconto = salario * DESCONTO;
        float salarioComDesconto = salario - calculoDesconto;

        if (calculoDesconto > 334.29f) {
            calculoDesconto = 334.29f;
        }
        JOptionPane.showMessageDialog(null, "Valor do desconto = R$" + String.format("%.2f", calculoDesconto)
                + "\nSalário com desconto = R$" + String.format("%.2f", salarioComDesconto));
    }
}
