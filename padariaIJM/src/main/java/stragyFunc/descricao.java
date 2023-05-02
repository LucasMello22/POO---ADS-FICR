package cargo1;

public class descricao {

        String[] listaCargos = new String[5];
        String[] descCargos = new String[5];

        public void listagemCargos () {
            listaCargos[0] = "GERENTE";
            listaCargos[1] = "CAIXA";
            listaCargos[2] = "SERVIÇOS GERAIS";
            listaCargos[3] = "PADEIRO";
            listaCargos[4] = "ESTOQUISTA";
            descCargos[0] = "- Salário: R$2.000,00, sua principal atribuição é garantir que tudo ocorra bem no expediente e a satisfação do cliente";
            descCargos[1] = "- Salário: R$1.200,00, sua principal atribuição é atender o cliente em suas compras e responsavel pelo fechamento do caixa e contagem de vendas.";
            descCargos[2] = "- Salário: R$1.200,00, sua principal atribuição é manter o nosso estabelecimento limpo";
            descCargos[3] = "- Salário: R$1.500,00, sua principal atribuição é cozinhar nossos pães conforme a demanda";
            descCargos[4] = "- Salário: R$1.500,00, sua principal atribuiçao é verificar a validade dos nossos produtos e verificar se o nosso estoque ainda é suficiente.";
        }
        public String getlistaCargos (int i){
            return listaCargos[i];
        }
        public String getdescCargos (int a) {
            return descCargos[a];
        }
    }


