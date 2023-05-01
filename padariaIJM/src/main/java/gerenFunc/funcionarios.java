/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenFunc;


/**
 *
 * @author Lucas
 */
public class funcionarios {
    
    private static  funcionarios instancia = new funcionarios();
    
    private funcionarios (){
        super();
    }
    public static funcionarios getInstancia() {
    
        return instancia;
    }
}
   /* public String adicionarMatricula (String cep){
      //Func: SERVG, CAIXA, PADEIRO, GERENTE, ESTOQUISTA
        for (int i = 1; i <= 5; i++) {
            int matricula;
            matricula = i;   
        }  
        return null;        
    }
  //pensando se faço isso para implementação de matricula ou não
}*/


