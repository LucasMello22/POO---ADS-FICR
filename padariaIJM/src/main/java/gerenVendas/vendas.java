package gerenVendas;

public class vendas {
    private String cpf, itens;
    private int id_vendas, matricula;
    private double preco;


    public String getCpf() {
        return cpf;
        
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
  
    public String getItens() {
        return itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getId_vendas() {
        return id_vendas;
    }
    
    public void setId_vendas(int id_vendas) {
        this.id_vendas = id_vendas;
    }


}