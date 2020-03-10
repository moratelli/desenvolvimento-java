package herancaExercicio;

public class TesteHeranca {
	public static void main(String[] args) {
		Carro celta = new Carro(300);
		celta.setMarca("Chevrolet");
		celta.setModelo("Celta");
		celta.setPortas(4);
		celta.setImportado(false);
		celta.acelerar(80);

		Moto cg = new Moto(200);
		cg.setMarca("Honda");
		cg.setModelo("CG150");
		cg.setCilindradas(150);
		cg.setBau(true);

		Lancha lanchaTop = new Lancha(200);
		lanchaTop.setMarca("Schaefer");
		lanchaTop.setModelo("640");
		lanchaTop.setCapacidade(24);
		lanchaTop.setMotor("Centro");

		BicicletaMotor bike = new BicicletaMotor(50);
		bike.setMarca("Monark");
		bike.setModelo("Pica Top");
		bike.acelerar(60);
		bike.ligarMotor();
		bike.acelerar(50);

		exibirVeiculo(bike);
	}

	private static void exibirVeiculo(Veiculo veiculo) {
		System.out.println("Marca: " + veiculo.getMarca() +
				"\nModelo: " + veiculo.getModelo() +
				"\nVelocidade Atual: " + veiculo.getVelocidade() + " km/h");
	}
}
