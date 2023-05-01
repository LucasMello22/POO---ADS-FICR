/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lista2;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class q11 {

    public static void main(String[] args) {
       int a, b, c;
       Scanner leia = new Scanner (System.in);
       
       System.out.println("Escreva, respectivamente, a variavel 'a' e 'b': ");
       a = leia.nextInt();
       b = leia.nextInt();
           System.out.println("O valor de a é: " + a);
           System.out.println("O valor de b é: " + b);
       if (a != b) {
           c = a;
           a = b;
           b = c;
           System.out.println("O novo valor de a é: " + a);
           System.out.println("O novo valor de b é: " + b);
       }
       else {
           System.out.println("Os valores são iguais: a = b = " + a);
       }
       
    }
}
