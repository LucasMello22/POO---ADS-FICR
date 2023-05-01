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
public class q40 {
     public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);
     

        double indice;
        char resposta;

        do {
            System.out.println("Digite o índice de poluição medido:");
            indice = leia.nextDouble();

            if (indice >= 0.05 && indice <= 0.25) {
                System.out.println("Índice de poluição aceitável.");
            } else if (indice > 0.25 && indice < 0.30) {
                System.out.println("Grupo 1 deve ser intimadas e suspender a produção");
            } else if (indice >= 0.4 && indice < 0.5) {
                System.out.println("Grupo 1 e 2  devem ser intimadas e suspender a produção");
            } else if (indice >= 0.5) {
                System.out.println("Todos as industrias devem suspender suas atividades.");
            }

            System.out.println("Deseja finalizar o programa? (S/N)");
            resposta = leia.next().charAt(0);
        } while (resposta != 'S' && resposta != 's');

        System.out.println("Programa finalizado.");
    
    }
}
