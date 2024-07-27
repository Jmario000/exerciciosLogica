/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa que leia um caracter e diga se ele é uma vogal,
 * consoante, número ou um símbolo (qualquer outro caracter, que não uma letra
 * ou número).
 *
 * @author jmario
 */
public class Ifba31 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite um caractere qualquer.");
        Character caractere = aux.toLowerCase().charAt(0);

        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
            JOptionPane.showMessageDialog(null, "É uma vogal");
        } else if (caractere >= '0' && caractere <= '9') {
            JOptionPane.showMessageDialog(null, "É um número");
        } else if (caractere >= 'a' && caractere <= 'z') {
            JOptionPane.showMessageDialog(null, "É uma consoante");
        } else {
            JOptionPane.showMessageDialog(null, "É um caractere especial");
        }
    }
}
