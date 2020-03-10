package herancaExercicio;

public class BicicletaMotor extends Veiculo {
	private boolean motorLigado;

	public BicicletaMotor(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void ligarMotor() {
		if(!this.motorLigado) {
			this.motorLigado = true;
			super.velocidadeMaxima *= 2;
		}
	}

	public void desligarMotor() {
		if(this.motorLigado){
			this.motorLigado = false;
			super.velocidadeMaxima /= 2;
		}
	}
}
