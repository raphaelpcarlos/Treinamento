package classes;

public abstract class Produtos {

	public enum EnumTIpo {

		moto, carro;
	}

	protected String tipo;
	protected int valor;
	protected Acrescimo acresciomo;
	protected EnumTIpo EnumTipo;

	public Produtos(String tipo, int valor, EnumTIpo enumTIpo) {
		this.tipo = tipo;
		this.valor = valor;
		this.EnumTipo = enumTIpo;

	}

	public Produtos(String tipo, int valor) {
		this.tipo = tipo;
		this.valor = valor;

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Acrescimo getAcresciomo() {
		return acresciomo;
	}

	public void setAcresciomo(Acrescimo acresciomo) {
		this.acresciomo = acresciomo;
	}

	public void setEnumTipo(EnumTIpo enumTipo) {
		EnumTipo = enumTipo;
	}

}
