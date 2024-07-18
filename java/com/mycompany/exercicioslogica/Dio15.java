/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioslogica;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

/**
 *
 * @author jmario
 */
public class Dio15 {

    public static void main(String[] args) {
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual ano que você nasceu?"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Em qual mês vc nasceu?"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Qual dia vc nasceu?"));

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        Period diferencaAno = Period.between(dataNascimento, dataAtual);

        JOptionPane.showMessageDialog(null, "Você viveu " + diferencaAno.getYears() + " anos, " + diferencaAno.getMonths() + " meses, e "
                + diferencaAno.getDays() + " dias.");
    }
}
