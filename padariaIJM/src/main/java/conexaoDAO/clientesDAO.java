package conexaoDAO;


import conexaoDAO.conexaoDAO;
import gerenClientes.clientes;

import gerenEsto.estoque;
import gerenForne.fornecedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class clientesDAO {
            Connection conClientes;
            PreparedStatement prep;
            ResultSet rs;
            ArrayList<clientes> lista = new ArrayList<>();

            public void cadastrarClientes(clientes objClientes) {
                String comando = "insert Into cliente(cpf, nome, telefone, email, endereco) values (?, ?, ?, ?, ?)";

                conClientes = new conexaoDAO().conectaBD();

                try {
                    prep = conClientes.prepareStatement(comando);
                    prep.setString (1,objClientes.getCpf());
                    prep.setString(2,objClientes.getNome());
                    prep.setString(3,objClientes.getTelefone());
                    prep.setString(4,objClientes.getEmail());
                    prep.setString(5,objClientes.getEndereco());

                    prep.execute();
                    prep.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ClientesDAO cadastrar " + e);

                }

            }


            public ArrayList<clientes> listarClientes(){
                String comando = "select * from cliente";
                conClientes = new conexaoDAO().conectaBD();
                try {
                    prep = conClientes.prepareStatement(comando);
                    rs = prep.executeQuery();

                    while (rs.next()) {
                        clientes objClientes = new clientes();
                        objClientes.setCpf(rs.getString("cpf"));
                        objClientes.setNome(rs.getString("nome"));
                        objClientes.setTelefone(rs.getString("telefone"));
                        objClientes.setEmail(rs.getString("email"));
                        objClientes.setEndereco(rs.getString("endereco"));

                        lista.add(objClientes);
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null,"ClientesDAO listar " + e);
                }
                return lista;
            }


            public void alterarClientes(clientes objClientes){
                String comando = "update cliente set nome = ?, telefone = ?, email = ?, endereco = ? where cpf = ?";

                conClientes = new conexaoDAO().conectaBD();

                try {
                    prep = conClientes.prepareStatement(comando);
                    prep.setString (5,objClientes.getCpf());
                    prep.setString(1,objClientes.getNome());
                    prep.setString(2,objClientes.getTelefone());
                    prep.setString(3,objClientes.getEmail());
                    prep.setString(4,objClientes.getEndereco());
 

                    prep.execute();
                    prep.close();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ClientesDAO Alterar " + e);

                }

            }
            public void excluirClientes(clientes objClientes){
                String comando = "delete from cliente where cpf = ?";

                conClientes = new conexaoDAO().conectaBD();

                try {
                    prep = conClientes.prepareStatement(comando);
                    prep.setString(1,objClientes.getCpf());

                    prep.execute();
                    prep.close();

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "ClientesDAO Excluir " + e);

                }
            }
        }
    

