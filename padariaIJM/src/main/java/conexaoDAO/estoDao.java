/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoDAO;

import gerenEsto.estoque;
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
public class estoDao {
    Connection conEsto;
    PreparedStatement prep;
    ResultSet rs;
    ArrayList<estoque> lista = new ArrayList<>();
    
     public void cadastrarEstoque(estoque objestoque) {
        String comando = "insert Into estoque (ingrediente, quantidade, id_fornecedor) values (?, ?, ?)";

        conEsto = new conexaoDAO().conectaBD();
     
        try {
            prep = conEsto.prepareStatement(comando);
            prep.setString (1, objestoque.getIngrediente());
            prep.setInt(2,objestoque.getQuantidade());
            prep.setInt(3,objestoque.getIdFornecedor());
    
  
            
            prep.execute();
            prep.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Id do Fornecedor não Existe! \n" + JOptionPane.ERROR_MESSAGE);

        }

    }
     public ArrayList<estoque> listarEstoque(){
        String comando = "select * from estoque";
        conEsto = new conexaoDAO().conectaBD();
        try {
            prep = conEsto.prepareStatement(comando);
            rs = prep.executeQuery();
            
            while (rs.next()) {
                estoque objEsto = new estoque();
                objEsto.setIdIngrediente(rs.getInt("id_ingrediente"));
                objEsto.setIngrediente(rs.getString("ingrediente"));
                objEsto.setQuantidade(rs.getInt("quantidade"));
                objEsto.setIdFornecedor(rs.getInt("id_fornecedor"));
                
                
               lista.add(objEsto);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"EstoDAO listar " + e);
        }
       return lista; 
    }
     
     
      public void alterarEstoque(estoque objestoque){
       String comando = "update estoque set ingrediente = ?, quantidade = ?, id_fornecedor = ? where id_ingrediente = ?";

        conEsto = new conexaoDAO().conectaBD();
        
        try {
            prep = conEsto.prepareStatement(comando);
            prep.setString (1, objestoque.getIngrediente());
            prep.setInt(2,objestoque.getQuantidade());
            prep.setInt(3,objestoque.getIdFornecedor());
            prep.setInt(4,objestoque.getIdIngrediente());
            
            prep.execute();
            prep.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "EstoDAO Alterar " + e);

        }
        
    }
     
      
      public ResultSet listarId(){
        conEsto = new conexaoDAO().conectaBD();
        String comando = "select id_fornecedor from estoque";
        try {
            prep = conEsto.prepareStatement(comando);
            return prep.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Listar Id " + e);
        }
        return null;
    }
      
     
      
     public ArrayList<estoque> filtrarEstoque1(){
       String comando = "select * from estoque where id_fornecedor = 1";
        conEsto = new conexaoDAO().conectaBD();
       
        try {
            prep = conEsto.prepareStatement(comando);
           // prep.setInt(1,objestoque.getIdFornecedor());
            rs = prep.executeQuery();
            
            while (rs.next()) {
                estoque objEsto = new estoque();
                objEsto.setIdIngrediente(rs.getInt("id_ingrediente"));
                objEsto.setIngrediente(rs.getString("ingrediente"));
                objEsto.setQuantidade(rs.getInt("quantidade"));
                objEsto.setIdFornecedor(rs.getInt("id_fornecedor"));
                
                
               lista.add(objEsto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"EstoDAO filtrar(1) " + e);
        }
        
       return lista; 
    }
     
     
    public ArrayList<estoque> filtrarEstoque2(){
       String comando = "select * from estoque where id_fornecedor = 2";
        conEsto = new conexaoDAO().conectaBD();
       
        try {
            prep = conEsto.prepareStatement(comando);
           // prep.setInt(1,objestoque.getIdFornecedor());
            rs = prep.executeQuery();
            
            while (rs.next()) {
                estoque objEsto = new estoque();
                objEsto.setIdIngrediente(rs.getInt("id_ingrediente"));
                objEsto.setIngrediente(rs.getString("ingrediente"));
                objEsto.setQuantidade(rs.getInt("quantidade"));
                objEsto.setIdFornecedor(rs.getInt("id_fornecedor"));
                
                
               lista.add(objEsto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"EstoDAO filtrar(1) " + e);
        }
        
       return lista; 
    }
      public ArrayList<estoque> filtrarEstoque3(){
       String comando = "select * from estoque where id_fornecedor >= 3";
        conEsto = new conexaoDAO().conectaBD();
       
        try {
            prep = conEsto.prepareStatement(comando);
           // prep.setInt(1,objestoque.getIdFornecedor());
            rs = prep.executeQuery();
            
            while (rs.next()) {
                estoque objEsto = new estoque();
                objEsto.setIdIngrediente(rs.getInt("id_ingrediente"));
                objEsto.setIngrediente(rs.getString("ingrediente"));
                objEsto.setQuantidade(rs.getInt("quantidade"));
                objEsto.setIdFornecedor(rs.getInt("id_fornecedor"));
                
                
               lista.add(objEsto);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"EstoDAO filtrar(1) " + e);
        }
        
       return lista; 
    }
      
       public void excluirEstoque(estoque objestoque){
        String comando = "delete from estoque where id_ingrediente = ?";

        conEsto = new conexaoDAO().conectaBD();
        
        try {
            prep = conEsto.prepareStatement(comando);  
            prep.setInt(1,objestoque.getIdIngrediente());
            
            prep.execute();
            prep.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "EstoDAO Excluir " + e);

        }
    }
       
       
    }
