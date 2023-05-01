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
public class q14 {
    
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
        int x, y;
        System.out.println("Digite dois valores para saber a diferença entre eles: ");
        x = leia.nextInt();
        y = leia.nextInt();
        
        if (x>y){
            System.out.println("A diferença é: " + (x-y));
        }
        else {
             System.out.println("A diferença é: " + (y-x));
        }
    }
}
