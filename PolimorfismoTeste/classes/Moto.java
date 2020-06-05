package classes;

public class Moto extends Produtos{

	private int cilidrada;

	
	public Moto(String tipo, int valor, int cilindrada) {
		super(tipo, valor);
		this.cilidrada = cilindrada;

	}

	public int getCilidrada() {
		return cilidrada;
	}

	public void setCilidrada(int cilidrada) {
		this.cilidrada = cilidrada;
	}

	
	
}
