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
public class q38 {
     public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        int cod, horas;
        double salario, horasExtras;
        char resposta;

        do {
            System.out.print("Digite o código do operário: ");
            cod = leia.nextInt();

            System.out.print("Digite o número de horas trabalhadas: ");
            horas = leia.nextInt();

            if (horas <= 50) {
                salario = horas * 10;
                horasExtras = 0;
            } else {
                salario = 50 * 10;
                horasExtras = (horas - 50) * 20;
            }

            System.out.printf("Salário total : R$ %.2f\n", salario + horasExtras);
            System.out.printf("Horas extras: R$ %.2f\n", horasExtras);

            System.out.print("Deseja encerrar o programa? (S/N): ");
            resposta = leia.next().charAt(0);

        } while (resposta != 'S' && resposta != 's');

        System.out.println("Programa finalizado.");
        
    }
}
