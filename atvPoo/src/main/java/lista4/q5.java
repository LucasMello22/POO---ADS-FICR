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
public class q5 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        String frase;
        System.out.print("Digite uma frase: ");
        String text = leia.nextLine();
    

       frase = text.trim().replaceAll("\\s+", " ");

        System.out.println("Frase pos processamento: \n " + frase);
    }
}
