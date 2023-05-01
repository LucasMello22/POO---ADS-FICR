/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

import java.util.Random;

/**
 *
 * @author Lucas
 */
public class q6 {
      public static void main(String[] args) {
        
        String s1 = "ACGTACGT";
        String s2 = "TGCATGCA";
        int tamanho = s1.length();
        
    
        String[] filhos = recombinacao(s1, s2);
        String s3 = filhos[0];
        String s4 = filhos[1];
        

        mutacao(s3);
        

        System.out.println("S1: " + s1);
        System.out.println("S2: " + s2);
        System.out.println("S3: " + s3);
        System.out.println("S4: " + s4);
    }
    
    // Função de recombinação
    public static String[] recombinacao(String s1, String s2) {
        Random rand = new Random();
        int pontoDeCorte = rand.nextInt(s1.length());
        String s3 = s1.substring(0, pontoDeCorte) + s2.substring(pontoDeCorte);
        String s4 = s2.substring(0, pontoDeCorte) + s1.substring(pontoDeCorte);
        String[] filhos = {s3, s4};
        return filhos;
    }
    
    // Função de mutação
    public static void mutacao(String s1) {
        Random rand = new Random();
        int indice = rand.nextInt(s1.length());
        char novoCaractere = s1.charAt(indice) == 'A' ? 'C' : 'A'; 
        s1 = s1.substring(0, indice) + novoCaractere + s1.substring(indice+1);
    }
    
}
