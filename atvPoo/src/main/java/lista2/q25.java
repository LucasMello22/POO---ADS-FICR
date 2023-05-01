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
public class q25 {
    
    public static void main(String[] args) {
        double h;
        char sexo;
        System.out.println("Qual o sexo da pessoa? \n F - Feminino \n M - Masculino");
        Scanner ler = new Scanner(System.in);
        sexo = ler.next().charAt(0);
        System.out.println("Qual a altura da pessoa? ");
        h = ler.nextDouble();
        switch(sexo){
            case 'F' :
                System.out.println("Peso ideal: " + ((62.1 * h) - 44.7));
                break;
            case 'M' :
                System.out.println("Peso ideal: " + ((72.7 * h) - 58));
                break;
        }
    }
}