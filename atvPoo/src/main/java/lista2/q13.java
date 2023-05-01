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
public class q13 {
    
    public static void main (String [] args) {
        int x, y, z;
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite 3 valores: ");
        x = leia.nextInt();
        y = leia.nextInt();
        z = leia.nextInt();
        
        if (z>x) {
            if (x >2){
                System.out.println("A ordem decrescente é: " + z + " " + x + " " + y);
            }
            else if (y<z){
                System.out.println("A ordem decrescente é: " + z + " " + y + " " + x);
            }
        }
        if (x>y){
            if (y>z) {
                System.out.println("A ordem decrescente é: " + x + " " + y + " " + z);
            }
            else if (z<x){
                System.out.println("A ordem decrescente é: " + x + " " + z + " " + y);
            }
        }
        if (x>y) {
            if (z<x) {
                System.out.println("A ordem decrescente é: " + y + " " + x + " " + z);
            }
            else if (z<y) {
                System.out.println("A ordem decrescente é: " + y + " " + z + " " + x);
            }
        }

    }
    
}
