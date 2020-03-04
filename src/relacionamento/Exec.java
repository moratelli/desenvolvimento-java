package relacionamento;

public class Exec {
	public static void main(String[] args) {

		Pais pais = new Pais();
		pais.setNome("Brasil");

		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Centauro");
		fornecedor.setCnpj(123123123);
		fornecedor.setPais(pais);

		Marca marca = new Marca();
		marca.setNome("Penalty");
		marca.setFornecedor(fornecedor);

		Produto produto = new Produto();
		produto.setNome("Bola de Futsal MAX 500");
		produto.setPreco(99.50);
		produto.setMarca(marca);

		System.out.println(
				produto.getNome() + " " + produto.getMarca().getNome() + " -  R$ " + produto.getPreco()
		);
		System.out.println(
				"Vendido por: " +
						produto.getMarca().getFornecedor().getNome() + " (" +
						produto.getMarca().getFornecedor().getPais().getNome() + ")");

	}
}
