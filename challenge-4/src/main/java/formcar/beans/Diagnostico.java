package formcar.beans;
import com.google.gson.annotations.SerializedName;
import java.sql.Timestamp;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Diagnostico {

    private static int nextId = 1; // ID incremental para gerar identificadores únicos

    @SerializedName("id_diagnostico")
    private int idDiagnostico;

    @SerializedName("data_hora")
    private Timestamp dataHora;

    @SerializedName("formulario")
    private Formulario formulario; // Relacionamento com a classe Formulario

    // Construtor padrão que gera o ID automaticamente
    public Diagnostico() {
        this.idDiagnostico = nextId++; // Define o ID automaticamente e incrementa
    }

    // Construtor completo que permite definir todos os atributos
    public Diagnostico(Timestamp dataHora, Formulario formulario) {
        this.idDiagnostico = nextId++; // Define o ID automaticamente e incrementa
        this.dataHora = dataHora;
        this.formulario = formulario;
    }

    // Getters e Setters
    public int getIdDiagnostico() {
        return idDiagnostico;
    }

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }
}
