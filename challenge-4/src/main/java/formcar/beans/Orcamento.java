package formcar.beans;
import com.google.gson.annotations.SerializedName;
import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Orcamento {
	    private static int nextId = 1; // ID incremental para gerar identificadores únicos

	    @SerializedName("id")
	    private int id;

	    @SerializedName("valor_servico")
	    private double valorServico;

	    @SerializedName("data_orcamento")
	    private Timestamp dataOrcamento;

	    // Construtor padrão que gera o ID automaticamente
	    public Orcamento() {
	        this.id = nextId++; // Define o ID automaticamente e incrementa
	    }

	    // Construtor completo para definir valor do serviço e data do orçamento
	    public Orcamento(double valorServico, Timestamp dataOrcamento) {
	        this.id = nextId++; // Define o ID automaticamente e incrementa
	        this.valorServico = valorServico;
	        this.dataOrcamento = dataOrcamento;
	    }

	    // Getters e Setters
	    public int getId() {
	        return id;
	    }

	    public double getValorServico() {
	        return valorServico;
	    }

	    public void setValorServico(double valorServico) {
	        this.valorServico = valorServico;
	    }

	    public Timestamp getDataOrcamento() {
	        return dataOrcamento;
	    }

	    public void setDataOrcamento(Timestamp dataOrcamento) {
	        this.dataOrcamento = dataOrcamento;
	    }
	}
