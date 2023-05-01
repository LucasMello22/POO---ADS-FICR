/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stragyFunc;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class cadastrarTelefone implements cadastrarFunc {
        public String[] telefone = new String[5]; //Criando Array para armazenar mais de um funcionario, posteriormente
    Scanner sc = new Scanner(System.in);
   
    @Override
    public void cadastrar() {
    System.out.println("Qual o numero de telefone do funcionario? ");
        }
    public void setTel() {
        this.telefone[1] = sc.next(); //Apenas um funcionario cadastrado por ser a entrega parcial
    }
    public String getTel(){
        return telefone[1];
    }


}

