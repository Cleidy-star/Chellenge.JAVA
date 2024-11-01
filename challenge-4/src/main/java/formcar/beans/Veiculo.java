package formcar.beans;
import javax.xml.bind.annotation.XmlRootElement;
import com.google.gson.annotations.SerializedName;
@XmlRootElement
public class Veiculo {

	    private static int nextId = 1; // ID incremental para gerar identificadores únicos

	    @SerializedName("id_veiculo")
	    private int idVeiculo;

	    @SerializedName("marca")
	    private String marca;

	    @SerializedName("ano")
	    private String ano;

	    @SerializedName("modelo")
	    private String modelo;

	    @SerializedName("placa")
	    private String placa;

	    // Construtor padrão que gera o ID automaticamente
	    public Veiculo() {
	        this.idVeiculo = nextId++; // Define o ID automaticamente e incrementa
	    }

	    // Construtor completo que permite definir todos os atributos
	    public Veiculo(String marca, String ano, String modelo, String placa) {
	        this.idVeiculo = nextId++; // Define o ID automaticamente e incrementa
	        this.marca = marca;
	        this.ano = ano;
	        this.modelo = modelo;
	        this.placa = placa;
	    }

	    // Getters e Setters
	    public int getIdVeiculo() {
	        return idVeiculo;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getAno() {
	        return ano;
	    }

	    public void setAno(String ano) {
	        this.ano = ano;
	    }

	    public String getModelo() {
	        return modelo;
	    }

	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public String getPlaca() {
	        return placa;
	    }

	    public void setPlaca(String placa) {
	        this.placa = placa;
	    }
	}
