package br.com.hugovieira.trabalho.unifcv;

public class Exercicio2 {
	public void menorNumero(Integer valor3, Integer valor4) {
		if (valor3 == valor4) {
			System.out.println("Esses numeros s�o iguais: ");
		} else {
			System.out.println("Esses numeros s�o diferentes: ");
			if (valor3 > valor4) {
				System.out.println("Esse � o numero maior " + valor3);
			} else if (valor4 > valor3) {
				System.out.println("Esse � o numero maior " + valor4);
			}
		}
	}
}
