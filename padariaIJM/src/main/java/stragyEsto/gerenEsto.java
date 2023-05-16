/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stragyEsto;

/**
 *
 * @author Lucas
 */
public class gerenEsto implements sisEstoque {
    public double qtd[] = new double[6];
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
                +  "\n2 - Ovos"
                + "\n3 - Manteiga"
                + "\n4 - Açucar"
                + "\n5- Sal"
                + "\n6- Oleo"
                + "\n7- Fermento");
        }
    
   
    @Override
    public void remover() {
                System.out.println("Qual o produto que voce deseja remover: "
                + "\n1 - Farinha"
                +  "\n2 - Ovos"
                + "\n3 - Manteiga"
                + "\n4 - Açucar"
                + "\n5- Sal"
                + "\n6- Oleo"
                + "\n7- Fermento");
        
        }
    
}
