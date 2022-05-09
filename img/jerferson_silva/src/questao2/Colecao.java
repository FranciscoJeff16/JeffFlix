package questao2;

public class Colecao {
	
	// Define uma variável para valer como máximo na coleção
	static final int quantRelogios = 5;
	int contador = 0;
	private Relogio r1 = new Relogio();
	private Relogio r2 = new Relogio();
	private Relogio r3 = new Relogio();
	private Relogio r4 = new Relogio();
	private Relogio r5 = new Relogio();
	
	
	//O metódo alem de receber um relógio, ele também recebe um valor inteiro para
	//servir como controle de localização. Ou seja, dependendo de qual valor eu atribuo 
	// para "i", ele vai está na primera, segunda, terceira, quarta ou quinta posição.
	
	public void adicionarRelogio(Relogio rlg, int i) {
		if(contador < quantRelogios) {
			switch (i) {
			case 1:
				r1 = rlg;
				System.out.println(rlg.getDescricao() + " adicionado na colecão");
				break;
			case 2:
				r2 = rlg;
				System.out.println(rlg.getDescricao() + " adicionado na colecão");
				break;
			case 3:
				r3 = rlg;
				System.out.println(rlg.getDescricao() + " adicionado na colecão");
				break;
			case 4:
				r4 = rlg;
				System.out.println(rlg.getDescricao() + " adicionado na colecão");
				break;
			case 5:
				r5 = rlg;
				System.out.println(rlg.getDescricao() + " adicionado na colecão");
				break;
			}
			contador++;					
			}else
				System.out.println("Não é possível adicionar. Coleção cheia.");
		}
	
	//Fazendo a busca e imprimindo a marca
	public void buscaRelogio(Relogio rlg) {
		if(r1 == rlg) {
			System.out.println("Relógio encontrado a marca é " + rlg.getMarca());
		}else if(r2 == rlg) {
			System.out.println("Relógio encontrado a marca é " + rlg.getMarca());
		}else if(r3 == rlg) {
			System.out.println("Relógio encontrado a marca é " + rlg.getMarca());
		}else if(r4 == rlg) {
			System.out.println("Relógio encontrado a marca é " + rlg.getMarca());
		}else if(r5 == rlg) {
			System.out.println("Relógio encontrado a marca é " + rlg.getMarca());
		}else {
			System.out.println("Relógio não encontrado.");
		}
	}
}
