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
public class Dio17 {

    public static void main(String[] args) {
        float fah = Float.parseFloat(JOptionPane.showInputDialog("Enter the temperature in Farenheit:"));
        float ceusius = (5 * (fah - 32) / 9);

        JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit: " + fah + "°\ntemperature in Celsius: " + String.format("%.2f", ceusius) + "°");
    }
}
