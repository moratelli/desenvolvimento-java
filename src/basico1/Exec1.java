package basico1;

import basico.Exec;

public class Exec1 {

	public static void main(String[] args) {
		Exec.imprimir("Figueira Série D 2022");

		//Sobrecarga: métodos com mesma assinatura, diferindo no tipo e/ou número de parâmetros
		System.out.println();
		System.out.println("aaa");
		System.out.println(1);
		System.out.println(true);

		int x = somar(2, 4);
		double y = somar(4.5, 6.4);

	}

	//Meus métodos com sobrecarga
	private static int somar(int a, int b) {
		return a + b;
	}

	private static double somar(double a, double b) {
		return a + b;
	}
}