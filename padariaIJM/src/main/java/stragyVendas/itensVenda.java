/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stragyVendas;

/**
 *
 * @author Lucas
 */
public class itensVenda implements sisVendas {


      public String[] listaItens = new String[5]; //Vamos iniciar a quantidade de Itens com poucos elementos por ser entrega parcial
      double[] preco = new double[5];
      double kg = 1;
    @Override
    public void vender() {
       
        
    }
        public void carregarDados() {
        listaItens[0] = "Pao";
        listaItens[1] = "Queijo";
        listaItens[2] = "Achocolatado";
        listaItens[3] = "Bolo";
        listaItens[4]= "Pao-de-queijo";
        preco[0] = 16.42;
        preco[1] = 28.99; 
        preco[2] = 4.99 ;
        preco[3] = 9.99 ;
        preco[4] = 27.99;
        }
                
        public String getItens(int i) {
        return listaItens[i];
    }
        public double getPreco(int j){
            return preco[j];
        }
}
