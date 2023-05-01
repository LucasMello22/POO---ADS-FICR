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
public class q16 {
    
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
    int x, y;
    System.out.println("Digite dois numeros inteiros: ");
    x = leia.nextInt();
    y = leia.nextInt();
    
    if (x>y){
        System.out.println("O maior é (" + x + ") e o menor é (" + y + ")");
    }
    else{
        System.out.println("O maior é (" + y + ") e o menor é (" + x + ")");
    }
   
}
}
