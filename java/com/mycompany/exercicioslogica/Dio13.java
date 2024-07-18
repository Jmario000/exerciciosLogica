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
public class Dio13 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What's your name?");
        byte age = Byte.parseByte(JOptionPane.showInputDialog("How old are you?"));
        float weight = Float.parseFloat(JOptionPane.showInputDialog("What's you weight?"));

        if (age < 18) {
            JOptionPane.showMessageDialog(null, "Name: " + name + "\nYou're minor");
        } else {
            JOptionPane.showMessageDialog(null, "Name: " + name + "\nYou're of age");
        }

    }
}
