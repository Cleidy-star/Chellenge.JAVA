package formcar.beans;
import com.google.gson.annotations.SerializedName;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@Entity
	@Table(name = "TB_OFICINA")
	public class Oficina {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @SerializedName("id_oficina")
	    private int idOficina;

	    @SerializedName("nome_oficina")
	    private String nomeOficina;

	    @SerializedName("endereco_oficina")
	    private String enderecoOficina;

	    @SerializedName("funcionarios_oficina")
	    private int funcionariosOficina;

	    // Construtores, Getters e Setters
	    public Oficina() {}

	    public Oficina(String nomeOficina, String enderecoOficina, int funcionariosOficina) {
	        this.nomeOficina = nomeOficina;
	        this.enderecoOficina = enderecoOficina;
	        this.funcionariosOficina = funcionariosOficina;
	    }

	    public int getIdOficina() {
	        return idOficina;
	    }

	    public void setIdOficina(int idOficina) {
	        this.idOficina = idOficina;
	    }

	    public String getNomeOficina() {
	        return nomeOficina;
	    }

	    public void setNomeOficina(String nomeOficina) {
	        this.nomeOficina = nomeOficina;
	    }

	    public String getEnderecoOficina() {
	        return enderecoOficina;
	    }

	    public void setEnderecoOficina(String enderecoOficina) {
	        this.enderecoOficina = enderecoOficina;
	    }

	    public int getFuncionariosOficina() {
	        return funcionariosOficina;
	    }

	    public void setFuncionariosOficina(int funcionariosOficina) {
	        this.funcionariosOficina = funcionariosOficina;
	    }
	}
