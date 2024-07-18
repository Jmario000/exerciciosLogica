/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioslogica;

import javax.swing.JOptionPane;

/**
 *
 * @author jmario
 */
public class Dio23 {

    public static void main(String[] args) {
        int numAulas = Integer.parseInt(JOptionPane.showInputDialog("Quantas aulas?"));
        float valorHoraAula = Float.parseFloat(JOptionPane.showInputDialog("Qual o valor da hora da aula?"));
        float percentualINSS = Float.parseFloat(JOptionPane.showInputDialog("Qual o percentual do desconto do INSS?"));
        float salarioBruto = numAulas * valorHoraAula;
        float salarioLiquido = salarioBruto - (salarioBruto * percentualINSS) / 100;
        JOptionPane.showMessageDialog(null, "O salário líquido do professor é: R$ " + String.format("%.2f", salarioLiquido));
    }
}
