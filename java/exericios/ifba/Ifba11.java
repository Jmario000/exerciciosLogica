/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Faça um algoritmo para calcular a nota semestral de um aluno. A nota
 * semestral é obtida pela média aritmética entre a nota de 2 bimestres. Cada
 * nota de bimestre é composta por 2 notas de provas.
 *
 * @author jmario
 */
public class Ifba11 {

    public static void main(String[] args) {
        float nota1Bimestre1, nota2Bimestre1, nota1Bimestre2, nota2Bimestre2, mediaSemestre;
        nota1Bimestre1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1 do 1° bimestre:"));
        nota2Bimestre1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2 do 1° bimestre:"));
        float mediaBimestre1 = (nota1Bimestre1 + nota2Bimestre1) / 2;
        nota1Bimestre2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1 do 2° bimestre:"));
        nota2Bimestre2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2 do 2° bimestre:"));
        float mediaBimestre2 = (nota1Bimestre2 + nota2Bimestre2) / 2;
        mediaSemestre = (mediaBimestre1 + mediaBimestre2) / 2f;
        JOptionPane.showMessageDialog(null, "Nota semestral do aluno: " + String.format("%.2f", mediaSemestre));
    }
}
