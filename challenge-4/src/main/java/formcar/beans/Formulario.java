package formcar.beans;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.gson.annotations.SerializedName;
@	XmlRootElement
public class Formulario {

	    private static int nextId = 1;  // ID incremental para gerar identificadores únicos

	    @SerializedName("id")
	    private int id;

	    @SerializedName("perguntas")
	    private String[] perguntas;

	    @SerializedName("respostas")
	    private boolean[] respostas;

	    // Construtor padrão que gera o ID automaticamente e inicializa perguntas e respostas
	    public Formulario() {
	        this.id = nextId++; // Define o ID automaticamente e incrementa
	        perguntas = new String[] {
	            "Está escutando ruído vindo do veículo ao passar por lombadas e buracos?",
	            "Está escutando um barulho contínuo nas rodas?",
	            "Escuta um rangido na hora de pisar no freio?",
	            "O volante está trepidando?",
	            "Notou algum vazamento de óleo?",
	            "Notou a saída de uma fumaça azul do veículo?",
	            "E quanto a saída de uma fumaça preta?",
	            "Notou algum vazamento de água?"
	        };
	        respostas = new boolean[perguntas.length];
	    }

	    // Getter para o ID
	    public int getId() {
	        return id;
	    }

	    // Getter e Setter para perguntas e respostas
	    public String getPergunta(int index) {
	        return perguntas[index];
	    }

	    public void setResposta(int index, boolean resposta) {
	        respostas[index] = resposta;
	    }

	    public boolean getResposta(int index) {
	        return respostas[index];
	    }

	    public int getNumeroDePerguntas() {
	        return perguntas.length;
	    }

	    // Método para exibir apenas as perguntas respondidas com "Sim"
	    public void exibirRespostasSim() {
	        System.out.println("\n--- Respostas do Questionário (Sim) ---");
	        for (int i = 0; i < perguntas.length; i++) {
	            if (respostas[i]) {
	                System.out.println(perguntas[i].substring(0, perguntas[i].length() - 1));
	            }
	        }
	    }
	}
