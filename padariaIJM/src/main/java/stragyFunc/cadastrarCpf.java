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
public class cadastrarCpf implements cadastrarFunc {
    String cpf ; //Criar Array para armazenar mais de um funcionario, posteriormente
    Scanner sc = new Scanner(System.in);
   
    @Override
    public void cadastrar() {
    System.out.println("Qual o CPF do funcionario? ");
        }
    public void setCpf() {
        this.cpf = sc.next(); //Apenas um funcionario cadastrado por ser a entrega parcial
    }
    public String getCpf(){
        return cpf;
    }

   
    }


