/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class q27 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite os numeros a serem processados: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Digite o numero a ser processado: ");
            int num2 = sc.nextInt();

            int fat = 1;

            for (int j = 2; j <= num2; j++) {
                fat *= j;
            }

            System.out.println("O fatorial de " + num2 + " é " + fat + ".");
        }
        
    }
}
