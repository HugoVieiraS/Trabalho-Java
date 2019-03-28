package br.com.hugovieira.trabalho.unifcv;

public class Exercicio4 {

	public static boolean Polindromo(String palavra) {
		int meio = palavra.length() / 2;
		for (int i = 0; i < meio; i++) {
			if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}