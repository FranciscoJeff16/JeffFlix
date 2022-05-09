package questao2;

public class Principal {
	public static void main(String[] args) {
		Colecionador colecion = new Colecionador("Rubens", 192123);
		Colecao colec = new Colecao();
		colecion.setColec(colec);
		
		//Instancinado 3 relógios
		Relogio r1 = new Relogio(232,"Smart Watch","Amazon","Relogio Inteligente");
		Relogio r2 = new Relogio(145,"Smart View","Samsung","Relogio Inteligente");
		Relogio r3 = new Relogio(531,"Relogio de ouro","Lacoste","Relogio de Ponteiro");
		
		//Adicionando relogio 1 e relogio 2 na coleção
		colecion.getColec().adicionarRelogio(r1, 1);
		colecion.getColec().adicionarRelogio(r2, 2);
		
		//Buscando relogio na coleção
		colec.buscaRelogio(r1);
		
		//Buscando relógio 3 na coleção e não encontrando
		colec.buscaRelogio(r3);
		
		//Adicionando relógio 3 na coleção na posição 5
		colecion.getColec().adicionarRelogio(r3, 5);
		colec.buscaRelogio(r3);
		

	}

}
