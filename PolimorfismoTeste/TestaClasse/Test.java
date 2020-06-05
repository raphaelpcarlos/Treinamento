package TestaClasse;

import Relatorio.*;
import classes.*;
import classes.Produtos.EnumTIpo;

public class Test {
	public static void main(String[] args) {
		
		Carro carr02 = new Carro("Carro 02", 60000, 5, EnumTIpo.carro);

		Carro carro = new Carro("Carro", 2500, 4);
		
		Moto moto = new Moto("Moto", 15000, 1600);
		
		Relatorios relatorio = new Relatorios();
		
		relatorio.relatorioProduto(carro);
		
		Acrescimo aCarro = new Acrescimo(carro);

		
		//Teste de alteração	
		
		
		//jhkjh
		aCarro.somar(10, carro);
		
		System.out.println("\n__________+++__________\n");
		
		relatorio.relatorioProduto(moto);
		
		Acrescimo aMoto = new Acrescimo(moto);
		
		aMoto.somar(5, moto);
		
		System.out.println("\n__________+++__________\n");
		
		relatorio.relatorioProduto(carr02);
		//aCarro.somar(45, carr02);
		
	}
}
