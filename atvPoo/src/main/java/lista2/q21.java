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
public class q21 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
         int x ;
         String y;
         y = "k";
         while (!"p".equalsIgnoreCase(y)){
         System.out.println("Digite um numero");
         x = leia.nextInt();
         if (x>=0){
             System.out.println("O numero e positivo");
         }
         else{
             System.out.println("O numero e negativo");
         
         }
         System.out.println("Dejesa para? se SIM precione 'p', se NAO precione qualquer outra letra");
         y = leia.next();
    }
    
}
}