package questao1;

public class Principal {
	public static void main(String[] args) {
		//Estanciando 3 funcionários
		Empregado emp1 = new Empregado("781-121-12","William","Analista");
		Empregado emp2 = new Empregado("781-121-12","jef","Analista");
		Empregado emp3 = new Empregado("781-121-12","larissa","Analista");
		
		//Estanciando uma empresa
		Empresa empre = new Empresa();
		//contratando funcionarios
		empre.contratar(emp1);
		empre.contratar(emp3);
		empre.contratar(emp2);
		empre.mostrar();
		
		//Tentando tirar ferias
		emp1.tirarFerias(10);
		
		//Autorizando ferias
		empre.ferias();
		
		emp1.tirarFerias(10);
		
		
	}

}
