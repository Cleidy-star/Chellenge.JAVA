package formcar.beans;
import javax.xml.bind.annotation.XmlRootElement;
import com.google.gson.annotations.SerializedName;
@XmlRootElement
public class Cliente {


	    private static int nextId = 1;  // ID incremental, semelhante ao exemplo de Citacao

	    @SerializedName("id_cliente")
	    private int idCliente;  // Mapeia o ID da coluna para o JSON
	    
	    @SerializedName("nome_cliente")
	    private String nomeCliente;  // Mapeia o nome para o JSON
	    
	    @SerializedName("cpf_cliente")
	    private String cpfCliente;  // Mapeia o CPF para o JSON
	    
	    @SerializedName("endereco_cliente")
	    private String enderecoCliente;  // Mapeia o endereço para o JSON

	    // Construtor principal que recebe os atributos
	    public Cliente(String nomeCliente, String cpfCliente, String enderecoCliente) {
	        this.idCliente = nextId++; // Define o ID automaticamente e incrementa
	        this.nomeCliente = nomeCliente;
	        this.cpfCliente = cpfCliente;
	        this.enderecoCliente = enderecoCliente;
	    }

	    // Construtor vazio que também define um ID automaticamente
	    public Cliente() {
	        this.idCliente = nextId++;
	    }

	    // Getters e Setters
	    public int getIdCliente() {
	        return idCliente;
	    }

	    public void setIdCliente(int idCliente) {
	        this.idCliente = idCliente;
	    }

	    public String getNomeCliente() {
	        return nomeCliente;
	    }

	    public void setNomeCliente(String nomeCliente) {
	        this.nomeCliente = nomeCliente;
	    }

	    public String getCpfCliente() {
	        return cpfCliente;
	    }

	    public void setCpfCliente(String cpfCliente) {
	        this.cpfCliente = cpfCliente;
	    }

	    public String getEnderecoCliente() {
	        return enderecoCliente;
	    }

	    public void setEnderecoCliente(String enderecoCliente) {
	        this.enderecoCliente = enderecoCliente;
	    }
	}
