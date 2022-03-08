package br.unicamp.ic.inf335;

import java.util.ArrayList;

public class Loja {
	 
	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		// Novo Comentário - INF 335
		Produto prod = new Produto("Livro 1",100);
		produtos.add(prod);
		prod = new Produto("Sapato ",150);
		produtos.add(prod);
		
		for (int i=0; i<produtos.size(); i++) {
			System.out.println("Nome do Produto = " + produtos.get(i).getNome()
					+ " - Valor = " + produtos.get(i).getValor());
		}
		
	}
}
