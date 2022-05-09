package questao1;

public class Empregado {
	private String CPF;
	private String nome;
	private String cargo;
	private Boolean feriasSuspensas = false;
	
	
	//Construtor padr�o
	public Empregado() {
		
	};
	
	
	//Contrutor
	public Empregado(String cPf, String nome, String cargo) {
		CPF = cPf;
		this.nome = nome;
		this.cargo = cargo;
	}
	
	//Fun��o para declarar f�rias para um funcion�rio, se for permitido tirar f�rias.
	public void tirarFerias(int quantidade) {
		if(feriasSuspensas != false) {
			System.out.println("Fucion�rio " + this.nome + " est� de f�rias por " + quantidade + " dias");
		}else {
			System.out.println("Os funcion�rios n�o podem tirar f�rias.");
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
