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
public class q24 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
        int a, b, num;
        num =1; 
        while (num != 4){
           System.out.println("Digite dois numeros:");
           a = leia.nextInt();
           b = leia.nextInt();
           System.out.println("Qual opção voce deseja?"
                + "\n1 – Verificar se um dos numeros lidos e ou nao multiplo do outro "
                + "\n2 – Verificar se os dois numeros lidos sao pares"
                + "\n3 – Verificar se a media dos dois numeros e maior ou igual a 7"
                + "\n4 - Sair");
            num = leia.nextInt();
           switch (num){
           
               case 1:
                if ( a % b == 0) {
                 System.out.println("Os numeros sao multiplos");
                }
                else{
                 System.out.println("Os numeros nao sao multiplos");
                }
                break;
               case 2:
                if (a%2==0 && b%2==0){
                 System.out.println("Os numeros sao pares");     
                }
                else{
                 System.out.println("Os numeros nao sao pares");   
                }
                break;
               case 3:
                 double med = (a+b)/2;
                 if (med >=7) {
                     System.out.println("A media e maior ou igual a 7");
                 } 
                 else{
                     System.out.println("A media nao e maior ou igual a 7"); 
                 }
                  break;
               case 4:
                   System.out.println("Obrigado, bye bye");
                   break;
               default:
                   System.out.println("Opcao invalida!");
                   break;
           }
           //
           
        }
    }
}
