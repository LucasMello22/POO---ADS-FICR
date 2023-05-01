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
public class q18 {
   
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
         int x ;    
         System.out.println("Digite o codigo ");
         x = leia.nextInt();
         if (x>=1 && x<=3){
             System.out.println("Codigo Valido!");
         switch (x){
             case 1:
               System.out.println("um"); 
               break;
             case 2:
               System.out.println("dois");
               break;
             case 3:
               System.out.println("tres");
               break;
         }
         }
         else{
             System.out.println("Codigo invalido!");
         }
    }
}
