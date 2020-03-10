package herancaExercicio;

//Classe abstrata não pode ser instanciada
public abstract class Veiculo {

	private String marca;
	private String modelo;
	private int velocidade;
	protected int velocidadeMaxima;
	private static final int VELOCIDADE_MINIMA = 0;

	//CONSTRUTORES NÃO FORNECEM HERANÇA
	public Veiculo(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void acelerar(int aceleracao) {
		if(this.velocidade + aceleracao < this.velocidadeMaxima) {
			this.velocidade += aceleracao;
		} else {
			this.velocidade = this.velocidadeMaxima;
		}
	}

	public void frear(int frenagem) {
		if(this.velocidade - frenagem > VELOCIDADE_MINIMA) {
			this.velocidade -= frenagem;
		} else {
			this.velocidade = VELOCIDADE_MINIMA;
		}
	}
}