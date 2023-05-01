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
public class q36 {
    public static void main (String[] args) {
    Scanner leia = new Scanner(System.in);

        int num = 10, valor; 
        int maior = 0, menor = Integer.MAX_VALUE, soma = 0;
        double media;

        for (int i = 1; i <= num; i++) {
            System.out.print("Digite o " + i + "° número: ");
            valor = leia.nextInt();

           
            while (valor <= 0) {
                System.out.print("Valor inválido! Digite novamente: ");
                valor = leia.nextInt();
            }

         
            if (valor > maior) {
                maior = valor;
            }

           
            if (valor < menor) {
                menor = valor;
            }

            soma += valor;
        }

       
        media = (double) soma / num;

        //  resultados
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média: " + media);
  
    }
}
