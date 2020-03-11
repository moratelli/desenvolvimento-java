package oo;

import java.util.Date;

public class PessoaFisica extends Pessoa implements IPessoa {
	private long cpf;
	private Date dataNascimento;

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public void validarRegistro() {
		//Validar CPF
	}

	@Override
	public void salvar() {

	}

	@Override
	public void excluir() {

	}

	@Override
	public void alterar() {

	}
}
