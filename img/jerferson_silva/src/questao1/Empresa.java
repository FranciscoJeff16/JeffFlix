package questao1;
import java.util.ArrayList;

public class Empresa {
	/*Professor, resolvi usar uma lógica diferente, mas mantendo a mesma proposta
	 * eu estou utilizando a classe ArrayList para adicionar os empregados na empresa
	 * assim eu controle e matenho os dados dos funcionarios
	 * */
	
	static final int capFuncionarios = 10; // quantidade máxima de empregados
	private ArrayList<Empregado> quadroFuncionarios = new ArrayList<Empregado>();
	int funcionariosAtual = 1;
	
	
	//Para relacionar o empregado a empresa, eu fiz uma função de contratar.
	//Ela registra os funcionarios na empresa.
	public void contratar(Empregado empr) {
		if(funcionariosAtual <= capFuncionarios) {
			quadroFuncionarios.add(empr);
			System.out.println(empr.getNome() + " contrado com sucesso.");
			funcionariosAtual++;
		}else {
				System.out.println("Quantidade máxima de funcionários contrado.");
				return;
		}
	}
	
	
	//Função para exebir os atuais funcionários
	public void mostrar() {
		for(int i = 0;i < quadroFuncionarios.size();i++) {
			System.out.println(i + " - " + quadroFuncionarios.get(i).getNome());
		}
	}
	
	
	//Função que permite as férias para todos os funcionários, dando true em 
	//feriasSuspensas.
	public void ferias() {
		for(int i = 0;i < quadroFuncionarios.size();i++) {
			quadroFuncionarios.get(i).setFeriasSuspensas(true);
		}
	}
	
	//Funções getters e setters
	public ArrayList<Empregado> getQuadroFuncionarios() {
			return quadroFuncionarios;
		}
	
		public void setQuadroFuncionarios(ArrayList<Empregado> quadroFuncionarios) {
			this.quadroFuncionarios = quadroFuncionarios;
		}
}
