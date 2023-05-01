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
public class q31 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

        int num, pares = 0, impares = 0;

        System.out.println("Digite um número positivo ou negativo para sair do loop: ");
        num = sc.nextInt();

        while (num >= 0) {
            if (num % 2 == 0) {
                System.out.println(num + " é um número par.");
                pares += num;
            } else {
                System.out.println(num + " é um número ímpar.");
                impares += num;
            }

            System.out.println("Digite outro número positivo ou negativo para sair do loop: ");
            num = sc.nextInt();
        }
        System.out.println("O total dos números declarados são: ");
        System.out.println("Soma dos pares: " + pares);
        System.out.println("Soma dos ímpares: " + impares);
        
    }
    
}
