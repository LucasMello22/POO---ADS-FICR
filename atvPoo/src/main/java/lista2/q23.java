/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class q23 {
 public static void main(String[] args) {
        int a;
        double b, c;
        System.out.println("Escolha uma das opções: \n 1 - Adicao \n 2 - Subtracao \n 3 - Multiplicacao \n 4 - Divisao");
        Scanner ler = new Scanner(System.in);
        a = ler.nextInt();
        switch(a){
            case 1 :
                System.out.println("Digite um número");
                b = ler.nextInt();
                System.out.println("Digite outro número");
                c = ler.nextInt();
                System.out.println("Resultado: " + (b+c));
                break;
            case 2 :
                System.out.println("Digite um número");
                b = ler.nextInt();
                System.out.println("Digite outro número");
                c = ler.nextInt();
                System.out.println("Resultado: " + (b-c));
                break;
            case 3 :
                System.out.println("Digite um número");
                b = ler.nextInt();
                System.out.println("Digite outro número");
                c = ler.nextInt();
                System.out.println("Resultado: " + (b*c));
                break;
            case 4 :
                System.out.println("Digite um número");
                b = ler.nextInt();
                System.out.println("Digite outro número");
                c = ler.nextInt();
                System.out.println("Resultado: " + (b/c));
                break;
                
        }
    }
}