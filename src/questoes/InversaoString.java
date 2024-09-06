/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

import java.util.Scanner;
/**
 *
 * @author Caio Carvalho
 * 
 * 5) Escreva um programa que inverta os caracteres de um string.
 */
public class InversaoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        
        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.nextLine();        
        
        String invertida = inverterString(entrada);        
        
        System.out.println("String invertida: " + invertida);
        
        scanner.close();
    }
    
    public static String inverterString(String str) {
        char[] arrayDeCaracteres = str.toCharArray();
        int esquerda = 0;
        int direita = arrayDeCaracteres.length - 1;
        
        while (esquerda < direita) {            
            char temp = arrayDeCaracteres[esquerda];
            arrayDeCaracteres[esquerda] = arrayDeCaracteres[direita];
            arrayDeCaracteres[direita] = temp;            
            
            esquerda++;
            direita--;
        }
        
        return new String(arrayDeCaracteres);
    }
}
