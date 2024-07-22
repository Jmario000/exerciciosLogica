/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.trybe;

import javax.swing.JOptionPane;

/**
 * Crie um programa para gerenciar as contas de um financiamento de veículo. A
 * pessoa que quer fazer o financiamento precisa informar o valor total do
 * carro, o valor da entrada a ser dada e a quantidade de parcelas que ela
 * deseja pagar. A loja em questão usa uma taxa de juros fixa de 5% sobre o
 * valor do financiamento.
 *
 * @author jmario
 */
public class e06 {
    public static void main(String[] args) {
        float valorCarro = Float.parseFloat(JOptionPane.showInputDialog("Qual é o valor do carro?"));
        float valorEntrada = Float.parseFloat(JOptionPane.showInputDialog("Quanto será dado de entrada?"));
        int qntdParcelas = Integer.parseInt(JOptionPane.showInputDialog("Quer dividir em quantas parcelas?"));
        float valorFinanciado = valorCarro - valorEntrada;
        float valorComTaxa = valorFinanciado * 1.05f;
        float valorParcela = valorComTaxa / qntdParcelas;
        JOptionPane.showMessageDialog(null, "-Valor financiado: R$"
                + Math.round(valorFinanciado)
                + "\n-Valor dado de entrada: R$" + Math.round(valorEntrada)
                + "\n-Quantidade de parcelas: " + qntdParcelas
                + "\n-Valor da parcela: R$" + String.format("%.2f", valorParcela)
                + "\n-Valor do carro: R$" + Math.round(valorCarro));
    }
}
