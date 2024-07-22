/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.trybe;

import javax.swing.JOptionPane;

/**
 * Você está planejando uma viagem até a praia com colegas. Uma das tarefas para
 * a viagem acontecer é calcular quantos dias ela irá levar. Você está em São
 * Paulo, o João está em Belo Horizonte e a Joana está em Salvador. Levando em
 * conta que o destino do grupo é Natal, no Rio Grande do Norte, crie um
 * algoritmo que calcula a duração de dias de uma viagem levando em conta a
 * quantidade total de horas. O total de dias deve ter precisão de 3 dígitos.
 * Informações: São Paulo até Belo Horizonte = 7 horas e 23 minutos; Belo
 * Horizonte até Salvador = 19 horas e 57 minutos; Salvador até Natal = 15 horas
 * e 32 minutos.
 *
 * @author jmario
 */
public class e04 {

    public static void main(String[] args) {
        float spBh = 7.23f;
        float bhSal = 19.57f;
        float salNat = 15.32f;
        float totalHoras = spBh + bhSal + salNat;
        float horasEmDias = totalHoras / 24f;
        JOptionPane.showMessageDialog(null, "A viagem durou " + String.format("%.3f", horasEmDias) + " dias");
    }
}
