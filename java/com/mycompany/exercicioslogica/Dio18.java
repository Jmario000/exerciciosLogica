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
public class Dio18 {

    public static void main(String[] args) {
        float alturaFrancisco = 1.50f;
        float alturaSara = 1.10f;
        int anos = 0;
        while (alturaSara < alturaFrancisco) {
            alturaFrancisco += 0.02f;
            alturaSara += 0.03f;
            anos += 1;
        }
        JOptionPane.showMessageDialog(null, "It took " + anos + " years to Sarah get taller than Francisco.");
    }
}
