/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3;

/**
 *
 * @author Lucas
 */
public class q43 {
    public static void main(String[] args) {
        int numGrains = 1; // começa com um grão no primeiro quadro
        long totalGrains = 1; // começa com um grão no primeiro quadro

        // percorre os 63 quadros restantes
        for (int i = 2; i <= 64; i++) {
            numGrains *= 2; // dobra a quantidade de grãos a cada quadro
            totalGrains += numGrains; // soma a quantidade de grãos ao total
        }

        System.out.println("O monge esperava receber " + totalGrains + " grãos de trigo.");
    }
}
