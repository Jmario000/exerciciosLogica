/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa que leia o número equivalente ao mês e imprima a
 * quantidade de dias deste mês.
 *
 * @author jmario
 */
public class Ifba25 {

    public static void main(String[] args) {
        int month = Integer.parseInt(JOptionPane.showInputDialog("Enter the month number"));
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                JOptionPane.showMessageDialog(null, "This month is 30 days long");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "This month is 28 days long");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                JOptionPane.showMessageDialog(null, "This month is 31 days long");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Enter a valid month.");
                break;
        }
    }
}
