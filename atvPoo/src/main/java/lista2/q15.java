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
public class q15 {

    public static void main (String[] args){
        Scanner leia = new Scanner (System.in);
        double n1, n2, n3, n4, med;
        
        System.out.println("Escreva as quatro notas dos alunos: ");
        n1 = leia.nextDouble();
        n2 = leia.nextDouble();
        n3 = leia.nextDouble();
        n4 = leia.nextDouble();
        
        med = (n1+n2+n3+n4)/4;
        
        if (med>=7){
            System.out.println("A sua média é: " + med + ". Aprovado");
        }
        else if (med<7){
            System.out.println("Sua media foi: " + med);
            System.out.println("Digite a nota da recuperação: ");
            double rec = leia.nextDouble();
            med = (med+rec)/2;
            if(med>=7) {
                 System.out.println("A sua média é: " + med + ". Aprovado na recuperação");
            }
            else{
                 System.out.println("Aluno reprovado");
            }
            
        }
            
    }
}
