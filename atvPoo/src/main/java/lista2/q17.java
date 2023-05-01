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
public class q17 {
    
    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
    int x ;    
    System.out.println("Digite um numero inteiros: ");
    x = leia.nextInt();
    
    
    if (0<=x && x<=9) {
        System.out.println("O valo é valido");
    }
    else{
        System.out.println("O valor não é valido");
    }
    }
}
