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
public class q1 {
   public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite algo: ");
        String inputString = leia.nextLine();


   
        int numcaractere = inputString.length();
        System.out.println("Número de caracteres: " + numcaractere);

       
        String uppercaseString = inputString.toUpperCase();
        System.out.println("String em maiúsculo: " + uppercaseString);

       
        int vogais = 0;
        for (int i = 0; i < numcaractere; i++) {
            char currentChar = Character.toLowerCase(inputString.charAt(i));
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vogais++;
            }
        }
        System.out.println("Número de vogais: " + vogais);

    
        boolean startsWithUNI = inputString.toLowerCase().startsWith("uni");
        System.out.println("Começa com UNI: " + startsWithUNI);

     
        boolean endsWithRIO = inputString.toLowerCase().endsWith("rio");
        System.out.println("Termina com RIO: " + endsWithRIO);

    
        int num = 0;
        for (int i = 0; i < numcaractere; i++) {
            char currentChar = inputString.charAt(i);
            if (Character.isDigit(currentChar)) {
                num++;
            }
        }
        System.out.println("Número de dígitos: " + num);

    
        boolean Pali = true;
        for (int i = 0; i < numcaractere / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(numcaractere - i - 1)) {
                Pali = false;
                break;
            }
        }
        System.out.println("É um palíndromo: " + Pali);
        
    }
} 

