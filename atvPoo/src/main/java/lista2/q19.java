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
public class q19 {
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
         int a,b,c ;    
         System.out.println("Digite os tres lados do triangulo ");
         a = leia.nextInt();
         b = leia.nextInt();
         c = leia.nextInt();
         
         if (a == b && b==c){
             System.out.println("triangulo e equilatero");
             
         }
         else if (a==b || a==c || b==c){
             System.out.println("triangulo e isosceles");
         
         }
         else{
             System.out.println("triangulo e escaleno");
         }
    }
}
