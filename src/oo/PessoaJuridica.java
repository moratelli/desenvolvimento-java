package oo;

public class PessoaJuridica extends Pessoa implements IPessoa {
	private long cnpj;
	private String razaoSocial;

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	@Override
	public void validarRegistro() {
		//Validar CNPJ
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
