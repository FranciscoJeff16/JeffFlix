package questao1;
import java.util.ArrayList;

public class Empresa {
	/*Professor, resolvi usar uma l�gica diferente, mas mantendo a mesma proposta
	 * eu estou utilizando a classe ArrayList para adicionar os empregados na empresa
	 * assim eu controle e matenho os dados dos funcionarios
	 * */
	
	static final int capFuncionarios = 10; // quantidade m�xima de empregados
	private ArrayList<Empregado> quadroFuncionarios = new ArrayList<Empregado>();
	int funcionariosAtual = 1;
	
	
	//Para relacionar o empregado a empresa, eu fiz uma fun��o de contratar.
	//Ela registra os funcionarios na empresa.
	public void contratar(Empregado empr) {
		if(funcionariosAtual <= capFuncionarios) {
			quadroFuncionarios.add(empr);
			System.out.println(empr.getNome() + " contrado com sucesso.");
			funcionariosAtual++;
		}else {
				System.out.println("Quantidade m�xima de funcion�rios contrado.");
				return;
		}
	}
	
	
	//Fun��o para exebir os atuais funcion�rios
	public void mostrar() {
		for(int i = 0;i < quadroFuncionarios.size();i++) {
			System.out.println(i + " - " + quadroFuncionarios.get(i).getNome());
		}
	}
	
	
	//Fun��o que permite as f�rias para todos os funcion�rios, dando true em 
	//feriasSuspensas.
	public void ferias() {
		for(int i = 0;i < quadroFuncionarios.size();i++) {
			quadroFuncionarios.get(i).setFeriasSuspensas(true);
		}
	}
	
	//Fun��es getters e setters
	public ArrayList<Empregado> getQuadroFuncionarios() {
			return quadroFuncionarios;
		}
	
		public void setQuadroFuncionarios(ArrayList<Empregado> quadroFuncionarios) {
			this.quadroFuncionarios = quadroFuncionarios;
		}
}
