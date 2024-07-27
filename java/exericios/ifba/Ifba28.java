package exericios.ifba;

import javax.swing.JOptionPane;

/**
 * Escreva um programa que leia uma letra e mostre se ela é vogal ou consoante.
 *
 * @author jmario
 */
public class Ifba28 {
    
    public static void main(String[] args) {
        Character letter = JOptionPane.showInputDialog("Type a letter").charAt(0);
        letter = letter.toString().toLowerCase().charAt(0);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            JOptionPane.showMessageDialog(null, "The letter it's a vowel");
        } else {
            JOptionPane.showMessageDialog(null, "The letter it's a cosonant");
        }
    }
}
