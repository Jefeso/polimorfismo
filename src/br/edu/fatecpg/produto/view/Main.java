package br.edu.fatecpg.produto.view;
import br.edu.fatecpg.produto.model.Produto;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
		String nome = "Tenis";
		int qntd = 5;
		Double preco = 350.99;
		

		Produto produtoN = new Produto(nome);
		
		Produto produtoP = new Produto(nome,preco);
		
		Produto produtoE = new Produto(nome,preco,qntd);
		
	System.out.println(produtoN.nome);
	
	System.out.println(produtoP.nome);
	System.out.println(produtoP.preco);
	
	System.out.println(produtoE.nome);
	System.out.println(produtoE.preco);
	System.out.println(produtoE.estoque);
}
}