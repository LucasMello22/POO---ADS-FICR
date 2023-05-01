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
public class q22 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
        int a, b, num;
        System.out.println("Digite um numero");
        num = leia.nextInt();
        
       if(num>=0){
           a = num;
           System.out.println("O valor " + a + " foi adicionado a variavel a");
       }
       else{
           b = num;
           System.out.println("O valor " + b + " foi adicionado a variavel b");
       }
    }
}
