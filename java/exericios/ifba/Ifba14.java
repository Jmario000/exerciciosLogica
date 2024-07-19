/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Em uma cidade se deseja sincronizar os semáforos. Com isto, quando um
 * semáforo abre (fica verde), os veículos que nele estavam parados tendem a
 * encontrar os próximos semáforos também abertos. Para que isto seja feito, os
 * próximos semáforos precisam abrir um pouco depois, dependendo da velocidade
 * permitida na via e da distância entre eles. Assim, ao abrir o semáforo, um
 * veículo começa a acelerar até atingir a velocidade permitida, que mantém até
 * chegar ao próximo semáforo, levando um certo tempo para percorrer essa
 * distância. Para que encontre o próximo semáforo aberto, este deve abrir um
 * pouco antes da chegada do veículo (por ex: 3 segundos antes). Faça assim um
 * algoritmo que informe quanto tempo depois um semáforo deve abrir, dada as
 * seguintes informações: a. a distância desde o semáforo anterior b. a
 * velocidade permitida da via c. a aceleração típica dos carros
 *
 * @author jmario
 */
public class Ifba14 {

    public static void main(String[] args) {
        float distancia, velocidade_permitida, tempo_total, tempo_antecipado = 3, tempoAbertura;
        distancia = Float.parseFloat(JOptionPane.showInputDialog("Qual a distância até o próximo semáforo? (em metros)"));
        velocidade_permitida = Float.parseFloat(JOptionPane.showInputDialog("Qual a velocidade permitida da via? (Em m/s)"));

        tempo_total = distancia / velocidade_permitida;
        tempoAbertura = tempo_total - tempo_antecipado;
        JOptionPane.showMessageDialog(null, "O semáforo deve abrir após " + String.format("%.1f", tempoAbertura) + " segundos depois de passar pelo semáforo atual.");
    }
}
