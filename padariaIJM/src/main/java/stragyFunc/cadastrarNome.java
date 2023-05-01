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
public  class cadastrarNome implements cadastrarFunc {
    public String[] nome = new String[5]; //Criando Array para armazenar mais de um funcionario, posteriormente
    Scanner sc = new Scanner(System.in);
    @Override
    public void cadastrar() {
    System.out.println("Qual o nome do funcionario? ");
        }
    public void setNome() {
        this.nome[1] = sc.nextLine(); //Apenas um funcionario cadastrado por ser a entrega parcial
    }
    public String getNome(){
        return nome[1];
    }



}
