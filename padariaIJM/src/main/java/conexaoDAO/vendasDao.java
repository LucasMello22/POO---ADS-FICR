package conexaoDAO;
import conexaoDAO.conexaoDAO;
import gerenVendas.vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

 
public class vendasDao {
    Connection conVendas;
    PreparedStatement prep;
    ResultSet rs;
    ArrayList<vendas> lista = new ArrayList<>();
    
     public void cadastrarVendas(vendas objVendas) {
        String comando = "insert Into venda(cpf, itens, preco, matricula) values (?, ?, ?, ?)";

        conVendas = new conexaoDAO().conectaBD();
     
        try {
            prep = conVendas.prepareStatement(comando);
            prep.setString (1,objVendas.getCpf());
            prep.setString(2,objVendas.getItens());
            prep.setDouble(3,objVendas.getPreco());
            prep.setInt(4,objVendas.getMatricula());
                  
            prep.execute();
            prep.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "VendasDAO cadastrar " + e);

        }

    }

    
    public ArrayList<vendas> listarVendas(){
        String comando = "select * from venda";
        conVendas = new conexaoDAO().conectaBD();
        try {
            prep = conVendas.prepareStatement(comando);
            rs = prep.executeQuery();
            
            while (rs.next()) {
                vendas objVendas = new vendas();
                objVendas.setId_vendas(rs.getInt("id_venda"));
                objVendas.setCpf(rs.getString("cpf"));
                objVendas.setItens(rs.getString("itens"));
                objVendas.setPreco(rs.getDouble("preco"));
                objVendas.setMatricula(rs.getInt("matricula"));
                
               lista.add(objVendas);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"VendasDAO listar " + e);
        }
       return lista; 
    }
    
    
    public void alterarVendas(vendas objVendas){
       String comando = "update venda set cpf = ?, itens = ?, preco = ?, matricula = ? where id_venda = ?";

        conVendas = new conexaoDAO().conectaBD();
        
        try {
            prep = conVendas.prepareStatement(comando);
            prep.setString (1,objVendas.getCpf());
            prep.setString(2,objVendas.getItens());
            prep.setDouble(3,objVendas.getPreco());
            prep.setInt(4,objVendas.getMatricula());
            prep.setInt(5,objVendas.getId_vendas());
            
            prep.execute();
            prep.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "VendasDAO Alterar " + e);

        }
        
    }
    public void excluirVendas(vendas objVendas){
        String comando = "delete from venda where id_venda = ?";

        conVendas = new conexaoDAO().conectaBD();
        
        try {
            prep = conVendas.prepareStatement(comando);  
            prep.setInt(1,objVendas.getId_vendas());
            
            prep.execute();
            prep.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "VendasDAO Excluir " + e);

        }
    }
}