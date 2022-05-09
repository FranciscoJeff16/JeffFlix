package questao2;

public class Colecao {
	
	// Define uma vari�vel para valer como m�ximo na cole��o
	static final int quantRelogios = 5;
	int contador = 0;
	private Relogio r1 = new Relogio();
	private Relogio r2 = new Relogio();
	private Relogio r3 = new Relogio();
	private Relogio r4 = new Relogio();
	private Relogio r5 = new Relogio();
	
	
	//O met�do alem de receber um rel�gio, ele tamb�m recebe um valor inteiro para
	//servir como controle de localiza��o. Ou seja, dependendo de qual valor eu atribuo 
	// para "i", ele vai est� na primera, segunda, terceira, quarta ou quinta posi��o.
	
	public void adicionarRelogio(Relogio rlg, int i) {
		if(contador < quantRelogios) {
			switch (i) {
			case 1:
				r1 = rlg;
				System.out.println(rlg.getDescricao() + " adicionado na colec�o");
				break;
			case 2:
				r2 = rlg;
				System.out.println(rlg.getDescricao() + " adicionado na colec�o");
				break;
			case 3:
				r3 = rlg;
				System.out.println(rlg.getDescricao() + " adicionado na colec�o");
				break;
			case 4:
				r4 = rlg;
				System.out.println(rlg.getDescricao() + " adicionado na colec�o");
				break;
			case 5:
				r5 = rlg;
				System.out.println(rlg.getDescricao() + " adicionado na colec�o");
				break;
			}
			contador++;					
			}else
				System.out.println("N�o � poss�vel adicionar. Cole��o cheia.");
		}
	
	//Fazendo a busca e imprimindo a marca
	public void buscaRelogio(Relogio rlg) {
		if(r1 == rlg) {
			System.out.println("Rel�gio encontrado a marca � " + rlg.getMarca());
		}else if(r2 == rlg) {
			System.out.println("Rel�gio encontrado a marca � " + rlg.getMarca());
		}else if(r3 == rlg) {
			System.out.println("Rel�gio encontrado a marca � " + rlg.getMarca());
		}else if(r4 == rlg) {
			System.out.println("Rel�gio encontrado a marca � " + rlg.getMarca());
		}else if(r5 == rlg) {
			System.out.println("Rel�gio encontrado a marca � " + rlg.getMarca());
		}else {
			System.out.println("Rel�gio n�o encontrado.");
		}
	}
}
