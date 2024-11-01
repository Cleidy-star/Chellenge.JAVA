package formcar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import formcar.beans.Cliente;
import formcar.conexoes.ConexaoFactory;

public class ClienteDAO {

    private Connection minhaConexao;

    public ClienteDAO() throws ClassNotFoundException, SQLException {
        super();
        this.minhaConexao = ((ConexaoFactory) new ConexaoFactory()).conexao();
    }

    // Insert
    public String inserir(Cliente cliente) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
            "INSERT INTO TB_CLIENTE (id_cliente, nome_cliente, cpf_cliente, endereco_cliente) VALUES (?, ?, ?, ?)"
        );
        stmt.setInt(1, cliente.getIdCliente());
        stmt.setString(2, cliente.getNomeCliente());
        stmt.setString(3, cliente.getCpfCliente());
        stmt.setString(4, cliente.getEnderecoCliente());
        
        stmt.execute();
        stmt.close();
        
        return "Cliente cadastrado com sucesso!";
    }

    // Delete
    public String deletar(int idCliente) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
            "DELETE FROM TB_CLIENTE WHERE id_cliente = ?"
        );
        stmt.setInt(1, idCliente);
        
        stmt.execute();
        stmt.close();
        
        return "Cliente deletado com sucesso!";
    }

    // Update
    public String atualizar(Cliente cliente) throws SQLException {
        PreparedStatement stmt = minhaConexao.prepareStatement(
            "UPDATE TB_CLIENTE SET nome_cliente = ?, cpf_cliente = ?, endereco_cliente = ? WHERE id_cliente = ?"
        );
        stmt.setString(1, cliente.getNomeCliente());
        stmt.setString(2, cliente.getCpfCliente());
        stmt.setString(3, cliente.getEnderecoCliente());
        stmt.setInt(4, cliente.getIdCliente());
        
        stmt.executeUpdate();
        stmt.close();
        
        return "Cliente atualizado com sucesso!";
    }

    // Select
    public List<Cliente> selecionar() throws SQLException {
        List<Cliente> listaClientes = new ArrayList<>();
        
        PreparedStatement stmt = minhaConexao.prepareStatement(
            "SELECT * FROM TB_CLIENTE"
        );
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(rs.getInt("id_cliente"));
            cliente.setNomeCliente(rs.getString("nome_cliente"));
            cliente.setCpfCliente(rs.getString("cpf_cliente"));
            cliente.setEnderecoCliente(rs.getString("endereco_cliente"));
            
            listaClientes.add(cliente);
        }
        
        rs.close();
        stmt.close();
        
        return listaClientes;
    }
}
