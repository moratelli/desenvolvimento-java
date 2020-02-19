package oo;

public class Produto {
	int codigo;
	String nome;
	int quantidade;
	double preco;
	double precoCusto;
	static String marca;

	double calcularValorTotal() {
		return quantidade * preco;
	}
}
