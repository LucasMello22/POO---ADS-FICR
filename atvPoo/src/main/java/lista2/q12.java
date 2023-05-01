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
public class q12 {
    
    public static void main (String [] args) {
   double x;
   Scanner leia = new Scanner (System.in);
   System.out.println("Digite o valor: ");
   x = leia.nextDouble();
   
   if (x>=0) {
     System.out.println("O modulo do valor é = " + x);
   }
   else if (x<0) { 
      x = x * (-1);
      System.out.println("O modulo do valor é = " + x);
   }
   }
}
