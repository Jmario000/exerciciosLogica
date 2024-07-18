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
public class Dio11 {

    public static void main(String[] args) {
        float[] grades = new float[4];
        float sum = 0, avg;
        String name = JOptionPane.showInputDialog("Name of the student: ");

        for (int i = 0; i < grades.length; i++) {
            grades[i] = Float.parseFloat(JOptionPane.showInputDialog("Enter the " + (i + 1) + "th grade: "));
            sum += grades[i];
        }
        avg = sum / grades.length;
        if (avg < 7) {
            JOptionPane.showMessageDialog(null, "Name: " + name + "\nReprovado!" + "\nGrades average: " + String.format("%.2f", avg));
        } else {
            JOptionPane.showMessageDialog(null, "Name: " + name + "\nAprovado!" + "\nGrades average: " + String.format("%.2f", avg));
        }
    }
}
