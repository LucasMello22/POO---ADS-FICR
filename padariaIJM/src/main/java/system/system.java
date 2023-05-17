/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package system;

import java.util.Scanner;

import stragyFunc.cadastrarCpf;
import stragyFunc.cadastrarEmail;
import stragyFunc.cadastrarEndereco;
import stragyFunc.cadastrarFunc;
import stragyFunc.cadastrarNome;
import stragyFunc.cadastrarTelefone;
import stragyFunc.cargo;
import stragyFunc.sisCad;
import stragyVendas.itensVenda;




/**
 *
 * @author Lucas
 */
public class system {

     public static void main(String[] args) {
         int choice, alt, choiceFunc;
         int matricula=0; 
     
        cadastrarFunc nome = new cadastrarNome();
        cadastrarFunc endereco = new cadastrarEndereco();
        cadastrarFunc cpf = new cadastrarCpf();
        cadastrarFunc telefone = new cadastrarTelefone();
        cadastrarFunc email = new cadastrarEmail();
        sisCad funcionario = new sisCad();
        Scanner sc = new Scanner (System.in);
        cadastrarNome nomef = new cadastrarNome();
        cadastrarEndereco endef = new cadastrarEndereco();
        cadastrarCpf cpff = new cadastrarCpf();
        cadastrarTelefone telefonef = new cadastrarTelefone();
        cadastrarEmail emailf = new cadastrarEmail();
        cargo cargof = new cargo();
        itensVenda itensv = new itensVenda();

        

      do{
        System.out.println("Bem vindo ao sistema de gestao de sua padaria!\n" 
                            + "Selecione o que voce deseja gerenciar:\n"
                            + "1 - Vendas\n"
                            + "2 - Funcionarios\n"
                            + "3 - Produção\n"
                            + "4 - Estoque\n"
                            + "0 - Desligar");
        choice = sc.nextInt();
        
        if (choice == 1) {
                    itensv.carregarDados(); //Carregando a lista e preco dos produtos
                    double precotot = 0; // preco total a ser calculado
                    int choiceVendas;
                    do{
           System.out.println("Bem vindo ao sistema de gerenciamento de vendas!\n"
                                + "Voce gostaria de:\n"
                                + "1 - Conferir preco\n"
                                + "2 - Adicionar um produto\n"
                                + "3 - Remover um produto\n" 
                                + "4 - Conferir preço total\n"
                                + "0 - Sair do sistema");
         choiceVendas = sc.nextInt();
         
         switch(choiceVendas){
             case 1:
                 System.out.println("O item: " +itensv.getItens(0)
                                + " custa: " + itensv.getPreco(0) + " o kg");
                 System.out.println("O item: " +itensv.getItens(1)
                                + " custa: " + itensv.getPreco(1) + " o kg");
                 System.out.println("O item: " +itensv.getItens(2)
                                + " custa: " + itensv.getPreco(2) + " cada unidade");
                 System.out.println("O item: " +itensv.getItens(3)
                                + " custa: " + itensv.getPreco(3) + " cada unidade");
                 System.out.println("O item: " +itensv.getItens(4)
                                + " custa: " + itensv.getPreco(4) + " o kg");
                 break;
             case 2:
                 int choiceadd;
                 String[] listProd = new String [10];
                 do{
                 System.out.println("Qual o produto será adicionado a nota:"
                                    + "\n1 - " + itensv.getItens(0)
                                    + "\n2 - " + itensv.getItens(1)
                                    + "\n3 - " + itensv.getItens(2)
                                    + "\n4 - " + itensv.getItens(3)
                                    + "\n5 - " + itensv.getItens(4)
                                    + "\n0 - Nao adicionar mais.");
                 choiceadd = sc.nextInt();
                
                 
                 switch (choiceadd){
                     
                     case 1:
                         System.out.println("Qual a quantidade (em gramas): ");
                         double qtd0 = sc.nextDouble();
                         double pre0 = itensv.getPreco(0);
                         System.out.println("O preco é de: " + (pre0/1000) * qtd0);
                         precotot = qtd0 *pre0;
                         break;
                    case 2:
                         System.out.println("Qual a quantidade (em gramas): ");
                         double qtd1 = sc.nextDouble();
                         double pre1 = itensv.getPreco(1);
                         precotot += qtd1 *pre1; 
                         System.out.println("O preco é de: " + (pre1/1000) * qtd1);
                         break;
                    case 3:
                        System.out.println("Qual a quantidade (em unidade): ");
                         double qtd2 = sc.nextDouble();
                         double pre2 = itensv.getPreco(2);
                         precotot += qtd2 *pre2; 
                         System.out.println("O preco é de: " + pre2 * qtd2);
                         break;
                    case 4:
                        System.out.println("Qual a quantidade (em unidade): ");
                         double qtd3 = sc.nextDouble();
                         double pre3 = itensv.getPreco(3);
                         precotot += qtd3 *pre3; 
                         System.out.println("O preco é de: " + pre3 * qtd3);
                         break;
                    case 5:
                        System.out.println("Qual a quantidade (em gramas): ");
                         double qtd4 = sc.nextDouble();
                         double pre4 = itensv.getPreco(0);
                         precotot += qtd4 *pre4; 
                         System.out.println("O preco é de: " + (pre4/1000) * qtd4);
                         break;
                    default:
                        System.out.println("...");
                        break;
                 }
                 }while(choiceadd !=0);
                   
                 break;
                 
            case 3:
                 System.out.println("Sys ainda em desenvolvimento...");
                 break;
            case 4:
                System.out.println("O preco total da nota e de: " + precotot);
                break;
         }
         
                    }while(choiceVendas !=0);
                    }
                    
        else if (choice==2){
        do{ 
        System.out.println("\nOla! Escolha uma das opcoes: \n"
                           + "1 - Cadastrar um novo funcionario!\n"
                           + "2 - Alterar dados do funcionario!\n"
                           + "3 - Ver dados de um funcionario!\n"
                           + "0 - Sair do sistema\n");
         choiceFunc = sc.nextInt();
        switch(choiceFunc){
            case 1:
                funcionario.setStrategy(nome);
                funcionario.cadastrar();
                nomef.setNome();
                funcionario.setStrategy(endereco);
                funcionario.cadastrar();
                endef.setEnde();
                funcionario.setStrategy(cpf);
                funcionario.cadastrar();
                cpff.setCpf();
                funcionario.setStrategy(telefone);
                funcionario.cadastrar();
                telefonef.setTel();      
                funcionario.setStrategy(email);
                funcionario.cadastrar();
                emailf.setEmail(); 
                cargof.atribuicaoCargo();
               
               
                
                
                if(matricula !=0) {
                    matricula = ++matricula;
                }
                else{
                    matricula = 1;
                }    
                System.out.println("Funcionario cadastrado com sucesso! \n");
                break;
            case 2: 
            System.out.println("Selecione o que deseja alterar: \n"
                                + "1 - Nome\n"
                                + "2 - Endereço\n"
                                + "3 - CPF\n"
                                + "4 - Telefone\n"
                                + "5 - Email\n"
                                + "6 - Cargo\n"
                                + " Obs.: matricula é auto incrementada!");
        alt = sc.nextInt();
    
        switch(alt){
            case 1:
                funcionario.setStrategy(nome);
                funcionario.cadastrar();
                nomef.setNome();
                System.out.println("Nome salvo com sucesso!");
                break;
            case 2:
                funcionario.setStrategy(endereco);
                funcionario.cadastrar();
                endef.setEnde();
                System.out.println("Endereço salvo com sucesso!");
                break;
            case 3:
                funcionario.setStrategy(cpf);
                funcionario.cadastrar();
                cpff.setCpf();
                System.out.println("CPF salvo com sucesso!");
                break;
            case 4:
                funcionario.setStrategy(telefone);
                funcionario.cadastrar();
                telefonef.setTel();
                System.out.println("Telefone salvo com sucesso!");
                break;
            case 5:
                funcionario.setStrategy(email);
                funcionario.cadastrar();
                emailf.setEmail();
                System.out.println("Email salvo com sucesso!");
                break;
            case 6:
                cargof.atribuicaoCargo();
                cargof.descriCargos();
                
            default:
                System.out.println("Numero invalido, saindo do sistema de alteracao...");
                break;
        }
                break;
            case 3:
                System.out.println("Nome: " + nomef.getNome()
                                  + "\nEndereco: " + endef.getEnde()
                                  + "\nCPF: " + cpff.getCpf()
                                  + "\nTelefone: " + telefonef.getTel()
                                  + "\nEmail: " + emailf.getEmail()
                                  + "\nCargo: " + cargof.getCargo());
                cargof.descriCargos();
                                  
                if(matricula != 0) {
                    System.out.println("Matricula: " + matricula);
                }
                else {
                    System.out.println("Funcionario não matriculado!");
                }
                break;
            case 0:
                System.out.println("Voce saiu do sistema!");
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
        } while(choiceFunc !=0);
        }
        
        else {
            System.out.println("Opcao invalida!");
        }
        
    }while(choice!=0);
     }
 }
    