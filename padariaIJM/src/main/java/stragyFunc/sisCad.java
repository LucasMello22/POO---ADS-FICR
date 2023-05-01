/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stragyFunc;

/**
 *
 * @author Lucas
 */
public class sisCad {
  private cadastrarFunc strategy; //cadastrar é a implements
  

    public void setStrategy(cadastrarFunc strategy) {
        this.strategy = strategy;
    }
    public void cadastrar() {
        strategy.cadastrar();
    }
   
    
}