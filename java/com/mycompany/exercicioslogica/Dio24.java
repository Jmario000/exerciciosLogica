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
public class Dio24 {

    public static void main(String[] args) {
        float tempo = Float.parseFloat(JOptionPane.showInputDialog("Quantas horas será gasto na viagem?"));
        float velocidade = Float.parseFloat(JOptionPane.showInputDialog("Qual vai ser a velocidade média?(km/h)"));
        float distancia = tempo * velocidade;
        float litrosUsados = distancia / 12;
        JOptionPane.showMessageDialog(null, "Foram usados " + String.format("%.2f", litrosUsados) + " litros");
    }
}
