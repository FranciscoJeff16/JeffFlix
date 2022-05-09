package questao2;

public class Colecionador {
	private String nome;
	private int codigoColecionador;
	private Colecao colec = new Colecao();
	
	//Construtor padrão
	public Colecionador() {
		
	}
	
	//Construtor
	public Colecionador(String nome, int codigoColecionador) {
		this.nome = nome;
		this.codigoColecionador = codigoColecionador;
	}

	
	//Getters e Setters 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Colecao getColec() {
		return colec;
	}

	public void setColec(Colecao colec) {
		this.colec = colec;
	}

	public int getCodigoColecionador() {
		return codigoColecionador;
	}

	public void setCodigoColecionador(int codigoColecionador) {
		this.codigoColecionador = codigoColecionador;
	}
}
