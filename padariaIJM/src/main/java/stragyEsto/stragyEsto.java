/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stragyEsto;

/**
 *
 * @author Lucas
 */
public class stragyEsto {
        private sisEstoque strategy; 
    
  public void setStrategy(sisEstoque strategy) {
        this.strategy = strategy;
    }
    public void adicionar() {
        strategy.adicionar();
    }
    public void remover(){
        strategy.remover();
    }
    public void consultar(){
        strategy.conferir();
    }
}
