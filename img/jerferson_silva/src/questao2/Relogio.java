package questao2;

public class Relogio {
	private int codigoRelogio;
	private String descricao;
	private String marca;
	private String tipo;
	
	
	//Construtor padrão
	public Relogio() {
		
	}
	
	//Construtor
	public Relogio(int codigoRelogio, String descricao, String marca, String tipo) {
		this.codigoRelogio = codigoRelogio;
		this.descricao = descricao;
		this.marca = marca;
		this.tipo = tipo;
	}
	
	public int getCodigoRelogio() {
		return codigoRelogio;
	}
	public void setCodigoRelogio(int codigoRelogio) {
		this.codigoRelogio = codigoRelogio;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
