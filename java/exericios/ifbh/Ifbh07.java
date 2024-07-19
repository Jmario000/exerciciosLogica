/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exericios.ifbh;

import javax.swing.JOptionPane;

/**
 * Solicitar a idade de uma pessoa em dias e informar na tela a idade em anos,
 * meses e dias. supondo que todos os meses tem 30 dias
 *
 * @author jmario
 */
public class Ifbh07 {

    public static void main(String[] args) {
        int ageInDays = Integer.parseInt(JOptionPane.showInputDialog("How much days do you lived?"));
        int yearsLived = ageInDays / 360;
        int daysLeft = ageInDays % 360;
        int monthsLived = daysLeft / 30;
        int daysLived = daysLeft % 30;
        JOptionPane.showMessageDialog(null, "You lived " + yearsLived + " years, " + monthsLived + " months and " + daysLived + " days.");
    }
}
