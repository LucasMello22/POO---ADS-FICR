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
public class q42 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite uma sequência de números. Para parar, digite 0:");
        do {
            num = leia.nextInt();

            if (num != 0) {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        } while (num != 0);

        if (maior == Integer.MIN_VALUE) {
            System.out.println("Nenhum número válido foi digitado.");
        } else {
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
        }

    }
}
