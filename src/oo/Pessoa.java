package oo;

public abstract class Pessoa {
	private String nome;
	private String cidade;

	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public String getcidade() {
		return cidade;
	}

	public void setcidade(String cidade) {
		this.cidade = cidade;
	}

	public abstract void validarRegistro();
}
