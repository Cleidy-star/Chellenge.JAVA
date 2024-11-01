package formcar.beans;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.annotations.SerializedName;
@XmlRootElement
public class DiagnosticoOficina {

    @SerializedName("diagnostico")
    private Diagnostico diagnostico; // Objeto Diagnostico associado

    @SerializedName("oficina")
    private Oficina oficina; // Objeto Oficina associado

    @SerializedName("orcamento")
    private Orcamento orcamento; // Objeto Orcamento associado

    // Construtor padrão
    public DiagnosticoOficina() {}

    // Construtor completo que permite definir todos os atributos
    public DiagnosticoOficina(Diagnostico diagnostico, Oficina oficina, Orcamento orcamento) {
        this.diagnostico = diagnostico;
        this.oficina = oficina;
        this.orcamento = orcamento;
    }

    // Getters e Setters
    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
}
