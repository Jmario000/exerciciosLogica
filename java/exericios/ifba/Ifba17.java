/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Um programa para gerenciar os saques de um caixa eletrônico deve possuir
 * algum mecanismo para decidir o número de notas de cada valor que deve ser
 * disponibilizado para o cliente que realizou o saque. Um possível critério
 * seria o da "distribuição ótima" no sentido de que as notas de menor valor
 * fossem distribuídas em número mínimo possível. (considere existir notas de
 * R$1,00; R$2,00; R$5,00; R$10,00; R$20,00; R$50,00 e R$100,00).
 *
 * @author jmario
 */
public class Ifba17 {

    public static void main(String[] args) {
        float saque = Float.parseFloat(JOptionPane.showInputDialog("Valor do saque:"));
        int notas[] = {100, 50, 20, 10, 5, 2, 1};
        int qntdNotas[] = new int[notas.length];

        for (int i = 0; i < notas.length; i++) {
            while (saque >= notas[i]) {
                saque -= notas[i];
                qntdNotas[i]++;
            }
        }
        StringBuilder sb = new StringBuilder("Foram utilizadas: ");
        for (int i = 0; i < notas.length; i++) {
            if (qntdNotas[i] != 0) {
                sb.append(qntdNotas[i]).append(" nota(s) de ").append(notas[i]).append(", ");
            }
        }
        sb.setLength(sb.length() - 2);
        JOptionPane.showMessageDialog(null, sb);
    }
}
