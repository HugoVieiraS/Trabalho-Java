package br.com.hugovieira.trabalho.unifcv;

import java.util.List;

public class Exercicio5 {

	public void calcularMedia(List<Integer> media) {
		Integer mediaNotas = (media.get(0) + media.get(1) + media.get(2) + media.get(3)) / 4;

		if (mediaNotas >= 6) {
			System.out.println("MÉDIA " + mediaNotas + " APROVADO");
		} else {
			System.out.println("MEDIA " + mediaNotas + " REPROVADO, VOCE FICARA DE EXAME FINAL");
		}

	}
}
