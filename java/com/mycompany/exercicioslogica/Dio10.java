/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioslogica;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author jmario
 */
public class Dio10 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float[] grades = new float[3];
        float sum = 0, avg;
        for (int i = 0; i < grades.length; i++) {
            grades[i] = Float.parseFloat(JOptionPane.showInputDialog("Enter the " + (i + 1) + "th grade:"));
            sum += grades[i];
        }
        avg = sum / grades.length;
        JOptionPane.showMessageDialog(null, "Grades average: " + String.format("%.2f", avg));
    }
}
