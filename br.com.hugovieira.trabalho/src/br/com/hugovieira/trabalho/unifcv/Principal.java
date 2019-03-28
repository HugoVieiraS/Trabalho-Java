package br.com.hugovieira.trabalho.unifcv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String... args) {

// Criando Objetos

		Exercicio1 maiorNumero = new Exercicio1();
		Exercicio2 menorNumero = new Exercicio2();
		Exercicio3 calculoSucessor = new Exercicio3();
		Exercicio4 polindromo = new Exercicio4();
		Exercicio5 calcularMedia = new Exercicio5();
		Exercicio6 calcularDias = new Exercicio6();

/// Exercicio 1 
		System.out.println("---------------EXERCICIO 1 - IMPRIMIR MAIOR NUMERO---------------");
		Scanner ex1 = new Scanner(System.in);

		System.out.println("Digite o primeiro numero: \n");
		Integer valor1 = ex1.nextInt();
		System.out.println("Digite o segundo numero: \n");
		Integer valor2 = ex1.nextInt();
		System.out.println("O maior valor do método é: ");

		System.out.println(maiorNumero.maiorNumero(valor1, valor2));

/// Exercicio 2 
		System.out.println("---------------EXERCICIO 2 - MOSTRAR MAIOR E MENOR ---------------");
		Scanner ex2 = new Scanner(System.in);

		System.out.println("Digite um numero");
		int s = ex2.nextInt();
		System.out.println("Digite outro numero");
		int g = ex2.nextInt();

		menorNumero.menorNumero(s, g);

/// Exercicio 3
		System.out.println("---------------EXERCICIO 3 - ANTECESSOR E SUCESSOR ---------------");

		Scanner ex3 = new Scanner(System.in);
		System.out.println("Digite um numero: \n");
		int num = ex3.nextInt();

		calculoSucessor.calculoSucessor(num);

/// Exercicio 4
		System.out.println("---------------EXERCICIO 4 - POLINDROMO ---------------");

		Scanner ex4 = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: \n");
		String palavra = ex4.next();

		Exercicio4.Polindromo(palavra);

/// Exercicio 5
		System.out.println("---------------EXERCICIO 5 - CALCULAR MEDIA ---------------");

		List<Integer> mediaNotas = new ArrayList<>();
		Scanner ex5 = new Scanner(System.in);

		System.out.println("Insira a primeira notas: ");
		mediaNotas.add(ex5.nextInt());
		System.out.println("Insira a segunda notas: ");
		mediaNotas.add(ex5.nextInt());
		System.out.println("Insira a terceira notas: ");
		mediaNotas.add(ex5.nextInt());
		System.out.println("Insira a quarta notas: ");
		mediaNotas.add(ex5.nextInt());

		calcularMedia.calcularMedia(mediaNotas);

/// Exercicio 6
		System.out.println(
				"---------------EXERCICIO 6 - CALCULAR DIAS E TRANSFORMAR EM ANOS, MESES E DIAS ---------------");
		Scanner ex6 = new Scanner(System.in);

		System.out.println("Digite um total de dias que você viveu");
		int i = ex6.nextInt();

		calcularDias.calcularDias(i);

		ex1.close();
		ex2.close();
		ex3.close();
		ex5.close();
		ex4.close();
		ex6.close();

	}

}
