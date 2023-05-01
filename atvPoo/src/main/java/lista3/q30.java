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
public class q30 {
    public static void main (String[] args) {
    Scanner leia = new Scanner(System.in);

        int num ,res;
        System.out.print("Digite um número para gerar a tabuada: ");
         num = leia.nextInt();

        for (int i = 1; i <= 10; i++) {
             res = num * i;
            System.out.println(num + " x " + i + " = " + res);
        }
       
    }
}
