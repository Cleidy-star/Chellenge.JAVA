package formcar.beans;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.annotations.SerializedName;
@XmlRootElement
public class Login {

	    private static int nextId = 1; // ID incremental para gerar identificadores únicos, se necessário

	    @SerializedName("id_cliente")
	    private int idCliente; // ID do cliente associado ao login

	    @SerializedName("senha")
	    private String senha;

	    @SerializedName("login")
	    private String login;

	    // Construtor padrão
	    public Login() {
	        this.idCliente = nextId++; // Define o ID automaticamente e incrementa
	    }

	    // Construtor completo que permite definir todos os atributos
	    public Login(int idCliente, String senha, String login) {
	        this.idCliente = idCliente;
	        this.senha = senha;
	        this.login = login;
	    }

	    // Getters e Setters
	    public int getIdCliente() {
	        return idCliente;
	    }

	    public void setIdCliente(int idCliente) {
	        this.idCliente = idCliente;
	    }

	    public String getSenha() {
	        return senha;
	    }

	    public void setSenha(String senha) {
	        this.senha = senha;
	    }

	    public String getLogin() {
	        return login;
	    }

	    public void setLogin(String login) {
	        this.login = login;
	    }
	}
