/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stragyVendas;

/**
 *
 * @author Lucas
 */
public class stragyVen {
    private sisVendas strategy; 
    
  public void setStrategy(sisVendas strategy) {
        this.strategy = strategy;
    }
    public void vender() {
        strategy.vender();
    }
}
