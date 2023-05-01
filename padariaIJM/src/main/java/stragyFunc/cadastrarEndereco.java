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
public class cadastrarEndereco implements cadastrarFunc{
    public String[] endereco = new String[5]; //Criando Array para armazenar mais de um funcionario, posteriormente
    Scanner sc = new Scanner(System.in);
    @Override
    public void cadastrar() {
    System.out.println("Qual o endereço do funcionario? ");
        }
    public void setEnde() {
        this.endereco[1] = sc.nextLine(); //Apenas um funcionario cadastrado por ser a entrega parcial
    }
    public String getEnde(){
        return endereco[1];
    }

 
    }

 



    

