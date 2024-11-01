package formcar.beans;

import com.google.gson.annotations.SerializedName;
import javax.persistence.*;

@Entity
@Table(name = "TB_FORMULARIO_PERGUNTAS")
public class FormularioPerguntas {

    private static int nextId = 1;  // ID incremental para gerar identificadores únicos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SerializedName("id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "tb_formulario_id_formulario_fk", nullable = false)
    @SerializedName("formulario")
    private Formulario formulario;

    @ManyToOne
    @JoinColumn(name = "tb_perguntas_id_perguntas_fk", nullable = false)
    @SerializedName("pergunta")
    private Perguntas perguntas;

    // Construtor padrão que gera ID automaticamente
    public FormularioPerguntas() {
        this.id = nextId++; // Define o ID automaticamente e incrementa
    }

    // Construtor completo que permite definir formulário e pergunta
    public FormularioPerguntas(Formulario formulario, Perguntas perguntas) {
        this.id = nextId++; // Define o ID automaticamente e incrementa
        this.formulario = formulario;
        this.perguntas = perguntas;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public Perguntas getPerguntas() {
        return perguntas;
    }

    public void setPerguntas(Perguntas perguntas) {
        this.perguntas = perguntas;
    }
}
