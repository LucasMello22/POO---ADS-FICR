/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número a ser convertido: ");
        String numero = sc.nextLine();
        System.out.println("Digite a base numérica atual do número (exemplo: 10 para decimal): ");
        int baseAtual = sc.nextInt();
        System.out.println("Digite a base numérica para a qual você deseja converter o número: ");
        int novaBase = sc.nextInt();
       
        
        String resultado = converterBase(numero, baseAtual, novaBase);
        System.out.println("O número " + numero + " na base " + baseAtual + " convertido para a base " + novaBase + " é: " + resultado);
    
    
    }
    
    public static String converterBase(String numero, int baseAtual, int novaBase) {
        // Converter o número para a base decimal primeiro
        int decimal = 0;
        int potencia = 1;
        for (int i = numero.length() - 1; i >= 0; i--) {
            int digito = obterValorDigito(numero.charAt(i));
            decimal += digito * potencia;
            potencia *= baseAtual;
        }
        return null;
        


    

}

    private static int obterValorDigito(char charAt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

  
    

