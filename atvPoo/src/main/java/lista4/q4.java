/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class q4 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        int letras, count;

        System.out.print("Digite um texto: ");
        String text = leia.nextLine();
        

        letras = text.length();
        count = text.split("\\s+").length;

        System.out.println("Número de caracteres: " + letras);
        System.out.println("Número de palavras: " + count);

    }
    
}
