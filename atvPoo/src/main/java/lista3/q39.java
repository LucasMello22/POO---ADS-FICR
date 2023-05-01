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
public class q39 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
        int num;
        char opcao = 'N';

        do {
            System.out.print("Digite um número : ");
            num = leia.nextInt();

            if (num % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }

            if (num > 0) {
                System.out.println("O número é positivo.");
            } else if (num < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é neutro.");
            }

            System.out.print("Deseja sair? (S/N) ");
            opcao = leia.next().charAt(0);

        } while (opcao != 'S' && opcao != 's');
      
    } 
}
