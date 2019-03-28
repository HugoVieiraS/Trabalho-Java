package br.com.hugovieira.trabalho.unifcv;

public class Exercicio6 {
	public void calcularDias(int dia) {
		int ano = 0;
		int mes = 0;
		int dias = 0;
		while (dia > 0) {

			while (dia > 365) {
				ano = ano + 1;
				dia = dia - 365;
			}
			while (dia > 30) {
				mes = mes + 1;
				dia = dia - 30;
			}
			dias = dia;
			dia = 0;
		}
		System.out.printf("Você tem %d anos, %d meses e  %d dias de existencia", ano, mes, dias);

	}

}
