/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import gerenFunc.funcionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class funcDao {

    Connection conFunc;
    PreparedStatement prep;
    ResultSet rs;
    ArrayList<funcionarios> lista = new ArrayList<>();

    public void cadastrarFuncionario(funcionarios objfuncionario) {
        String comando = "insert Into funcionario (nome, cargo, cpf, telefone, email, endereco) values (?, ?, ?, ?, ?, ?)";

        conFunc = new conexaoDAO().conectaBD();

        try {
            prep = conFunc.prepareStatement(comando);
            prep.setString (1, objfuncionario.getNomeFunc());
            prep.setString(2,objfuncionario.getCargoFunc());
            prep.setString(3,objfuncionario.getCpfFunc());
            prep.setString(4,objfuncionario.getTelFunc());
            prep.setString(5,objfuncionario.getEmailFunc());
            prep.setString(6,objfuncionario.getEndeFunc());
            
            prep.execute();
            prep.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "FuncDAO cadastrar " + e);

        }

    }

    
    public ArrayList<funcionarios> listarFunc(){
        String comando = "select * from funcionario";
        conFunc = new conexaoDAO().conectaBD();
        try {
            prep = conFunc.prepareStatement(comando);
            rs = prep.executeQuery();
            
            while (rs.next()) {
                funcionarios objFunc = new funcionarios();
                objFunc.setMatricula(rs.getInt("matricula"));
                objFunc.setNomeFunc(rs.getString("nome"));
                objFunc.setCargoFunc(rs.getString("cargo"));
                objFunc.setCpfFunc(rs.getString("cpf"));
                objFunc.setTelFunc(rs.getString("telefone"));
                objFunc.setEmailFunc(rs.getString("email"));
                objFunc.setEndeFunc(rs.getString("endereco"));
                
               lista.add(objFunc);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"funcDAO listar " + e);
        }
       return lista; 
    }
    
    
    public void alterarFuncionario(funcionarios objfuncionario){
       String comando = "update funcionario set nome = ?, cargo = ?, cpf = ?, telefone = ?, email = ?, endereco = ? where matricula = ?";

        conFunc = new conexaoDAO().conectaBD();
        
        try {
            prep = conFunc.prepareStatement(comando);
            prep.setString (1, objfuncionario.getNomeFunc());
            prep.setString(2,objfuncionario.getCargoFunc());
            prep.setString(3,objfuncionario.getCpfFunc());
            prep.setString(4,objfuncionario.getTelFunc());
            prep.setString(5,objfuncionario.getEmailFunc());
            prep.setString(6,objfuncionario.getEndeFunc());
            prep.setInt(7,objfuncionario.getMatricula());
            
            prep.execute();
            prep.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "FuncDAO Alterar " + e);

        }
        
    }
    public void excluirFuncionario(funcionarios objfuncionario){
        String comando = "delete from funcionario where matricula = ?";

        conFunc = new conexaoDAO().conectaBD();
        
        try {
            prep = conFunc.prepareStatement(comando);  
            prep.setInt(1,objfuncionario.getMatricula());
            
            prep.execute();
            prep.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FuncDAO Excluir " + e);

        }
    }
}
