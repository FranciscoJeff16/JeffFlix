package questao1;

public class Empregado {
	private String CPF;
	private String nome;
	private String cargo;
	private Boolean feriasSuspensas = false;
	
	
	//Construtor padrão
	public Empregado() {
		
	};
	
	
	//Contrutor
	public Empregado(String cPf, String nome, String cargo) {
		CPF = cPf;
		this.nome = nome;
		this.cargo = cargo;
	}
	
	//Função para declarar férias para um funcionário, se for permitido tirar férias.
	public void tirarFerias(int quantidade) {
		if(feriasSuspensas != false) {
			System.out.println("Fucionário " + this.nome + " está de férias por " + quantidade + " dias");
		}else {
			System.out.println("Os funcionários não podem tirar férias.");
		}
		
	}
	
	
	
	//Getters e Setters dos atributos privados
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Boolean getFeriasSuspensas() {
		return feriasSuspensas;
	}

	public void setFeriasSuspensas(Boolean feriasSuspensas) {
		this.feriasSuspensas = feriasSuspensas;
	}
	

}
