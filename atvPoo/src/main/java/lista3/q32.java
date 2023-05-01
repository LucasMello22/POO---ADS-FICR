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
public class q32 {
      public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

        int num,soma, impar;
        System.out.print("Digite um número entre 1 e 9: ");
         num = sc.nextInt();

        if (num > 0 && num < 10) {
             soma = 0;
            impar = num % 2 == 0 ? num + 1 : num;

            for (int i = 0; i < 20; i++) {
                soma += Math.pow(impar, 2);
                impar += 2;
            }

            System.out.println("A soma dos quadrados dos 20 primeiros números ímpares a partir de " + num + " é: " + soma);
        } else {
            System.out.println("Número inválido. ");
        }

    }
}
