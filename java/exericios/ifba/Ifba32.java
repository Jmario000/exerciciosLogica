/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um algoritmo que leia 2 valores (x e y), que devem representar as
 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
 * (x=y=0)
 *
 * @author jmario
 */
public class Ifba32 {

    public static void main(String[] args) {
        float x = Float.parseFloat(JOptionPane.showInputDialog("Enter the 1th value:"));
        float y = Float.parseFloat(JOptionPane.showInputDialog("Enter the 2th value:"));

        JOptionPane.showMessageDialog(null, planoCartesiano(x, y));
    }

    protected static String planoCartesiano(float x, float y) {
        String plano;
        if (x > 0f && y > 0f) {
            plano = "Pertence ao primeiro quadrante.";
        } else if (x < 0f && y > 0f) {
            plano = "Pertence ao segundo quadrante.";
        } else if (x < 0f && y < 0f) {
            plano = "Pertence ao terceiro quadrante.";
        } else if (x > 0f && y < 0f) {
            plano = "Pertence ao quarto quadrante.";
        } else if (x == 0f && y != 0f) {
            plano = "O ponto está sobre o eixo X";
        } else if (x != 0f && y == 0f) {
            plano = "O ponto está sobre o eixo Y";
        } else {
            plano = "O ponto está na origem.";
        }
        return plano;
    }
}
