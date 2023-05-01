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
public class q3 {
     public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
 

        System.out.print("Digite o nome completo: ");
        String name = leia.nextLine().toLowerCase();
      

        String[] words = name.split("\\s+");
        StringBuilder initials = new StringBuilder();

        for (String word : words) {
            if (!isConnector(word)) {
                initials.append(word.charAt(0));
            }
        }

        System.out.println("Iniciais: " + initials.toString().toUpperCase());
    }

    private static boolean isConnector(String word) {
        String[] connectors = {"e", "do", "da", "dos", "das", "de", "di", "du"};
        for (String connector : connectors) {
            if (word.equals(connector)) {
                return true;
            }
        }
        return false;
        
       
    }
    
}
