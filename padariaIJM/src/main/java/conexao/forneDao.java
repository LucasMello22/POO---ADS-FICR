/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import conexao.conexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import gerenForne.fornecedores;
/**
 *
 * @author Lucas
 */
public class forneDao {
    Connection conForne;
    PreparedStatement prep;
    ResultSet rs;
    ArrayList<fornecedores> lista = new ArrayList<>();
    
     public void cadastrarFornecedor(fornecedores objfornecedor) {
        String comando = "insert Into fornecedor (cnpj, razao_social, endereco, telefone, email) values (?, ?, ?, ?, ?)";

        conForne = new conexaoDAO().conectaBD();
     
        try {
            prep = conForne.prepareStatement(comando);
            prep.setString (1, objfornecedor.getCnpj());
            prep.setString(2,objfornecedor.getRazao_social());
            prep.setString(3,objfornecedor.getEndereco());
            prep.setString(4,objfornecedor.getTelefone());
            prep.setString(5,objfornecedor.getEmail());
  
            
            prep.execute();
            prep.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ForneDAO cadastrar " + e);

        }

    }

    
    public ArrayList<fornecedores> listarForn(){
        String comando = "select * from fornecedor";
        conForne = new conexaoDAO().conectaBD();
        try {
            prep = conForne.prepareStatement(comando);
            rs = prep.executeQuery();
            
            while (rs.next()) {
                fornecedores objForne = new fornecedores();
                objForne.setId_fornecedor(rs.getInt("id_fornecedor"));
                objForne.setCnpj(rs.getString("cnpj"));
                objForne.setRazao_social(rs.getString("razao_social"));
                objForne.setEndereco(rs.getString("endereco"));
                objForne.setTelefone(rs.getString("telefone"));
                objForne.setEmail(rs.getString("email"));
                
               lista.add(objForne);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ForneDAO listar " + e);
        }
       return lista; 
    }
    
   
    public void alterarFuncionario(fornecedores objfornecedor){
       String comando = "update fornecedor set cnpj = ?, razao_social = ?, endereco = ?, telefone = ?, email = ? where id_fornecedor = ?";

        conForne = new conexaoDAO().conectaBD();
        
        try {
            prep = conForne.prepareStatement(comando);
            prep.setString (1, objfornecedor.getCnpj());
            prep.setString(2,objfornecedor.getRazao_social());
            prep.setString(3,objfornecedor.getEndereco());
            prep.setString(4,objfornecedor.getTelefone());
            prep.setString(5,objfornecedor.getEmail());
            prep.setInt(6,objfornecedor.getId_fornecedor());
            
            prep.execute();
            prep.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "FuncDAO Alterar " + e);

        }
        
    }
    public void excluirFornecedor(fornecedores objfornecedor){
        String comando = "delete from fornecedor where id_fornecedor = ?";

        conForne = new conexaoDAO().conectaBD();
        
        try {
            prep = conForne.prepareStatement(comando);  
            prep.setInt(1,objfornecedor.getId_fornecedor());
            
            prep.execute();
            prep.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ForneDAO Excluir " + e);

        }
    }
}


