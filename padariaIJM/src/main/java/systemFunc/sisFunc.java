/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package systemFunc;

import java.util.Scanner;

import stragyFunc.cadastrarCpf;
import stragyFunc.cadastrarEmail;
import stragyFunc.cadastrarEndereco;
import stragyFunc.cadastrarFunc;
import stragyFunc.cadastrarNome;
import stragyFunc.cadastrarTelefone;
import stragyFunc.sisCad;



/**
 *
 * @author Lucas
 */
public class sisFunc {

     public static void main(String[] args) {
         int choice, alt;
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
        
        do{ 
        System.out.println("\nOla! Escolha uma das opcoes: \n"
                           + "1 - Cadastrar um novo funcionario!\n"
                           + "2 - Alterar dados do funcionario!\n"
                           + "3 - Ver dados de um funcionario!\n"
                           + "0 - Sair do sistema\n");
         choice = sc.nextInt();
        switch(choice){
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
                
                if(matricula !=0) {
                    matricula = matricula++;
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
                                  + "\nEmail: " + emailf.getEmail());
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
        } while(choice !=0);
        
        
    }
 }
    