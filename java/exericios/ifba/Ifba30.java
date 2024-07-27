package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 * Álcool Gasolina Até 25 litros, desconto de 2% por litro Acima de 25 litros,
 * desconto de 4% por litro Até 25 litros, desconto de 3% por litro Acima de 25
 * litros, desconto de 5% por litro Escreva um algoritmo que leia o número de
 * litros vendidos e o tipo de combustível (codificado da seguinte forma:
 * A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
 * sabendo-se que o preço do litro da gasolina é R$ 2,70 e o preço do litro do
 * álcool é R$ 1,90.
 *
 * @author jmario
 */
public class Ifba30 {

    public static void main(String[] args) {
        float litros = 0f;
        do {
            litros = Float.parseFloat(JOptionPane.showInputDialog("Quantos litros?"));
        } while (litros <= 0f);
        String[] combustivel = {"A - álcool", "G - gasolina"};
        char opcao = JOptionPane.showInputDialog(null, "Qual combustível?", "Escolha", JOptionPane.QUESTION_MESSAGE, null, combustivel, combustivel).toString().charAt(0);
        JOptionPane.showMessageDialog(null, "Valor a ser pago = R$" + String.format("%.2f", calculoCombustivel(opcao, litros)));
    }

    protected static float calculoCombustivel(char op, float litros) {
        final float LITRO_GASOLINA = 2.70f;
        final float LITRO_ALCOOL = 1.90f;
        float valor = 0f;
        if (op == 'A') {
            valor = litros * LITRO_ALCOOL;
            if (litros <= 25f) {
                valor -= valor * 0.02f;
            } else {
                valor -= valor * 0.04f;
            }
        } else {
            valor = litros * LITRO_GASOLINA;
            if (litros <= 25f) {
                valor -= valor * 0.03f;
            } else {
                valor -= valor * 0.05f;
            }
        }
        return valor;
    }
}
