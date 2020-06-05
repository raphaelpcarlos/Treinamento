package classes;


public class Carro extends Produtos {

	public Carro(String tipo, int valor,int qtdPortas, EnumTIpo enumTIpo) {
		super(tipo, valor, enumTIpo);
		this.qtdPortas = qtdPortas;
	}
	
	
	public Carro(String tipo, int valor,int qtdPortas) {
		super(tipo, valor);
		this.qtdPortas = qtdPortas;
	}
	
	

	private int qtdPortas;


	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	
}
