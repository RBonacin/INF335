package br.unicamp.ic.inf335;

public class Produto {
	private String Nome;
	private int Valor;
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Produto(String nome, int valor) {
		super();
		Nome = nome;
		Valor = valor;
	}
	public int getValor() {
		return Valor;
	}
	public void setValor(int valor) {
		Valor = valor;
	}
}
