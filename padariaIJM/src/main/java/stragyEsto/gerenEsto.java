/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stragyEsto;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class gerenEsto implements sisEstoque {
    public double qtd[] = new double[6];
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    @Override
    
   public void conferir() {
        System.out.println("Lista de produtos com sua quantidade em estoque:"
                + "\nFarinha" + qtd[0]
                +  "\nOvos" + qtd[1]
                + "\nManteiga" + qtd[2]
                + "\nAçucar" + qtd[3]
                + "\nSal" + qtd[4]
                + "\nOleo" + qtd [5]
                + "\nFermento" + qtd[6]);
        }
        
 
    @Override
    public void adicionar() {
        
        System.out.println("Qual o produto que voce deseja adicionar: "
                + "\n1 - Farinha"
                + "\n2 - Ovos"
                + "\n3 - Manteiga"
                + "\n4 - Açucar"
                + "\n5- Sal"
                + "\n6- Oleo"
                + "\n7- Fermento");
        
        choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Digite a quantidade adicionada: ");
            qtd[0] = sc.nextDouble();
            case 2:
            System.out.println("Digite a quantidade adicionada: ");
            qtd[1] = sc.nextDouble();
            case 3:
            System.out.println("Digite a quantidade adicionada: ");
            qtd[2] = sc.nextDouble();
            case 4:
            System.out.println("Digite a quantidade adicionada: ");
            qtd[3] = sc.nextDouble();
            case 5:
            System.out.println("Digite a quantidade adicionada: ");
            qtd[4] = sc.nextDouble(); 
            case 6:
            System.out.println("Digite a quantidade adicionada: ");
            qtd[5] = sc.nextDouble();
            case 7:
            System.out.println("Digite a quantidade adicionada: ");
            qtd[6] = sc.nextDouble();
        }
       
        }
    

    @Override
    public void remover() {
        System.out.println("Qual o produto que voce deseja remover: "
                + "\n1 - Farinha"
                + "\n2 - Ovos"
                + "\n3 - Manteiga"
                + "\n4 - Açucar"
                + "\n5- Sal"
                + "\n6- Oleo"
                + "\n7- Fermento");
          choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Digite a quantidade removida: ");
            qtd[0] -= sc.nextDouble();
            case 2:
            System.out.println("Digite a quantidade removida: ");
            qtd[1] -= sc.nextDouble();
            case 3:
            System.out.println("Digite a quantidade removida: ");
            qtd[2] -= sc.nextDouble();
            case 4:
            System.out.println("Digite a quantidade removida: ");
            qtd[3] -= sc.nextDouble();
            case 5:
            System.out.println("Digite a quantidade removida: ");
            qtd[4] -= sc.nextDouble(); 
            case 6:
            System.out.println("Digite a quantidade removida: ");
            qtd[5] -= sc.nextDouble();
            case 7:
            System.out.println("Digite a quantidade removida: ");
            qtd[6] -= sc.nextDouble();
        }

    }}
   

    
   
