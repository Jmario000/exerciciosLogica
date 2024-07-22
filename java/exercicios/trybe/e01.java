/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.trybe;

import javax.swing.JOptionPane;

/**
 * Crie um algoritmo que recebe seu nome, último nome e idade e exibe estas
 * informações no seguinte formato: Meu nome é “nome” “sobrenome” e tenho “x”
 * anos de vida.
 *
 * @author jmario
 */
public class e01 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome?");
        String sobrenome = JOptionPane.showInputDialog("Qual seu sobrenome?");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos vc tem?"));
        JOptionPane.showMessageDialog(null, "Meu nome é " + nome + " " + sobrenome + " e tenho " + age + " anos de vida.");
    }
}
