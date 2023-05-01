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
public class q34 {
   public static void main (String[] args) {
    Scanner leia = new Scanner(System.in);
        int num, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;

        System.out.print("Digite um número positivo ou negativo para encerrar o programa: ");
        num = leia.nextInt();

        while (num >= 0) {

            if (num < menor) {
                menor = num;
            }

            if (num > maior) {
                maior = num;
            }

            System.out.print("Digite um número positivo ou negativo para encerrar o programa: ");
            num = leia.nextInt();
        }

        if (menor != Integer.MAX_VALUE && maior != Integer.MIN_VALUE) {
            System.out.println("Menor número : " + menor);
            System.out.println("Maior número : " + maior);
        } else {
            System.out.println("Nenhum número positivo  foi digitado.");
        }


    }  
}
