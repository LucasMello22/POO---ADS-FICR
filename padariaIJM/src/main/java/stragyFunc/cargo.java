package stragyFunc;
import java.util.*;

public class cargo {
      int codCargo,  escolha;
      String i , dCargo; //Tirei a variavel "nome" e "nomeCargo" pois não estavam mais sendo usadas
      Scanner sc = new Scanner(System.in);
      
      
      public Object codigo() { //Nao tá rodando bem, implementamos isso depois
       
          for (codCargo = 0; codCargo <= 5; ++codCargo);
          // System.out.println("O código do cargo desse funcionário é: " + codCargo); //Tirei pq ja vai estar implementado e ficaria repetindo
          return null;
      }
      
      
      public void atribuicaoCargo(){
        // System.out.println("Digite o nome do funcionário:  "); //O nome do funcionario eu atribui direto no sistema
     //    nome = sc.nextLine();    
         System.out.println("Digite o cargo do funcionário:  ");
         i = sc.nextLine();
         System.out.println("Cargo atribuído com sucesso!"); //mudei somente a frase
        // System.out.printf("Seu Codigo de cargo e " ,  this.codigo()); //mudei somente a frase
      }
      public void descriCargos(){
          System.out.println("Responda com SIM ou NÃO, deseja visualizar as informações sobre os cargos da nossa padaria?:  ");
          dCargo = sc.nextLine();
          if (dCargo.equalsIgnoreCase("SIM") ) { //Coloquei .equalsIgnoreCase para não importar se for maiusculo ou não
              System.out.println("Selecione o cargo: \n" +
                                 "1 - GERENTE\n" +
                                 "2 - CAIXA\n" +
                                 "3 - SERVIÇOS GERAIS\n" +
                                 "4 - PADEIRO\n" +
                                 "5 - ESTOQUISTA");
              escolha = sc.nextInt();
              switch (escolha) {
                  case 1:
                      System.out.println("GERENTE\n " +
                              "- Salário: R$2.000,00\n" +
                              "- Atribuições: Garantir que tudo ocorra bem durante o expediente,\n" +
                              "garantir a satisfação dos clientes.");
                      break;
                  case 2:
                      System.out.println("CAIXA\n" +
                              "- Salário: R$ 1.200,00\n" +
                              "- Atribuições: Atender os clientes em suas compras,\n" +
                              "responsavel pelo fechamento do caixa e contagem das vendas.");
                      break;
                  case 3:
                      System.out.println("SERVIÇOS GERAIS\n" +
                              "- Salário: R$ 1.200,00\n" +
                              "- Atribuições: Manter o estabelecimento limpo.");
                      break;
                  case 4:
                      System.out.println("PADEIRO\n" +
                              "- Salário: R$ 1.500,00\n" +
                              "- Atribuições: Cozinhar nossos pães conforme nossa demanda.");
                      break;
                  case 5:
                      System.out.println("ESTOQUISTA\n" +
                              "- Salário: 1.500,00\n" +
                              "- Atribuições: Cuidar do nosso estoque\n" +
                              "verificar sempre as validades dos produtos e quanto falta para chegar ao estoque minimo.");
                      break;
              }
              } else {
              System.out.println("Ok! Pressione 0 para voltar a página inicial.");

          }
          }
      public String getCargo(){
          return i;
      }
      
      }



