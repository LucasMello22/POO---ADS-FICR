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
public class q33 {
    public static void main (String[] args) {
    Scanner leia = new Scanner(System.in);
        double nota, soma = 0;
        int matricula, contador = 0;

        do {
            System.out.println("Digite o número de matrícula do aluno ou -1 para sair: ");
            matricula = leia.nextInt();

            if (matricula != -1) {
                System.out.println("Digite a nota do aluno: ");
                nota = leia.nextDouble();

                soma += nota;
                contador++;
            }
        } while (matricula != -1);

        if (contador > 0) {
            double media = soma / contador;
            System.out.printf("A média da turma é %.2f\n", media);
        } else {
            System.out.println("Não foram informados dados dessa turma.");
        }


    }
    
}
