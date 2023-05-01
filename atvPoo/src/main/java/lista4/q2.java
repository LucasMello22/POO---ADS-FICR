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
public class q2 {
      public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = leia.nextInt();
        

        String[] digitWords = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String[] numberWords = new String[String.valueOf(number).length()];
        int i = numberWords.length - 1;
        do {
            int digit = number % 10;
            numberWords[i] = digitWords[digit];
            number /= 10;
            i--;
        } while (number != 0);

        System.out.print("Resultado: ");
        for (String word : numberWords) {
            System.out.print(word + ", ");
        }
    
    }
}
