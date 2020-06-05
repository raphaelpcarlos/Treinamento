package classes;

public class Acrescimo {
	
	private int porcentagem;
	private int novoValor;

		
	public Acrescimo(Produtos produto) {
	}

	public int getNovoValor() {
		return novoValor;
	}

	public void setNovoValor(int novoValor) {
		this.novoValor = novoValor;
	}

	public int getPorcentagem() {
		return porcentagem;
	}

	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	public void somar(int porcent, Produtos p) {
		
		this.novoValor = p.getValor() * porcent;
		
		System.out.println("Valor com acrescimo: " +novoValor);
	}

}
