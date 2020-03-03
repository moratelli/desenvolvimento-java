package teste;

import oo.Motorista;
import oo.Veiculo;
import oo.Estado;
import oo.Cidade;

public class testeVeiculo {
	public static void main(String[] args) {

		Veiculo v = new Veiculo();
		v.setVelocidadeMaxima(200);
		v.acelerar(100);
		System.out.println(v.getVelocidade());

		Motorista m = new Motorista();
		m.setNome("Pedro");
		m.setCnh(123123123);

		v.setMotorista(m);

		System.out.println(v.getMotorista().getNome());

		Estado e = new Estado();
		e.setUf("SC");

		Cidade c = new Cidade();
		c.setCidade("Florianópolis");
		c.setEstado(e);

		m.setCidade(c);

		System.out.println(v.getMotorista().getCidade().getEstado().getUf());

	}
}
