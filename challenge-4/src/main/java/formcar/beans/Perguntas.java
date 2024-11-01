package formcar.beans;
import javax.xml.bind.annotation.XmlRootElement;
import com.google.gson.annotations.SerializedName;
@XmlRootElement
public class Perguntas {

	    private static int nextId = 1; // ID incremental para gerar identificadores únicos

	    @SerializedName("id")
	    private int id;

	    @SerializedName("pergunta")
	    private String pergunta; // Texto da pergunta

	    @SerializedName("respondidaSim")
	    private boolean respondidaSim; // Status da resposta (true para "Sim", false para "Não")

	    // Construtor padrão que gera o ID automaticamente
	    public Perguntas() {
	        this.id = nextId++; // Define o ID automaticamente e incrementa
	    }

	    // Construtor que permite definir o texto e o status da resposta
	    public Perguntas(String pergunta, boolean respondidaSim) {
	        this.id = nextId++; // Define o ID automaticamente e incrementa
	        this.pergunta = pergunta;
	        this.respondidaSim = respondidaSim;
	    }

	    // Getters e Setters
	    public int getId() {
	        return id;
	    }

	    public String getPergunta() {
	        return pergunta;
	    }

	    public void setPergunta(String pergunta) {
	        this.pergunta = pergunta;
	    }

	    public boolean isRespondidaSim() {
	        return respondidaSim;
	    }

	    public void setRespondidaSim(boolean respondidaSim) {
	        this.respondidaSim = respondidaSim;
	    }

	    // Método para exibir a pergunta se a resposta foi "Sim"
	    public void exibirPerguntaSeSim() {
	        if (respondidaSim) {
	            System.out.println(pergunta);
	        }
	    }
	}
