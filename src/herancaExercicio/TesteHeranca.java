package herancaExercicio;

public class TesteHeranca {
	public static void main(String[] args) {
		Carro celta = new Carro();
		celta.setMarca("Chevrolet");
		celta.setModelo("Celta");
		celta.setPortas(4);
		celta.setImportado(false);
		celta.setVelocidadeAtual(80);

		Moto cg = new Moto();
		cg.setMarca("Honda");
		cg.setModelo("CG150");
		cg.setCilindradas(150);
		cg.setBau(true);

		Lancha lanchaTop = new Lancha();
		lanchaTop.setMarca("Schaefer");
		lanchaTop.setModelo("640");
		lanchaTop.setCapacidade(24);
		lanchaTop.setMotor("Centro");

		exibirVeiculo(celta);
	}

	private static void exibirVeiculo(Veiculo veiculo) {
		System.out.println("Marca: " + veiculo.getMarca() +
				"\nModelo: " + veiculo.getModelo() +
				"\nVelocidade Atual: " + veiculo.getVelocidadeAtual() + " km/h");
	}
}
