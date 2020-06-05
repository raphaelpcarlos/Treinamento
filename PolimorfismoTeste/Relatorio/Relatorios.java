package Relatorio;
import classes.*;

public class Relatorios {
	
	public void relatorioProduto(Produtos produto) {
	
		
		
		System.out.println("Tipo Produto: " +produto.getTipo());
		System.out.println("Valor Produto: " +produto.getValor());
		
		if(produto instanceof Carro) {
			
			Carro c = (Carro) produto;
			
			Acrescimo a = new Acrescimo(c);
			
			System.out.println("Quantidade de portas: " +c.getQtdPortas());
			System.out.println("Teste");
		}
		
		if(produto instanceof Moto) {
			
			Moto m = (Moto) produto;
			
			System.out.println("Cilidrada: " +m.getCilidrada());
		}
		
		
	}
}
