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
public class q20 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Digite um número");
        Scanner ler = new Scanner(System.in);
        a = ler.nextInt();
        while(a <= 0){
           System.out.println("Numero inválido. Digite outro número");
            a = ler.nextInt();
        }
        System.out.println("Digite um número");
        b = ler.nextInt();
        while(b <= 0){
           System.out.println("Numero inválido. Digite outro número");
            b = ler.nextInt();
        }
        System.out.println("Digite um número");
        c = ler.nextInt();
        while(c <= 0){
           System.out.println("Numero inválido. Digite outro número");
            c = ler.nextInt();
        }
        if(a>b && a>c){
            if (b>c){
                 System.out.println( c*a + "," + a/c);
            } else{
                System.out.println( b*a + "," + a/b);
            }
        } else if(b>a && b>c){
            if(a>c){
                System.out.println( c*b + "," + b/c);
            } else{
                System.out.println( a*b + "," + b/a);
            }
        }else {
            if(a>b){
                System.out.println( b*c + "," + c/b);
            } else{
                System.out.println( a*c + "," + c/a);
            }
        }
}
}